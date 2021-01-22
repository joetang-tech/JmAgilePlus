package com.hand.junshi.bean;

import javax.swing.*;

/**
 * @author joetang
 * @date 2021-01-22 8:05
 * model层，模型层，entity层，实体层，就是数据库表的映射实体类，存放POJO对象
 * Bean实体类，依据数据库表，生成set和get方法
 */

public class UserBean {
    private int id;
    private String name;
    private String password;

    void UserBean(){

    }


    void UserBean(int id,String name, String password){
        this.id = id;
        this.name = name;
        this.password = password;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}