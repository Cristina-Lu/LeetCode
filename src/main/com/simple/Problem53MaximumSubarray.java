package com.simple;

public class Problem53MaximumSubarray {
    //普通解法
    public int maxSubArray1(int[] nums) {
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

    //优化内存
    public int maxSubArray2(int[] nums) {
        int maxNum = nums[0];
        int Max=nums[0];
        for(int i=1;i<nums.length;++i){
            int sum =maxNum+nums[i];
            if(sum>nums[i]){
                maxNum=sum;
            }else {
                maxNum=nums[i];
            }
            if(Max<maxNum){
                Max = maxNum;
            }
        }
        return Max;
    }

    //二次优化
    public int maxSubArray(int[] nums) {
        int maxNum = nums[0];
        int Max=nums[0];
        for(int i=1;i<nums.length;++i){
            maxNum = Math.max(nums[i],maxNum+nums[i]);
            Max = Math.max(maxNum,Max);
        }
        return Max;
    }
}
