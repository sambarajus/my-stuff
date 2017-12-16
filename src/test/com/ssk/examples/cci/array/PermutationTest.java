package com.ssk.examples.cci.array;

import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class PermutationTest {

    Permutation permutation = new Permutation();
    @Test
    public void permute() throws Exception {
        List<String> result = permutation.permute("abcd".toCharArray(), 0, "abcd".length()-1);

        assertEquals(24, result.size());
        result.forEach(s-> System.out.println(s));
    }

}