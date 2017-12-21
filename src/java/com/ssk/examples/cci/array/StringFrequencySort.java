package com.ssk.examples.cci.array;

import java.util.HashMap;
import java.util.Map;

public class StringFrequencySort {

    public String frequencySort(String s) {
        Map<Character, Integer> charCounts = new HashMap();

        if(s==null || s.length()<2)
            return s;

        int maxCount = 0;

        for(int i=0; i<s.length();i++){
            if(charCounts.get(s.charAt(i))==null)
                charCounts.put(s.charAt(i), 1);
            else
                charCounts.put(s.charAt(i), charCounts.get(s.charAt(i))+1);

            maxCount = maxCount< charCounts.get(s.charAt(i)) ? charCounts.get(s.charAt(i)) : maxCount;
        }

        String[] stringsByCount = new String[maxCount+1];
        for(Character c:charCounts.keySet() ){
            if(stringsByCount[charCounts.get(c)]==null)
                stringsByCount[charCounts.get(c)] = buildString(c, charCounts.get(c));
            else
                stringsByCount[charCounts.get(c)] = stringsByCount[charCounts.get(c)]+buildString(c, charCounts.get(c));
        }

        StringBuilder sb = new StringBuilder();
        for(int i = stringsByCount.length-1; i>=0;i-- ){
            if(stringsByCount[i]!=null)
                sb.append(stringsByCount[i]);
        }
        return sb.toString();
    }
    private String buildString(Character c, int count){
        StringBuilder sb = new StringBuilder();
        for(int i = 0;i<count;i++){
            sb.append(Character.toString(c));
        }
        return sb.toString();
    }
}
