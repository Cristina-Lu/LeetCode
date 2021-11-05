package com.simple;

public class Problem53MaximumSubarray {
    //普通解法
    public int maxSubArray(int[] nums) {
        int[] maxNum = new int[nums.length];
        maxNum[0]= nums[0];
        int Max=nums[0];
        for(int i=1;i<nums.length;++i){
            int sum =maxNum[i-1]+nums[i];
            if(sum>nums[i]){
                maxNum[i]=sum;
            }else {
                maxNum[i]=nums[i];
            }
            if(Max<maxNum[i]){
                Max = maxNum[i];
            }
        }
        return Max;
    }
}
