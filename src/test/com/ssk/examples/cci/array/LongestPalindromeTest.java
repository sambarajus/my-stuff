package com.ssk.examples.cci.array;

import org.junit.Test;

import static org.junit.Assert.*;

public class LongestPalindromeTest {
    LongestPalindrome palindrome = new LongestPalindrome();
    @Test
    public void longestPalindrome() throws Exception {

        assertEquals("anana", palindrome.longestPalindrome("banana"));
    }

}