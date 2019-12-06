package com.example.demo;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PingPongController {

    @GetMapping(path = "/ping", produces = MediaType.TEXT_PLAIN_VALUE)
    public String pong() {
        return "pong";
    }

}