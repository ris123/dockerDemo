package com.example.hello.resources;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class HelloResource {

    @RequestMapping("/")
    public String getHello(){
        return "Hello";
    }

}
