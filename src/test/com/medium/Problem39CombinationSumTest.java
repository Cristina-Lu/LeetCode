package com.medium;

import org.junit.Test;

public class Problem39CombinationSumTest {
    @Test
    public void test(){
        Problem39CombinationSum problem39CombinationSum
                = new Problem39CombinationSum();
        int[] nums = {2,2,3,6,7};
        System.out.println(problem39CombinationSum.combinationSum(nums,7));

        int[] num ={2,3,5};
        System.out.println(problem39CombinationSum.combinationSum(num,8));
    }
}
