package com.ingin.webflux.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CommonController {

    @PostMapping(value = "str")
    public String getstr() {
        return "ok";
    }

}
