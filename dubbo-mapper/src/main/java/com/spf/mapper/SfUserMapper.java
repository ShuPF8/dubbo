package com.spf.mapper;

import com.spf.model.entity.SfUser;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by SPF on 2017/8/9.
 */
public interface SfUserMapper {

    List<SfUser> findAll();

}
