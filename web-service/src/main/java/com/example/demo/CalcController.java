package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("calc")
public class CalcController {

    @GetMapping("sum")
    public Integer pong(@RequestParam Integer param1, @RequestParam Integer param2){
        return param1 + param2;
    }

}