package main.java.medium;

import java.util.*;

public class Problem15ThreeNumbers {
    /*
    * 27ms 51.35%
    *
    * 43MB 100%
    *
    *
    * */
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result=new ArrayList<>();
        if(nums.length<3) return result;
        //排序
        Arrays.sort(nums);
        for (int i = 0; i <nums.length-2 ; i++) {
            //消重
            if(i>0 && nums[i]==nums[i-1])continue;
            int j=i+1;
            int k=nums.length-1;
            int flag=-nums[i];
            while (j<k){
                if(nums[j]+nums[k]==flag){
                    List<Integer> list = new ArrayList(3);
                    list.add(nums[i]);
                    list.add(nums[j]);
                    list.add(nums[k]);
                    result.add(list);
                    while (j<k &&nums[j]==nums[j+1]){
                        ++j;
                    }
                    while (j<k && nums[k]==nums[k-1]){
                        --k;
                    }
                    ++j;
                    --k;
                }else if(nums[j]+nums[k]<flag){
                    ++j;
                }else {
                    --k;
                }
            }
        }
        return result;
    }
}
