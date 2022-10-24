package com.example.palindrome.web.rest;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalTime;

@RestController
public class HealthCheckController {

    @GetMapping("/health")
    public ResponseEntity<String> helloWorld() {
        return ResponseEntity.ok("Application was healthy at: " + LocalTime.now().toString());
    }
}
