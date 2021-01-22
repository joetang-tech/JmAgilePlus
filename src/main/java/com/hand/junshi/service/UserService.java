package com.hand.junshi.service;

import com.hand.junshi.bean.UserBean;
import org.springframework.stereotype.Service;

/**
 * @author joetang
 * @date 2021-01-22 8:12
 * 服务层，业务层，包括XxxService.java(业务接口类)，XxxServiceImpl.java（业务实现类）  声明和宣告
 */
public interface UserService {

    UserBean loginIn(String name, String password);

}