package com.spf.model.entity;

import lombok.Data;

import java.io.Serializable;

/**
 * Created by SPF on 2017/8/9.
 */
@Data
public class SfUser implements Serializable {

    private Long id;
    private Integer age;
    private String name;
    private String phone;
    private String pwd;
    private String sex;

}
