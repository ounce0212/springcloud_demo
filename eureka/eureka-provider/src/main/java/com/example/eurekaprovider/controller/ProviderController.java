package com.example.eurekaprovider.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Configuration
public class ProviderController {

    @Value("${server.port}")
    private  String myPort;

    @RequestMapping("/sayhello")
    public String SayHello(@RequestParam String name){

        return myPort+"说，你好："+name;
    }

}
