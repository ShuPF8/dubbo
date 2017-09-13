package com.spf.provider;

import com.spf.facede.api.DemoService;
import com.spf.model.entity.SfUser;
import com.spf.service.SfUserService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * @Auther SPF
 * @Create 2017/8/8
 */
public class DemoServiceImpl implements DemoService {

    @Autowired private SfUserService sfUserService;

    public String getName(String firstName, String lastName) {
        System.out.println("firstName:"+firstName+" lastName:"+lastName);
        return "hello， "+firstName+" " +lastName;
    }

    public List<SfUser> findAll() {
        return sfUserService.findAll();
    }
}
