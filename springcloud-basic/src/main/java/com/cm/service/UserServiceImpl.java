package com.cm.service;

import org.springframework.stereotype.Component;

/**
 * @author CaoMeng
 * @Date 2019-08-21
 */
@Component
public class UserServiceImpl implements IUserService{
    @Override
    public String eg (String aa){
        return "系统正在维修...稍后再试！";
    }
}
