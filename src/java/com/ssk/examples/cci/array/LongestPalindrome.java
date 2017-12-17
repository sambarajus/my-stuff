package com.ssk.examples.cci.array;

public class LongestPalindrome {
    public String longestPalindrome(String str) {
        if (str == null || str.length() < 2)
            return str;
        String maxString = "";
        for (int c = 0; c < str.length(); c++) {
            String s = length(c, str);
            if (s.length() > maxString.length())
                maxString = s;
        }
        return maxString;
    }

    private String length(int c, String str) {
        int len = 1;
        int startIndex = c;
        int endIndex = c;
        if (c == 0)
            return str.substring(0, c + 1);
        int i = 1;
        while (c-i >= 0 & c + i < str.length()) {
            if (str.charAt(c - i) == str.charAt(c + i)) {
                startIndex = c - i;
                endIndex = c + i;
                len = len + 2;
            } else {
                break;
            }
            i++;
        }
        if(startIndex==endIndex && str.charAt(c - i) == str.charAt(c)){
            len = len+1;
            startIndex = c-1;
            endIndex = c ;
        }
        return str.substring(startIndex, endIndex + 1);
    }
}
