package com.hand.junshi;

import com.hand.junshi.bean.UserBean;
import com.hand.junshi.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;


/**
 * @author joetang
 * @date 2021-01-22 9:46
 */
//@SpringBootTest
class JunshiApplicationTest {

  //  @Autowired
    UserService userService;

    void contextLoads() {
        UserBean userbean =userService.loginIn("a","a");
        System.out.println("该用户为：");
        System.out.println(userbean.getName());
    }

}
