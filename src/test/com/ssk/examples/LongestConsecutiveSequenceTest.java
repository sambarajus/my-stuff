package com.ssk.examples;

import com.ssk.examples.cci.array.LongestConsecutiveSequence;
import org.junit.Test;

/**
 * Created by 212561830 on 11/11/17.
 */
public class LongestConsecutiveSequenceTest {
    @Test
    public void longestConsecutive() throws Exception {
        int[] nums = {100, 4, 200, 1, 3, 2};
        LongestConsecutiveSequence sequence = new LongestConsecutiveSequence();
        System.out.println(sequence.longestConsecutive(nums));

        int[] nums1 = {0,0};
        System.out.println(sequence.longestConsecutive(nums1));
    }

}