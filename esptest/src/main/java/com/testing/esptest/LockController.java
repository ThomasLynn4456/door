package com.testing.esptest;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class LockController {

    private final String ESP32_IP = "http://192.168.100.137"; // Replace with your ESP32 IP

    @GetMapping("/lock")
    public String lock() {
        RestTemplate restTemplate = new RestTemplate();
        return restTemplate.getForObject(ESP32_IP + "/lock", String.class);
    }

    @GetMapping("/unlock")
    public String unlock() {
        RestTemplate restTemplate = new RestTemplate();
        return restTemplate.getForObject(ESP32_IP + "/unlock", String.class);
    }
}
