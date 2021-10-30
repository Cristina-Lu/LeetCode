package com.medium;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Problem45JumpGame {
    public int jump(int[] nums) {
        if(nums.length==1) return 0;
        return dfs(nums,0,0);
    }

    private int dfs(int[] nums,int jumpTime,int place){
        if(place<nums.length && place+nums[place]>=nums.length-1){//如果该位置最大可到达位置已经大于数组长度，即再跳一次即可到达边界
            return jumpTime+1;
        }
        int max = nums[place];//记录当前可跳跃的最长距离
        int maxPlace = 1;//初始化本次跳跃距离
        for(int i=1;i<=max;++i)
        {
            if(place+i<nums.length && maxPlace+nums[place+maxPlace]<=i+nums[place+i]){//取本次跳跃长度与下次最大可跳跃长度的最大值（贪心算法总思想）
                maxPlace=i;
            }
        }
        return dfs(nums,jumpTime+1,place+maxPlace);//进行下一次跳跃
    }

}
