package com.hold.demo.controller;

import com.hold.demo.config.UserConfiguration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorld {

    @Autowired
    UserConfiguration userConfiguration;

    @RequestMapping(path = "/hello", method = RequestMethod.GET)
    @ResponseBody
    public String hello() {
        return userConfiguration.toString();
    }
}
