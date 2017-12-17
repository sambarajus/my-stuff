package com.ssk.examples.cci.array;

public class LongestPalindrome {
    public String longestPalindrome(String str) {
        if (str == null || str.length() < 2)
            return str;
        int c = 0;
        String maxString = "";
        while (c < str.length() - 1) {
            String s = length(c, str);
            if (s.length() > maxString.length())
                maxString = s;
            c++;
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
        while (i >= 0 & c + i < str.length()) {
            if (str.charAt(c - i) == str.charAt(c + i)) {
                startIndex = c - i;
                endIndex = c + i;
                len = len + 2;
            } else {
                break;
            }
            i++;
        }

        return str.substring(startIndex, endIndex + 1);
    }
}
