package com.cm.controller;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @author CaoMeng
 * @Date 2019-08-21
 */
@RestController
@RequestMapping("ribbon")
public class UserController{

    @Autowired
    private RestTemplate restTemplate;

    @RequestMapping("hystrix")
    @HystrixCommand(fallbackMethod = "fallBack")
    public String hystrix(){
        return restTemplate.getForObject("http://PROVIDER-EUREKA/user/e.g./63",String.class);
    }

    /**
     * 服务降级处理方法
     * @return
     */
    public String fallBack(){
//        System.out.println("服务器异常，稍后再试!");
        return  "服务器异常，稍后再试!";
    }

}
