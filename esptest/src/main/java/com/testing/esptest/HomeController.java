package com.testing.esptest;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
    @GetMapping("/")
    public String home() {
        return "servo.html"; // maps to src/main/resources/static/servo.html
    }
}
