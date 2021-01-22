package com.hand.junshi.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author joetang
 * @date 2021-01-22 7:14
 */
@Controller
public class helloController {
    @RequestMapping("/index.html")
public String sayHello(){

        return "index";

    }

}
