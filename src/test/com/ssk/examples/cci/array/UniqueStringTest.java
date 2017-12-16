package com.ssk.examples.cci.array;

import org.junit.Test;

import static org.junit.Assert.*;

public class UniqueStringTest {
    private UniqueString uniqueString = new UniqueString();
    @Test
    public void isUniqueCharacter() throws Exception {
        assertFalse(uniqueString.isUniqueCharacter("Hello"));
        assertTrue(uniqueString.isUniqueCharacter("Helo"));
    }

}