package com.hand.junshi.serviceImpl;

import com.hand.junshi.bean.UserBean;
import com.hand.junshi.mapper.UserMapper;
import com.hand.junshi.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;

/**
 * @author joetang
 * @date 2021-01-22 8:14
 */
@Service
public class UserServiceImpl implements UserService {

    //将DAO注入Service层  autoWired 自动装配  annotation 注解
    @Autowired
    private UserMapper userMapper;

    @Override
    public UserBean loginIn(String name, String password) {

        HashMap map = new HashMap<String,String>();
        map.put("name",name);
        map.put("password",password);

        UserBean ub =userMapper.getInfo(map);

        if (ub == null) {
            return null;
        }else{
            return ub;
        }

    }
}