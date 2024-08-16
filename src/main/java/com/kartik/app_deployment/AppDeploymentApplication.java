package com.kartik.app_deployment;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class AppDeploymentApplication
    //for war file
//        extends SpringBootServletInitializer
{

    public static void main(String[] args) {
        SpringApplication.run(AppDeploymentApplication.class, args);
    }

    @GetMapping("/check")
    public ResponseEntity<?> checkStatus() {
        return ResponseEntity.ok("success");
    }

}
