package com.cm.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author CaoMeng
 * @Date 2019-08-22
 */
@RestController
public class GatewayController{

    @RequestMapping("/fallback")
    public String fallBack(){
        return "路由层面的降级方法！";
    }
}
