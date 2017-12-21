package com.ssk.examples.cci.array;

import org.junit.Test;

import static org.junit.Assert.*;

public class StringFrequencySortTest {

    StringFrequencySort frequencySort = new StringFrequencySort();

    @Test
    public void frequencySort() throws Exception {
        assertEquals("eert", frequencySort.frequencySort("tree"));
    }

}