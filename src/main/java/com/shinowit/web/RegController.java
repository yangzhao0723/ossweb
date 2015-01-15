package com.shinowit.web;

import com.shinowit.dao.mapper.TbaMemberinfoMapper;
import com.shinowit.entity.TbaMemberinfo;
import com.shinowit.entity.TbaMemberinfoCriteria;
import com.shinowit.framework.convert.Email.SendHtmlMail;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;
import javax.validation.Valid;
import java.util.List;

/**
 * Created by Administrator on 2014/12/25.
 */
@Controller
public class RegController {
    @Resource
    private TbaMemberinfoMapper user_dao;
    @Resource
    private SendHtmlMail email1;

    @RequestMapping(value = "/reg", method = RequestMethod.GET)
    public String prepareNew(@ModelAttribute("user") TbaMemberinfo userInfo) {

        return "view/reg";
    }

    @RequestMapping(value = "/reg", method = RequestMethod.POST)
    public String prepareNew(@Valid @ModelAttribute("user") TbaMemberinfo userInfo, BindingResult bindingResult, RedirectAttributes redirectAttributes, @RequestParam("Validate_Code") String validate, HttpSession session, Model model) {
        if (bindingResult.hasErrors()) {
            return "view/reg";
        }
        if (!(session.getAttribute("rand").equals(validate))) {
            return "redirect:reg";
        }
        TbaMemberinfoCriteria criteria = new TbaMemberinfoCriteria();
        TbaMemberinfoCriteria.Criteria tiaojian = criteria.createCriteria();
        tiaojian.andUsernameEqualTo(userInfo.getUsername());
        try {
            List<TbaMemberinfo> b = user_dao.selectByExample(criteria);
            if (b.size() == 1) {
                redirectAttributes.addFlashAttribute("error","用户名已存在!");
//                return "redirect:reg";

            } else {
                int a;
                try {
                    a = user_dao.insert(userInfo);
                    if (a != 0) {
                        String str = "http://localhost:8080/login/values?username=" + userInfo.getUsername();
                        email1.sendMessage(userInfo.getEmail(), "用户激活", str);
                        return "redirect:login";
                    } else {

                        return "redirect:reg";
                    }

                } catch (Exception e) {
                    e.printStackTrace();

                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "redirect:reg";
    }
}




