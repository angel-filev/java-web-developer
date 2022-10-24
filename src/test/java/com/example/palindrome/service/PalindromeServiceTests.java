package com.example.palindrome.service;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;


public class PalindromeServiceTests {

    private String[] words = {
            "Kayak",
            "Anna",
            "Civic",
            "Level",
            "Madam",
            "Nitin",
            "1001001"
    };

    private String[] non_palindrome_words = {
            "Kayak1",
            "Anna1",
            "Civic1",
            "Level1",
            "Madam1",
            "Nitin1",
            "10010011"
    };

    private PalindromeService palindromeService = new PalindromeService();

    @Test
    public void whenKayak_shouldBePalindrome() {
         assertTrue(palindromeService.isPalindrome("Kayak"));
    }

    @Test
    public void whenWord_shouldBePalindrome() {
        for (String word : words)
            assertTrue(palindromeService.isPalindrome(word));
    }

    @Test
    public void whenWord_shouldNotBePalindrome() {
        for (String word : non_palindrome_words)
            assertFalse(palindromeService.isPalindrome(word));
    }


}
