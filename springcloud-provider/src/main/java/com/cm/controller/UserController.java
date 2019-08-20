package com.cm.controller;

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

    @RequestMapping("e.g./{aa}")
    public String eg(@PathVariable String aa){
        System.out.println(aa);
        return aa;
    }
}
