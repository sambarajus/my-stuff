package com.ssk.examples.cci.array;

import java.util.ArrayList;
import java.util.List;

public class Permutation {
    List<String> permute(char [] str,int i,int n) {
        List<String> result = new ArrayList<>();
        if (i == n) {
            StringBuilder sb = new StringBuilder();

            for (int m = 0; m < str.length; m++) {
                sb.append(str[m]);
            }
            result.add(sb.toString());

        } else {
            for (int j = i; j <= n; j++) {
                //swap str[i] and str[j]
                char ch = str[i];
                str[i] = str[j];
                str[j] = ch;
                result.addAll(permute(str, i + 1, n));
                //swap str[i] and str[j]
//                ch = str[i];
//                str[i] = str[j];
//                str[j] = ch;
            }
        }
        return result;
    }
}
