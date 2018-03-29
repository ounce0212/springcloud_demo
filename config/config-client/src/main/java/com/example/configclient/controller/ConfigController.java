package com.example.configclient.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ConfigController {

    @Value("${neo.hello}")
    private  String hello;

    @GetMapping("/getHelloConfig")
    public  String getHelloConfig(){
        return this.hello;
    }

}
