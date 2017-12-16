package com.ssk.examples;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by 212561830 on 11/14/17.
 */
public class FindColumnNumberTest {
    FindColumnNumber findColumnNumber;
    @Before
    public void setup(){
        findColumnNumber = new FindColumnNumber();

    }

    @Test
    public void lettersToNumber() throws Exception {
        assertEquals(28, findColumnNumber.lettersToNumber("AB"));
        assertEquals(2, findColumnNumber.lettersToNumber("B"));
        assertEquals(1, findColumnNumber.lettersToNumber("A"));
        assertEquals(27, findColumnNumber.lettersToNumber("AA"));
        assertEquals(52, findColumnNumber.lettersToNumber("AZ"));
    }

    @Test
    public void numberToLabel(){
        assertEquals("AB", findColumnNumber.numberToLetters(28));
        assertEquals("B", findColumnNumber.numberToLetters(2));
        assertEquals("A", findColumnNumber.numberToLetters(1));
        assertEquals("AA", findColumnNumber.numberToLetters(27));
        assertEquals("AZ", findColumnNumber.numberToLetters(52));
    }
}