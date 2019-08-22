package com.cm.controller;

import com.cm.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



@RestController
@RequestMapping("feign")
public class FeignController{

    @Autowired
    private IUserService userService;

    @Value("${server.port}")
    private String port;

    @RequestMapping("name/{name}")
    public String getFeign(@PathVariable(name = "name") String name){
        String eg=userService.eg(name);
        return eg+"-->当前端口是-->"+port;
    }
}
