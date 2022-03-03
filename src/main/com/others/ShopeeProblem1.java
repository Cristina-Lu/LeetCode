package com.others;


public class ShopeeProblem1 {
    public int[] problem(int[] nums){

        int sum[]={0,0,0};
        for (int i=0;i<nums.length;++i){
            sum[nums[i]]++;
        }
        int j=0;
        for (int i=0;i<nums.length;++i){
            while (sum[j]==0){
                ++j;
            }
            nums[i]=j;
            sum[j]--;
        }
        return nums;
    }
}
