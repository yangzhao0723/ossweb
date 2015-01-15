package com.shinowit.web;

import com.shinowit.dao.mapper.TbaMemberinfoMapper;
import com.shinowit.entity.TbaMemberinfo;
import com.shinowit.entity.TbaMemberinfoCriteria;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import javax.validation.Valid;
import java.util.List;

/**
 * Created by Administrator on 2014/12/28.
 */
@Controller
public class LoginController {
    @Resource
    private TbaMemberinfoMapper user_dao;

    @RequestMapping(value = "/login", method = RequestMethod.GET)
    public String login(@ModelAttribute("login") TbaMemberinfo userInfo) {
        return "view/login";
    }

    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public String login(@Valid @ModelAttribute("login") TbaMemberinfo userInfo, BindingResult bindingResult, HttpServletRequest request) {
        if (bindingResult.hasErrors()) {
            return "view/login";
        }

        TbaMemberinfoCriteria criteria = new TbaMemberinfoCriteria();
        TbaMemberinfoCriteria.Criteria tiaojian = criteria.createCriteria();
        tiaojian.andUsernameEqualTo(userInfo.getUsername());
        try{
            List<TbaMemberinfo> a = user_dao.selectByExample(criteria);

            if (a.size() == 1) {
                HttpSession session = request.getSession(true);
                session.setAttribute("user_login", a.get(0));
                return "redirect:/producktype";
            } else {

                return "view/login";
            }

        }catch (Exception e)
        {e.printStackTrace();}
      return "view/login";
    }
}
