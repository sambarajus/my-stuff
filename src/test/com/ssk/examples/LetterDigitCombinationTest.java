package com.ssk.examples;

import org.junit.Test;

import java.util.List;

/**
 * Created by 212561830 on 11/12/17.
 */
public class LetterDigitCombinationTest {
    @Test
    public void letterCombinations() throws Exception {
        LetterDigitCombination letterDigitCombination = new LetterDigitCombination();
        List<String> stringList = letterDigitCombination.letterCombinations("2" );
        stringList.forEach(s -> {
            System.out.println(s);
        });
    }

}