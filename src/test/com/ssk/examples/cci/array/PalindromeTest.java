package com.ssk.examples.cci.array;

import org.junit.Test;

import static org.junit.Assert.*;

public class PalindromeTest {
    Palindrome palindrome = new Palindrome();
    @Test
    public void isPalindrome() throws Exception {
        assertTrue(palindrome.isPalindrome("sks"));
    }

    @Test
    public void isValidfPandrome() throws Exception{
        assertTrue(palindrome.isValidPandrome("sks"));
        assertTrue( palindrome.isValidPandrome("srks"));
        assertTrue(palindrome.isValidPandrome("skds"));
    }
}