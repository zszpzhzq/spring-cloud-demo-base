package com.cloud.web.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient("spring-cloud-service")
public interface TestService {

    @RequestMapping(value="/helloWorld", method = RequestMethod.GET)
    String helloWorld(@RequestParam("param") String param);

}
