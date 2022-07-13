package com.medium;

import java.util.ArrayList;
import java.util.List;

public class Problem78Subsets {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        result.add(new ArrayList<>());
        dfs(nums ,1,result,new ArrayList<>());
        return result;
    }

    private void dfs(int[] nums , int start ,List<List<Integer>> result,List<Integer>nowResult){
        for (int i = start; i <= nums.length; i++) {
            nowResult.add(nums[i-1]);
            result.add(new ArrayList<>(nowResult));
            dfs(nums,i+1,result ,nowResult);
            nowResult.remove(new Integer(nums[i-1]));
        }
    }
}
