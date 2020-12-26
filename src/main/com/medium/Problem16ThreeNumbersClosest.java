package com.medium;

import java.util.Arrays;

public class Problem16ThreeNumbersClosest {
    /*
    * 9ms 30.20%
    * 39.6% 6.82%
    * */
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        long min=Integer.MAX_VALUE;
        for(int i=0;i<nums.length;++i){
            int j=i+1;
            int k=nums.length-1;
            while (j<k){
                int mk=nums[i]+nums[j]+nums[k];

                if(Math.abs(target-mk)<Math.abs(target-min)){
                    min=mk;
                    int jj=j;
                    int kk=k;
                    while (j<k && nums[j]==nums[j+1]){
                        ++j;
                    }
                    if(j!=jj){--j;}
                    while (j<k &&nums[k]==nums[k-1]){
                        --k;
                    }
                    if(k!=kk){++k;}
                }
                if(target-mk>0){
                    ++j;
                }else if(target-mk<0){
                    --k;
                }else {
                    break;
                }
            }
        }
        return (int)min;
    }
}
