package com.shinowit.web;

import com.shinowit.dao.mapper.Gouwuche1Mapper;
import com.shinowit.dao.mapper.TmeMerchandiseinfoMapper;
import com.shinowit.entity.*;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.math.BigDecimal;
import java.util.List;
import java.util.Map;

/**
 * Created by Administrator on 2015/1/5.
 */
@Controller
public class GouwucheController {

    @Resource
    private TmeMerchandiseinfoMapper dao;
    @Resource
    private Gouwuche1Mapper gouwuche_dao;
    @RequestMapping("charttest")
    public String chart(String merchandiseid,HttpServletRequest request,Model model
    ) {
        //获取登陆用户的session
        TbaMemberinfo user_list = (TbaMemberinfo) request.getSession().getAttribute("user_login");
        try{

            System.out.print(user_list.getUsername());
            //查询报选中的图片商品的list
            TmeMerchandiseinfo merchandiseinfoList2 = dao.selectByPrimaryKey(merchandiseid);
            //查询购物车表有没有数据
            Gouwuche1Criteria criteria = new Gouwuche1Criteria();
            Gouwuche1Criteria.Criteria tiaojian = criteria.createCriteria();
            tiaojian.andUsernameEqualTo(user_list.getUsername());
            tiaojian.andMerchandiseidEqualTo(merchandiseid);
            List<Gouwuche1> che_list = gouwuche_dao.selectByExample(criteria);

            if (che_list.size() == 1) {
                Gouwuche1 che1 = new Gouwuche1();
                che1.setUsername(user_list.getUsername());
                che1.setMerchandiseid(merchandiseid);
                che1.setPicpath(merchandiseinfoList2.getPicpath());
                che1.setMerchandisename(merchandiseinfoList2.getMerchandisename());
                che1.setPrice(merchandiseinfoList2.getPrice());
                BigDecimal dd=new BigDecimal(che_list.get(0).getNum() + 1);
                System.out.print(merchandiseinfoList2.getPrice().multiply(dd).intValue());
                BigDecimal ff=new BigDecimal(merchandiseinfoList2.getPrice().multiply(dd).intValue());
                che1.setTotalmoney(ff);
                che1.setNum(che_list.get(0).getNum() + 1);
                gouwuche_dao.updateByPrimaryKeySelective(che1);
            } else {
                //插入购物车的表
                Gouwuche1 che = new Gouwuche1();
                che.setUsername(user_list.getUsername());
                che.setMerchandiseid(merchandiseid);
                che.setPicpath(merchandiseinfoList2.getPicpath());
                che.setMerchandisename(merchandiseinfoList2.getMerchandisename());
                che.setPrice(merchandiseinfoList2.getPrice());
                che.setTotalmoney(merchandiseinfoList2.getPrice());
                che.setNum(1);
                gouwuche_dao.insert(che);
            }
        }catch (Exception e){
            e.printStackTrace();
        }


        //查询购物车表
        Gouwuche1Criteria criteria1 = new Gouwuche1Criteria();
        Gouwuche1Criteria.Criteria tiaojian1 = criteria1.createCriteria();
        tiaojian1.andUsernameEqualTo(user_list.getUsername());
        List<Gouwuche1> che_list1 = gouwuche_dao.selectByExample(criteria1);
         int a=  che_list1.size();
        model.addAttribute("che_list", che_list1);
        model.addAttribute("num",a);
//        List<Map<String,Object>>  aaa=  gouwuche_dao.selectsum(user_list.getUsername());
//        Object money = null;
//        for(Map<String,Object> ss : aaa){
//            money = ss.get("totalprice");
//        }
        BigDecimal aaa= gouwuche_dao.selectsum(user_list.getUsername());
        model.addAttribute("sum",aaa);
        System.out.print(aaa);
        return "view/chart";

    }

   }

