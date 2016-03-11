package com.ms.demo.controller;

import com.ms.demo.service.testService;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.logging.Logger;

/**
 * Created by sunyehong on 16/3/11.
 */


@RestController
public class userController {
    private static final org.slf4j.Logger LOGGER = LoggerFactory
            .getLogger(userController.class);

    @Autowired
    public testService testservice;


    @ResponseBody
    @RequestMapping(value = "/v1")
    public String test()
    {

        return("flag:" + testservice.getUser(1).getAreaName());
    }

}
