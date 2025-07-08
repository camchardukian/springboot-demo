package com.cameron.springboot.demo.Cameron.s_App.rest;

import org.springframework.beans.factory.annotation.Value;
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

    // Practice injecting properties from the application.properties file.
    @Value("${coach.name}")
    private String coachName;

    @Value("${team.name}")
    private String teamName;

    @GetMapping("/teaminfo")
    public String teamInfo() {
        return "Coach: " + coachName + ", Team: " + teamName;
    }



}
