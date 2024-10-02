package com.kartik;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AppDeploymentApplication
    //for war file
//        extends SpringBootServletInitializer
{

    public static void main(String[] args) {
        SpringApplication.run(AppDeploymentApplication.class, args);
    }

}
