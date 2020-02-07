package com.doostep.stockmanagement.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("home/")
public class HomeController {

    @GetMapping("")
    public String home() {
        return "Welcome To Door Step";
    }
}
