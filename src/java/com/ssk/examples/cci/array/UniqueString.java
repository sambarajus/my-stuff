package com.ssk.examples.cci.array;

public class UniqueString {

    public boolean isUniqueCharacter(String str){
        if(str.length()>128)
            return false;

        boolean ch[] = new boolean[128];

        for (int i = 0; i <str.length() ; i++) {
            if(ch[str.charAt(i)])
                return false;
            ch[str.charAt(i)] = true;
        }
        return true;
    }
}
