package com.spf.provider;

import com.alibaba.fastjson.JSON;
import com.spf.facede.api.DemoApi;
import com.spf.model.entity.SfUser;
import com.spf.service.SfUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @Auther SPF
 * @Create 2017/8/8
 */
@Component("demoApi")
public class DemoProvider implements DemoApi {

    @Autowired private SfUserService sfUserService;

    public String getName(String firstName, String lastName) {
        System.out.println("firstName:"+firstName+" lastName:"+lastName);
        return "hello， "+firstName+" " +lastName;
    }

    public List<SfUser> findAll() {
        List<SfUser> list = sfUserService.findAll();
        System.out.println(JSON.toJSONString(list));
        return list;
    }
}
