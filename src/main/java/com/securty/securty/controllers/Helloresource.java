package com.securty.securty.controllers;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/rest/hello")
public class Helloresource {

    @GetMapping("/all")
    public String hello(){
        return "HelloWorld";
    }

    @GetMapping("secured/all")
    public String securedHello(){
        return "Secured Hello";
    }
}
