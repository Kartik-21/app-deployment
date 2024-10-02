package com.kartik;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HealthController {

    private static final Logger log
            = LoggerFactory.getLogger(HealthController.class);

    @GetMapping("/")
    public ResponseEntity<?> getInfo() {
        log.info("Check Status");
        return ResponseEntity.ok("hello server");
    }

    @GetMapping("/status")
    public ResponseEntity<?> checkStatus() {
        log.info("Check Status");
        return ResponseEntity.ok("success");
    }

    @GetMapping("/stress")
    public ResponseEntity<?> stress() {
        for (int i = 0; i <= 10000; i++) {
            byte[] bytes = new byte[i];
        }
        return ResponseEntity.ok("stress");
    }

}
