package com.medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Problem47PermutationsTwo {
    public List<List<Integer>> permuteUnique(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(nums);
        return dfs(result,new Integer[nums.length],nums,new int[nums.length],0);
    }
    private List<List<Integer>> dfs(List<List<Integer>> result,Integer[]rResult,int[] nums,int[] flag,int t){
        if(t==nums.length){
            List<Integer> myResult = new ArrayList<>(Arrays.asList(rResult));
            result.add(myResult);
            return null;
        }
        for(int i=0;i<nums.length;++i){
            if(flag[i]==1 || i!=0 && nums[i-1]==nums[i] && flag[i-1]==0 ){
                continue;
            }
            flag[i]=1;
            rResult[t]=nums[i];
            dfs(result,rResult,nums,flag,t+1);
            flag[i]=0;
            rResult[t]=0;
        }
        return result;
    }
}
