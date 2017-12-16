package com.ssk.examples.cci.array;

public class ReverseString {

    public String reverseString(String str){

        int length = str.length();
        char[] ch = str.toCharArray();
        for (int i = 0; i <str.length()/2 ; i++) {
            char t = ch[i];
            ch[i] = ch[length-i-1];
            ch[length-i-1] = t;
        }
        return new String(ch);
    }
}
