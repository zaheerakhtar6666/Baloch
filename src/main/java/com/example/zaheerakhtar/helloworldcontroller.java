package com.example.zaheerakhtar;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class helloworldcontroller {

    @RequestMapping("/")

    public String helloworld () {
        return "hello world";

    }

        }
