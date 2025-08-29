package com.example.servo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ServoController {

    private boolean locked = true;

    @GetMapping("/")
    public String home() {
        return "ESP32 Servo Control App Running ✅";
    }

    @GetMapping("/lock")
    public String lock() {
        locked = true;
        System.out.println("🔒 Lock requested");
        return "Locked";
    }

    @GetMapping("/unlock")
    public String unlock() {
        locked = false;
        System.out.println("🔓 Unlock requested");
        return "Unlocked";
    }

    @GetMapping("/status")
    public String status() {
        return locked ? "Locked" : "Unlocked";
    }
}
