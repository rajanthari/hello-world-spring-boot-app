package com.rajanthari.helloapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class HelloWorldSpringBootAppApplication {

    public static void main(String[] args) {
        SpringApplication.run(HelloWorldSpringBootAppApplication.class, args);
    }

}

@RestController
class HelloController {
    @GetMapping("/")
    public String index() {
        return "Hello World!";
    }
    @GetMapping("/{name}")
    public String index(@PathVariable String name) {
        return "Hello %s!".formatted(name);
    }
}