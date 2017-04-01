package com.cfg.market.entity;

import java.io.Serializable;
import java.util.Date;
/**
 * Created by chengfangang on 17/4/1.
 */
public class User implements Serializable {
    private static final long serialVersionUid = 1L;
    private Integer id;
    private String name;
    private String pwd;
    private Integer age;
    private Date createTime;

    public static long getSerialVersionUid() {
        return serialVersionUid;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
}
