package com.esliceu.dwes.boot.controller;

import com.esliceu.dwes.boot.model.User;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by xavi on 23/02/17.
 */
@RestController
public class UserController {

    @Autowired
    private BeanFactory beanFactory;

    @RequestMapping("/me")
    public User me(){
        return beanFactory.getBean(User.class);
    }

}
