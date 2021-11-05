package com.medium;

public class Problem55JumpGame {
    //深度优先搜素
    public boolean canJump1(int[] nums) {

        return dfs(nums,0);
    }
    private boolean dfs(int[] nums,int place){
        if(place+nums[place]>=nums.length-1){
            return true;
        }else if(nums[place]==0){
            return false;
        }
        int max=0;
        int maxi=place;
        for (int i=1;i<=nums[place];++i){
            if(i+nums[place+i]>=max){
                max=i+nums[place+i];
                maxi=place+i;
            }
        }
        return dfs(nums,maxi);
    }

    public boolean canJump(int[] nums) {
        for (int i=0;i<nums.length;){
            int max=0;
            int maxi=i;
            for (int j=1;j<=nums[i];++j){
                if(i+j>=nums.length)return true;
                if(j+nums[i+j]>=max){
                    max = j+nums[i+j];
                    maxi=i+j;
                }
            }
            i=maxi;
            if(i+nums[i]>=nums.length-1){
                return true;
            }else if(nums[i]==0){
                return false;
            }
        }
        return false;
    }
}
