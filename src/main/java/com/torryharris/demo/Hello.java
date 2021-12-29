package com.torryharris.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Hello {

    @GetMapping("/hello")
    public String hello() {
        System.out.println("hello");
        return "Hello world!";
    }

    @GetMapping("/hi")
    public String hi() {
        System.out.println("hi");
        return "Hi! How are you?";
    }    

    @GetMapping("/*")
    public String page404() {
        System.out.println("page404");
        return "The page you are looking for is not found.";
    }    

}
