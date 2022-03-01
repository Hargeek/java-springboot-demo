package com.example.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class TestController {

    @RequestMapping("/")
    public String index() {
        return "It works";
    }

    @RequestMapping("/healthz")
    public String healthz() {
        return "It is healthy";
    }
}
