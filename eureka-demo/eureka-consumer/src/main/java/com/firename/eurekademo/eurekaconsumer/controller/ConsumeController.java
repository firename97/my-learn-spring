package com.firename.eurekademo.eurekaconsumer.controller;

import com.firename.eurekademo.eurekaconsumer.service.ConsumeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ConsumeController {

    @Autowired
    private ConsumeService consumeService;

    @RequestMapping("/consume")
    public String consume(@RequestParam String name){
        return consumeService.consume(name);
    }


}
