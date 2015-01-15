package com.shinowit.web;

import com.shinowit.dao.mapper.Basedao;
import com.shinowit.dao.mapper.ProvinceMapper;
import com.shinowit.dao.mapper.TbaMembeaddrinfoMapper;
import com.shinowit.entity.*;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

/**
 * Created by Administrator on 2015/1/12.
 */
@Controller
public class Chart1Controller {
    @Resource
    private Basedao dao;
    @Resource
    private ProvinceMapper ProvinceMapper_dao;
    @Resource
    private TbaMembeaddrinfoMapper dao1;

    //修改
    @RequestMapping("updateadress")
    public String update(HttpServletRequest request) {
        String recname = request.getParameter("recman");
        Integer id = Integer.valueOf(request.getParameter("id"));
        String recaddress = request.getParameter("recaddress");
        String tel = request.getParameter("tel");
        String postcode = request.getParameter("postcode");
        TbaMembeaddrinfo meradd = new TbaMembeaddrinfo();
        meradd.setRecman(recname);
        meradd.setRecaddress(recaddress);
        meradd.setPostcode(postcode);
        meradd.setId(id);
        meradd.setTel(tel);
        dao.updatemeradd(meradd);
        return "redirect:jiesuan";

    }

//    @RequestMapping(value = "/01chart")
//    public String chart1(@ModelAttribute("eaddrinfo") TbaMembeaddrinfo membeaddrinfo1, HttpServletRequest request, Model model) {
//        TbaMemberinfo memberinfo2 = null;
//        List<TbaMembeaddrinfo> membeaddrinfo = null;
//        memberinfo2 = (TbaMemberinfo) request.getSession(true).getAttribute("current_user");
//        TbaMembeaddrinfoCriteria fi = new TbaMembeaddrinfoCriteria();
//        TbaMembeaddrinfoCriteria.Criteria se = fi.createCriteria();
//        se.andUsernameEqualTo(memberinfo2.getUsername());
//        membeaddrinfo = dao1.selectByExample(fi);
//        model.addAttribute("memberaddlist", membeaddrinfo);
////        for(TbaMembeaddrinfo memaddr:membeaddrinfo){
////            model.addAttribute("memaddrinfo",memaddr);
////        }
//
//
//        return "view/chart01";
//    }


    //删除
    @RequestMapping("/deletemeradd")
    public String deletemeradd(@RequestParam("id") Integer id, HttpServletResponse response) {
        int a = dao1.deleteByPrimaryKey(id);
        if (a > 0) {
            return "redirect:jiesuan";
        } else {
            return "redirect:jiesuan";
        }
    }

    @RequestMapping(value = "/04chart")
    public String chart4() {

        return "/view/chart04";
    }
    @RequestMapping(value = "/02chart")
    public String chart2() {

        return "/view/chart02";
    }

    @RequestMapping(value = "/03chart")
    public String chart3() {

        return "/view/chart03";
    }


    //新增会员收货地址
    @RequestMapping(value = "/insertaddr")
    public String insert(@ModelAttribute("eaddrinfo") TbaMembeaddrinfo membeaddrinfo, Model model) {
        int i = dao1.insert(membeaddrinfo);
        if (i > 0) {
            model.addAttribute("memaddrinfo", membeaddrinfo);
            return "redirect:jiesuan";
        }
        return "redirect:jiesuan";
    }


    //将选中的地址添加到session当中
    @RequestMapping(value = "/addrsession")
    public String  addrsession(HttpServletRequest request, @RequestParam("meraddid") Integer meraddid) {
        TbaMembeaddrinfo membeaddrinfo1 = null;
        membeaddrinfo1 = dao1.selectByPrimaryKey(meraddid);
        if (membeaddrinfo1 != null) {
            request.getSession().setAttribute("memaddrinfo", membeaddrinfo1);
            return "view/chart02";
        }
        return "view/chart02";
    }
}
