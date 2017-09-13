package com.spf.service;

import com.spf.mapper.SfUserMapper;
import com.spf.model.entity.SfUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by SPF on 2017/8/9.
 */
@Service("sfUserService")
public class SfUserService {

    @Autowired private SfUserMapper sfUserMapper;

    public List<SfUser> findAll() {
        return sfUserMapper.findAll();
    }

}
