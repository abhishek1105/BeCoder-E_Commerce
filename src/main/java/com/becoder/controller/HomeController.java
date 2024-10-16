package com.becoder.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("${api.prefix}/home")
@Controller
public class HomeController {
    @GetMapping("/hello")
    public String hello() {
        return "index";
    }
}
