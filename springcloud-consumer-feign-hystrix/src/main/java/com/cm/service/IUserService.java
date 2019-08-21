package com.cm.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author CaoMeng
 * @Date 2019-08-21
 */

@FeignClient(value = "PROVIDER-EUREKA",fallback = UserServiceImpl.class)
//@RequestMapping("user")   写到下面可能会避免不必要的Bug
public interface IUserService{

    @RequestMapping("user/e.g./{aa}")
    String eg(@PathVariable(name="aa") String aa);
}
