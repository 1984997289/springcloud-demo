package com.cm.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author CaoMeng
 * @Date 2019-08-20
 */
@RestController
@RequestMapping("user")
public class UserController{

    @Value("${server.port}")
    private String port;

    @RequestMapping("e.g./{aa}")
    public String eg(@PathVariable(name = "aa") String aa){
        System.out.println(aa);
        return aa+"当前端口是"+port;
    }
}
