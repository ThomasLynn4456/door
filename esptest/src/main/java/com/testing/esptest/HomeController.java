package com.example.servo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/lock")
public class LockController {

    // Shared state of the servo
    private String status = "LOCK";

    // Serve HTML page for browser UI
    @GetMapping
    public String lockPage() {
        return "servo"; // servo.html should be in src/main/resources/templates or static
    }

    // ESP32 or AJAX GET to read status
    @ResponseBody
    @GetMapping("/status")
    public String getStatus() {
        return status;   // returns "LOCK" or "UNLOCK"
    }

    // ESP32 or AJAX call to lock
    @ResponseBody
    @GetMapping("/doLock")
    public String lock() {
        status = "LOCK";
        System.out.println("🔒 Locked");
        return "Locked";
    }

    // ESP32 or AJAX call to unlock
    @ResponseBody
    @GetMapping("/doUnlock")
    public String unlock() {
        status = "UNLOCK";
        System.out.println("🔓 Unlocked");
        return "Unlocked";
    }
}

}

