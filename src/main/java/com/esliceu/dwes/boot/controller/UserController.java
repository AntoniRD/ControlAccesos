package com.esliceu.dwes.boot.controller;

import com.esliceu.dwes.boot.model.User;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by xavi on 23/02/17.
 */
@RestController
public class UserController {

    @RequestMapping("/me")
    public User me(){
        User user = new User();
        user.setName("Xavi");
        user.setSurname("Torrens");

        return user;
    }



}
