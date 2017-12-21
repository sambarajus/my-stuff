package com.ssk.examples.cci.array;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Created by 212561830 on 11/16/17.
 */
public class Permutations {
    public List<List<Integer>> permute(int[] num) {
        List<List<Integer>> result = new ArrayList<>();
        result.add(new ArrayList<Integer>());
        for (int i = 0; i < num.length; i++) {
            List<List<Integer>> current = new ArrayList<>();
            for (List<Integer> l : result) {
                for (int j = 0; j < l.size() + 1; j++) {
                    l.add(j, num[i]);
                    ArrayList<Integer> temp = new ArrayList<Integer>(l);
                    current.add(temp);
                    l.remove(j);
                }
            }
            result = new ArrayList<>(current);
        }
        return result;
    }

    public Set<String> findSubStrings(String s) {
        Set<String> strSet = new HashSet<>();
        char[] chars = s.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            strSet.add("" + chars[i]);
            StringBuilder sb = new StringBuilder();
            sb.append(chars[i]);
            for (int j = i; j < chars.length; j++) {
                if (i != j) {
                    sb.append(chars[j]);
                }
                if (!strSet.contains(sb.toString())) {
                    strSet.add(sb.toString());
                }
            }
        }
        return strSet;
    }
}
