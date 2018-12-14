package com.cloud.service.api;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RefreshScope
public class TestController {

    @Value("${nickName}")
    private String nickName;

    @RequestMapping(value = "/helloWorld", method = RequestMethod.GET)
    @ResponseBody
    public String helloWorld(String param){
        return "Hello World"+nickName;
    }



}
