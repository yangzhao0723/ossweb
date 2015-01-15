package com.shinowit.web;

import com.shinowit.dao.mapper.TmeMerchandiseinfoMapper;
import com.shinowit.entity.TbaMemberinfo;
import com.shinowit.entity.TmeMerchandiseinfo;
import org.apache.poi.util.SystemOutLogger;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/**
 * Created by Administrator on 2015/1/5.
 */
@Controller
@RequestMapping("/")
public class ZhanshiController {

    @Resource
    private TmeMerchandiseinfoMapper tmeMerchandiseinfoMapper_dao;
    @RequestMapping(value = "/zhanshi")
    public String zhanshi(String merchandiseid, HttpServletRequest request) {
        try{
          TmeMerchandiseinfo  merchandiseinfoList1=  tmeMerchandiseinfoMapper_dao.selectByPrimaryKey(merchandiseid);
            HttpSession session = request.getSession(true);
            session.setAttribute("product_list1", merchandiseinfoList1);

        }catch (Exception e){
            e.printStackTrace();

        }
        return "view/inner-page";
    }
}

