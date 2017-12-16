package com.ssk.examples;

import com.ssk.examples.cci.array.Permutations;
import org.junit.Test;

import java.util.List;
import java.util.Set;

/**
 * Created by 212561830 on 11/16/17.
 */
public class PermutationsTest {
    Permutations permutations = new Permutations();

    @Test
    public void permute() throws Exception {

        int[] nums = {1,1,2};
       List<List<Integer>> perms =  permutations.permute(nums);
       perms.forEach(perm->{
           perm.forEach(p->{
               System.out.print(" "+p);
           });
           System.out.println();
       });
    }

    @Test
    public void findSubStrings() throws Exception{
        Set<String> s = permutations.findSubStrings("hello");
        s.forEach(st->{
            System.out.println(st);
        });
    }

}