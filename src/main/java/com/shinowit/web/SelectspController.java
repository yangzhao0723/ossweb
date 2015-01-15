package com.shinowit.web;
import com.shinowit.dao.mapper.TmeMerchandisecinfoMapper;
import com.shinowit.dao.mapper.TmeMerchandiseinfoMapper;
import com.shinowit.entity.*;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.List;
/**
 * Created by Administrator on 2014/12/29.
 */
@Controller
@RequestMapping("/")
public class SelectspController {
    @Resource
    private TmeMerchandisecinfoMapper dao;
//
    @RequestMapping("selectsp")
//
    public String select(HttpServletRequest request) {
//        TmeMerchandisecinfoCriteria criteria = new TmeMerchandisecinfoCriteria();
//        TmeMerchandisecinfoCriteria.Criteria yy = criteria.createCriteria();
//        yy.andIdLessThan(6);
//        List<TmeMerchandisecinfo> aa = dao.selectByExample(criteria);
//        HttpSession session = request.getSession(true);
//        session.setAttribute("sp_list", aa);
        return "view/index";
    }
////   @ResponseBody
////    public List< TmeMerchandisecinfo> select(HttpServletRequest request) {
////        TmeMerchandisecinfoCriteria criteria = new TmeMerchandisecinfoCriteria();
////        TmeMerchandisecinfoCriteria.Criteria yy = criteria.createCriteria();
////        yy.andIdLessThan(6);
////        List<TmeMerchandisecinfo> aa = dao.selectByExample(criteria);
////        HttpSession session = request.getSession(true);
////        session.setAttribute("sp_list", aa);
////        return aa;
////    }
//
//    @Resource
//    public TmeMerchandiseinfoMapper dao1;
//
//    @RequestMapping("selectspinfo")
//    public String select1(Model model) {
//        TmeMerchandiseinfoCriteria criteria1 = new TmeMerchandiseinfoCriteria();
//        TmeMerchandiseinfoCriteria.Criteria tt = criteria1.createCriteria();
//        tt.andIdLessThan(5);
//        List<TmeMerchandiseinfo> bb = dao1.selectByExample(criteria1);
//        model.addAttribute("spinfo_list", bb);
//        return "view/index";
//    }
@Resource
private TmeMerchandiseinfoMapper dao1;
//    @RequestMapping("selectspinfo")
//    @ResponseBody
//    public List<TmeMerchandiseinfo> select1(Model model) {
//        TmeMerchandiseinfoCriteria criteria1 = new TmeMerchandiseinfoCriteria();
//        TmeMerchandiseinfoCriteria.Criteria tt = criteria1.createCriteria();
//        tt.andIdLessThan(5);
//        List<TmeMerchandiseinfo> bb = dao1.selectByExample(criteria1);
//        model.addAttribute("spinfo_list", bb);
//         return bb;
//    }

//    @RequestMapping(value = "/productByType")
//    @ResponseBody
//    public List<Product> showProductByType(@RequestParam(value = "typeCode") String typeCode, Model model, HttpSession session) {
//        session.removeAttribute("product_list");
//        List<Product> productList = dao1.selectByProductType(typeCode);
//        return productList;
//    }
    @RequestMapping(value = "/produck")
    @ResponseBody
    public List<TmeMerchandiseinfo>  show1(HttpServletRequest request,@RequestParam(value = "merchandisecid",required = false)String merchandisecid){
        if(request.getSession().getAttribute("product_list")!=null){
            request.getSession().removeAttribute("product_list");
        }

        TmeMerchandiseinfoCriteria criteria1 = new TmeMerchandiseinfoCriteria();
        TmeMerchandiseinfoCriteria.Criteria rr = criteria1.createCriteria();
        rr.andIdLessThan(6);
        rr.andMerchandisecidEqualTo(merchandisecid);
        List<TmeMerchandiseinfo> productList=dao1.selectByExample(criteria1);
        HttpSession session = request.getSession(true);
        session.setAttribute("product_list", productList);
        return productList;
    }
    @RequestMapping(value = "/producktype")
    public String  show2( HttpSession session){
//        session.removeAttribute("product_list");

        TmeMerchandisecinfoCriteria criteria1 = new TmeMerchandisecinfoCriteria();
        TmeMerchandisecinfoCriteria.Criteria rr = criteria1.createCriteria();
          rr.andIdLessThan(5);
        List<TmeMerchandisecinfo> producttypeList=dao.selectByExample(criteria1);
        session.setAttribute("product_fenlei_list",producttypeList);
        return "view/index";
    }

}
