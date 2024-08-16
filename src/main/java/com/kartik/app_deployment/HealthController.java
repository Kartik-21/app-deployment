package com.kartik.app_deployment;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HealthController {

    @GetMapping("/")
    public ResponseEntity<?> getInfo() {
        return ResponseEntity.ok("hello server");
    }

    @GetMapping("/status")
    public ResponseEntity<?> checkStatus() {
        return ResponseEntity.ok("success");
    }

}
