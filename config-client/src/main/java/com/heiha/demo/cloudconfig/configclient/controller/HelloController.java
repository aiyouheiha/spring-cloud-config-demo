package com.heiha.demo.cloudconfig.configclient.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @Value("${config.client.hello-message}")
    private String helloMessage;

    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    public String hello() {
        return helloMessage;
    }

}
