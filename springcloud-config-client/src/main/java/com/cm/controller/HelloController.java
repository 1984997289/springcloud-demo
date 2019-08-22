package com.cm.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author CaoMeng
 * @Date 2019-08-22
 */
@RestController
@RequestMapping("config")
@RefreshScope  //只是更新对象里面的属性
public class HelloController{

    @Value("${com.name}")
    private String name;

    @RequestMapping("client")
    public String getName(){
        return "读取配置：-->"+name;
    }
}
