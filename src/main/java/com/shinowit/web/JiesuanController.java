package com.shinowit.web;

import com.shinowit.dao.mapper.CityMapper;
import com.shinowit.dao.mapper.DistrictMapper;
import com.shinowit.dao.mapper.ProvinceMapper;
import com.shinowit.dao.mapper.TbaMembeaddrinfoMapper;
import com.shinowit.entity.*;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

/**
 * Created by Administrator on 2015/1/7.
 */
@Controller
public class JiesuanController {
    @Resource
    private TbaMembeaddrinfoMapper dao;
    @Resource
    private ProvinceMapper ProvinceMapper_dao;
    @Resource
    private CityMapper CityMapper_dao;
    @Resource
    private DistrictMapper DistrictMapper_dao;

    @RequestMapping("jiesuan")
    public String jiesuan(@ModelAttribute("eaddrinfo") TbaMembeaddrinfo membeaddrinfo, Model model) {
        List<TbaMembeaddrinfo> list = dao.selectlist();
        model.addAttribute("address_list", list);
        List<Province> provinceList = null;
        ProvinceCriteria one = new ProvinceCriteria();
        ProvinceCriteria.Criteria two = one.createCriteria();
        two.andIdIsNotNull();
        provinceList = ProvinceMapper_dao.selectByExample(one);
        model.addAttribute("provinceList", provinceList);
        return "view/chart01";
    }
    @RequestMapping("/city")
    @ResponseBody
    public List<City> city( @RequestParam("provinceID") String provinceid) {
        List<City> msg = null;
        msg = CityMapper_dao.selectbypid(provinceid);
        return msg;
    }

    @RequestMapping("/area")
    @ResponseBody
    public List<District> area( @RequestParam("cityID") String cityid) {
        List<District> msg = null;
        msg = DistrictMapper_dao.selectbycid(cityid);
        return msg;
    }
}
