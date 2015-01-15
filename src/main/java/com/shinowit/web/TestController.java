package com.shinowit.web;

import com.shinowit.framework.convert.Email.SendHtmlMail;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;

/**
 * Created by Administrator on 2015/1/15.
 */
@Controller
public class TestController {
    @Resource
    private SendHtmlMail email1;
    @RequestMapping("ae")
    public void  aa(){
        for(int i=0;i<=10;i++){

            String str="'bb";
            try{
                email1.sendMessage("206723730@qq.com","aa",str);
            }catch (Exception e){
                e.printStackTrace();

            }

        }

    }


}
