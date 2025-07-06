package com.cameron.springboot.demo.Cameron.s_App.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FunRestController {
    // We're using this to expose a "/" endpoint that will return "Hello World".
    @GetMapping("/")
    public String sayHello() {
        return "Hello World!";
    }

    // adding a secondary endpoint
    @GetMapping("/workout")
    public String workout() {
        return "Drop for 20 pushups!";
    }
}
