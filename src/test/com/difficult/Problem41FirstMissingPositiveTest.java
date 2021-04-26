package com.difficult;

import org.junit.Test;

public class Problem41FirstMissingPositiveTest {
    @Test
    public void test(){
        Problem41FirstMissingPositive problem41FirstMissingPositive
                =new Problem41FirstMissingPositive();
        int[] nums={1,2,4,5};
        System.out.println(problem41FirstMissingPositive.firstMissingPositive(nums));
    }
}
