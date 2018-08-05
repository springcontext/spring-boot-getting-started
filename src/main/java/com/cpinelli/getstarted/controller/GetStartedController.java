package com.cpinelli.getstarted.controller;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GetStartedController {

    @GetMapping(path = "/", produces = MediaType.APPLICATION_JSON_VALUE)
    public String helloWorld() {
        return "Hello world!";
    }

    @GetMapping(path = "/{name}", produces = MediaType.APPLICATION_JSON_VALUE)
    public String helloWorldParameter(@PathVariable String name) {
        return "Hello " + name + "!";
    }
}

