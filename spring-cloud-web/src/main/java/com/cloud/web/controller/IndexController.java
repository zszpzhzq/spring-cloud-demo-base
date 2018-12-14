package com.cloud.web.controller;

import com.cloud.web.service.TestService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

@RestController
public class IndexController {


    @Resource
    TestService testService;

    @RequestMapping(value = "/")
    public String index(HttpServletRequest request){
        return testService.helloWorld("param");
    }



}
