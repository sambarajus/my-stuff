package com.ssk.examples;

/**
 * Created by 212561830 on 11/14/17.
 */
public class FindColumnNumber {

    public long lettersToNumber(String columnLabel){
        char[] letters = columnLabel.toCharArray();
        long columnNumber = 0;
        for (int i = 0; i < letters.length ; i++) {
            int coEfficient = (int) Character.toUpperCase(letters[i]) % 64;
            columnNumber = columnNumber + (coEfficient * (long)Math.pow(26, letters.length-1-i));
        }
        return columnNumber;
    }

    public String numberToLetters(long number){
        String label = "";
        while (number > 0) {
            int x = (int)number % 26;
            if(x==0){
               x = 26;
               number = number-26;
            }
            char c = (char)(x+64);
            label = c+label;
            number = number / 26;
        }
        return label.toUpperCase();
    }
}
