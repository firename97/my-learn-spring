package com.firename.eurekademo.eurekaconsumer.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class ConsumeService {

    @Autowired
    RestTemplate restTemplate;

    public String consume(String name){
        return restTemplate.getForObject("http://eureka-client/helloWorld?name=" + name, String.class);
    }
}
