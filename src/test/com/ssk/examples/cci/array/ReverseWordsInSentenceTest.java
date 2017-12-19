package com.ssk.examples.cci.array;

import org.junit.Test;

import static org.junit.Assert.*;

public class ReverseWordsInSentenceTest {
    private  ReverseWordsInSentence reverseWordsInSentence = new ReverseWordsInSentence();
    @Test
    public void reverseWords() throws Exception {
//        assertEquals("World Hello", reverseWordsInSentence.reverseWords("Hello World"));
//        assertEquals("", reverseWordsInSentence.reverseWords(" "));
        assertEquals("a", reverseWordsInSentence.reverseWords("a"));
    }

    @Test
    public void reverseWordsCharAray() throws Exception {
        char[] a1 = "Hello World".toCharArray();
        reverseWordsInSentence.reverseWordsCharArray(a1);
        printArray(a1);
//        assertEquals("", reverseWordsInSentence.reverseWords(" "));

        assertEquals("a", reverseWordsInSentence.reverseWords("a"));
    }


    private void printArray(char[] a){
        for (int i = 0; i <a.length ; i++) {
            System.out.print(a[i]);
        }
    }
}