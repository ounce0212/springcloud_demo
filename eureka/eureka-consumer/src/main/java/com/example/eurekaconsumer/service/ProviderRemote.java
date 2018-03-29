package com.example.eurekaconsumer.service;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient("spring-cloud-provider")
public interface ProviderRemote {

    @RequestMapping(value = "/sayhello")
    public String sayHello(@RequestParam("name") String name);

}
