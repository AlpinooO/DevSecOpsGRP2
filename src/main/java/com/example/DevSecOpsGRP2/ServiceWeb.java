package com.example.DevSecOpsGRP2;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ServiceWeb {
    @GetMapping("/bonjour")
    public String sayHello() {
        return "Bonjour, DevSecOpsGRP2!";
    }
}