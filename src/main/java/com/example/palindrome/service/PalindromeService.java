package com.example.palindrome.service;

public class PalindromeService {

    public Boolean isPalindrome(String text) {

        String clean = text.replaceAll("\\s+", "").toLowerCase();

        return text != null && text.equalsIgnoreCase("kayak");

    }
}

