package com.medium;

import java.util.ArrayList;
import java.util.List;

public class Problem46Permutations {
    public List<List<Integer>> permute(int[] nums) {

        List<List<Integer>> result = new ArrayList<>();
        return dfs(result,new ArrayList<>(),nums,new int[nums.length]);

    }

    private List<List<Integer>> dfs(List<List<Integer>> result,ArrayList<Integer> rResult,int[] nums,int[] flag){
        if(rResult.size()==nums.length){
            result.add(new ArrayList<>(rResult));
            return null;
        }
        for(int i=0;i<nums.length;++i){
            if(flag[i]==1){
                continue;
            }
            flag[i]=1;
            rResult.add(nums[i]);
            dfs(result,rResult,nums,flag);
            flag[i]=0;
            rResult.remove(new Integer(nums[i]));
        }
        return result;
    }

    /*
    * 0,1,2,3,4
    * 0,1,2,4,3
    * 0,1,3,2,4
    * */
}
