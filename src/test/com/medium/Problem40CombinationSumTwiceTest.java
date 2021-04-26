package com.medium;

import org.junit.Test;

public class Problem40CombinationSumTwiceTest {
    @Test
    public void test(){
        Problem40CombinationSumTwice problem40CombinationSumTwice
                =new Problem40CombinationSumTwice();
        int[] nums = {1,2,2,6,7};
        System.out.println(problem40CombinationSumTwice.combinationSum2(nums,8));

        int[] num ={2,3,5};
        System.out.println(problem40CombinationSumTwice.combinationSum2(num,8));
    }
}
