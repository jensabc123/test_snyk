package org.springframework.samples.petclinic.model;

import java.io.Serializable;

public class User implements Serializable {
    private Integer id; //用户id

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

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    private String name; //用户名
    private String phone; //手机
// 省略 setter、getter方法
}