package com.ssk.examples;

import java.util.*;

/**
 * Created by 212561830 on 11/12/17.
 */
public class LetterDigitCombination {

    static Map<Character, String> digitLetterMap = new HashMap<>();

    static {
        digitLetterMap.put('1', "");
        digitLetterMap.put('2', "abc");
        digitLetterMap.put('3', "def");
        digitLetterMap.put('4', "ghi");
        digitLetterMap.put('5', "jkl");
        digitLetterMap.put('6', "mno");
        digitLetterMap.put('7', "pqrs");
        digitLetterMap.put('8', "tuv");
        digitLetterMap.put('9', "wxyz");
        digitLetterMap.put('0', " ");
    }


    List<String> letterCombinations(String numbers) {
        List<String> res = new ArrayList<>();
        char[] digits = numbers.toCharArray();
        String charmap[] = {"0", "1", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
        if(numbers!=null && numbers.length()>0){
            res.add("");
            for (int i = 0; i < digits.length; i++)
            {
                List<String> tempres = new ArrayList<>();
                char[] chars = digitLetterMap.get(digits[i]).toCharArray();
                for (int c = 0; c < chars.length;c++)
                    for (int j = 0; j < res.size();j++)
                        tempres.add(res.get(j)+chars[c]);
                res = tempres;
            }
            Collections.sort(res);
            return res;
        }
//        res.add(null);
        return res;
    }
}
