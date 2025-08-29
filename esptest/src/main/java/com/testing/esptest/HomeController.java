package com.example.servo;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/lock")
public class LockController {

    private String status = "LOCK"; // default state

    @GetMapping("/status")
    public String getStatus() {
        return status;   // ESP32 will read "LOCK" or "UNLOCK"
    }

    @GetMapping("/lock")
    public String lock() {
        status = "LOCK";
        return "Locked";
    }

    @GetMapping("/unlock")
    public String unlock() {
        status = "UNLOCK";
        return "Unlocked";
    }
}
