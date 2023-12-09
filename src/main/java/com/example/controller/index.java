package com.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class index {

    @GetMapping("/")
    public String index() {
        return "index 호출 됨.";
    }
}
