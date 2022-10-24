package com.example.palindrome.web.rest;


import com.example.palindrome.service.PalindromeService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.security.InvalidParameterException;

@RestController
public class PalindromeController {

    PalindromeService _palindromeService;

    public PalindromeController() {
        _palindromeService = new PalindromeService();
    }

    @GetMapping("/palindrome/{text}")
    public ResponseEntity<String> isPalindrome(@PathVariable("text") String text) {
        if(text.length() < 2)
        {
            throw new InvalidParameterException();
        }

        if (_palindromeService.isPalindrome(text)) {
            return ResponseEntity.ok(String.format("The %s is a palindrome", text));
        } else {
            return ResponseEntity.ok(String.format("The %s is NOT a palindrome", text));
        }

    }
}
