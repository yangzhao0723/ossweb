package com.shinowit.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Administrator on 2014/12/30.
 */
@Controller
public class ChartController {
    @RequestMapping("chart")
    public String chart(){
        return "view/chart";
    }
}
