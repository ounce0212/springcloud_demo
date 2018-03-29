package com.example.eurekaconsumer.controller;

import com.example.eurekaconsumer.service.ProviderRemote;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ConsumerController {

    @Autowired
    private ProviderRemote providerRemote;

    @RequestMapping("/sayHai")
    public  String sayHai(@RequestParam String name){
        return providerRemote.sayHello(name);
    }

}
