package com.shinowit.test;

import com.shinowit.dao.mapper.TbaMemberinfoMapper;

import com.shinowit.dao.mapper.TmeMerchandisecinfoMapper;
import com.shinowit.dao.mapper.TmeMerchandiseinfoMapper;
import com.shinowit.entity.TbaMemberinfo;
import com.shinowit.entity.TbaMemberinfoCriteria;

import com.shinowit.entity.TmeMerchandisecinfo;
import com.shinowit.entity.TmeMerchandiseinfo;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractJUnit4SpringContextTests;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;
import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:application-context.xml"})
public class test1 extends AbstractJUnit4SpringContextTests {
    @Resource
    private TmeMerchandisecinfoMapper dao;

    @Test
    public void test() {
//        Userinfo a;
//    a=dao.selectByPrimaryKey(2);
//        a.setUsername("ss");
//
//int i=  dao.updateByPrimaryKey(a);
//System.out.print(i);
//        Assert.assertTrue(i > 0);
//        TbaMemberinfoCriteria criteria=new TbaMemberinfoCriteria();
//        TbaMemberinfoCriteria.Criteria taiojian=criteria.createCriteria();
//        taiojian.andIdLessThan(2l);
//        List<TbaMemberinfo> user_list=dao.selectByExample(criteria);
//
//        System.out.print(user_list.get(0).getUsername());
//        System.out.print(user_list.size());
        TmeMerchandisecinfo aa = dao.selectByPrimaryKey("01");
//      for( TmeMerchandiseinfo bb:aa.getMerchandiseinfo()){
//          System.out.print(bb.getMerchandisename());
//      }
    }
}
