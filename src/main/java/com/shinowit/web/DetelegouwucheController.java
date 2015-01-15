package com.shinowit.web;

import com.shinowit.dao.mapper.Gouwuche1Mapper;
import com.shinowit.entity.Gouwuche1Criteria;
import com.shinowit.entity.TbaMemberinfo;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

/**
 * Created by Administrator on 2015/1/6.
 */
@Controller
public class DetelegouwucheController {
     @Resource
     private Gouwuche1Mapper dao;
    @RequestMapping("detele")
    public String detele( String username,String merchandiseid){
        Gouwuche1Criteria criteria1 = new Gouwuche1Criteria();
        Gouwuche1Criteria.Criteria tiaojian1 = criteria1.createCriteria();
        tiaojian1.andUsernameEqualTo(username);
        tiaojian1.andMerchandiseidEqualTo(merchandiseid);
        dao.deleteByExample(criteria1);

        return "redirect:charttest";

    }
    @RequestMapping("deteleall")
    public String deteleall(HttpServletRequest request){
        TbaMemberinfo user_list1 = (TbaMemberinfo) request.getSession().getAttribute("user_login");
        try{
            int ddd=  dao.deleteAll(user_list1.getUsername());
            return "view/chart";

        }catch (Exception e){
            e.printStackTrace();

        }
        return "view/chart";

    }
}
