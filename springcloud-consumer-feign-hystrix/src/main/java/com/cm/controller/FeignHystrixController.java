package com.cm.controller;

import com.cm.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author CaoMeng
 * @Date 2019-08-21
 */
@RestController
@RequestMapping("feign")
public class FeignHystrixController{

    @Autowired
    private IUserService userService;

    @RequestMapping("hystrix/{x}")
    public String hystrix(@PathVariable(name = "x") String x){
        String eg=userService.eg(x);
        return eg;
    }
}
