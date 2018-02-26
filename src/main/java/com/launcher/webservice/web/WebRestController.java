package com.launcher.webservice.web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WebRestController {

    @GetMapping("/hello")
    public String hello() {
        return "Hello, go to hell";
    }

    @GetMapping("/")
    public String main() {
        return "hi, man";
    }
}
