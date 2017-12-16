package com.ssk.examples;

import com.ssk.examples.cci.array.TwoSumProblem;
import org.junit.Test;

/**
 * Created by 212561830 on 11/15/17.
 */
public class TwoSumProblemTest {
    TwoSumProblem twoSumProblem  = new TwoSumProblem();
    @Test
    public void twoSum() throws Exception {
        int[] a1 = { 11, 15,2, 7};
        twoSumProblem.twoSum(a1, 9);
    }

}