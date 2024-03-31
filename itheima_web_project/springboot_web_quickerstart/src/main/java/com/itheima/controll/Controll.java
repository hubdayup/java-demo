package com.itheima.controll;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controll {
    @RequestMapping("/hello9")
    public String hello(){
        System.out.println("hello world");
        return "hello world";
    }
}
