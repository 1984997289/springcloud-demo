package com.cm.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author CaoMeng
 * @Date 2019-08-21
 */


@FeignClient("PROVIDER-EUREKA")
@RequestMapping("user")
public interface IUserService{

    @RequestMapping("e.g./{aa}")
    String eg(@PathVariable(name="aa") String aa);
}
