package com.cm.springcloudconsumer.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @author CaoMeng
 * @Date 2019-08-21
 */
@RestController
@RequestMapping("ribbon")
public class ConsumerController{

    @Autowired
    private RestTemplate restTemplate;

    @RequestMapping("name/{name}")
    public String getName(@PathVariable(name = "name") String name){
        String result=restTemplate.getForObject("http://PROVIDER-EUREKA/user/e.g./18"+name,String.class);
        return result;
    }
}
