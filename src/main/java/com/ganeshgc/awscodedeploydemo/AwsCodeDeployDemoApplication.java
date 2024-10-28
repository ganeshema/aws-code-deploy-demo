package com.ganeshgc.awscodedeploydemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class AwsCodeDeployDemoApplication {

    @GetMapping("/hello")
    public String hello() {
        return "Hello World from AWS CodeDeploy Demo";
    }

    public static void main(String[] args) {
        SpringApplication.run(AwsCodeDeployDemoApplication.class, args);
    }

}
