package com.simple;

import org.junit.Test;

public class Problem53MaximumSubarrayTest {
    @Test
    public void test(){
        Problem53MaximumSubarray problem53MaximumSubarray
                = new Problem53MaximumSubarray();
        System.out.println(problem53MaximumSubarray.maxSubArray(
                new int[]{-2,1,-3,4,-1,2,1,-5,4}));
        System.out.println(problem53MaximumSubarray.maxSubArray(
                new int[]{1}));
        System.out.println(problem53MaximumSubarray.maxSubArray(
                new int[]{0}));
        System.out.println(problem53MaximumSubarray.maxSubArray(
                new int[]{-1}));
        System.out.println(problem53MaximumSubarray.maxSubArray(
                new int[]{-10000}));
        System.out.println(problem53MaximumSubarray.maxSubArray(
                new int[]{-2,1}));
    }
}
