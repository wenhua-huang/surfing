package com.petrel.surfing.user.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("user")
public class UserController {



    @RequestMapping("{id}")
    public String getUser(Long id){
        return  "wenhua";
    }



}
