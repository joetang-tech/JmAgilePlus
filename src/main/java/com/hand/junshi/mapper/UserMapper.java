package com.hand.junshi.mapper;

import com.hand.junshi.bean.UserBean;

import java.util.HashMap;

/**
 * @author joetang  //DAO
 * @date 2021-01-22 8:14
 * DAO层访问数据库接口文件
 * 包括XxxMapper.java(数据库访问接口类)，XxxMapper.xml(数据库链接实现),也就是DAO
 */

public interface UserMapper {

    UserBean getInfo(HashMap map);

}