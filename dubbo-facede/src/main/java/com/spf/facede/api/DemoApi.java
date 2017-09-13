package com.spf.facede.api;

import com.spf.model.entity.SfUser;

import java.util.List;

/**
 * @Auther SPF
 * @Create 2017/8/8
 */
public interface DemoApi {

    String getName(String firstName, String lastName);

    List<SfUser> findAll();
}
