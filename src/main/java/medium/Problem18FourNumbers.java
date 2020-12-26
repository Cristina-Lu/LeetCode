package java.medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Problem18FourNumbers {
    /*
    * 17ms 56.12%
    *
    * 40.4M 10.53%
    *
    * */
    public List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>>allSums = new ArrayList<>();
        Arrays.sort(nums);
        for(int i=0;i<=nums.length-4;++i){
            for(int j=i+1;j<=nums.length-3;++j){
                int s=j+1;
                int m=nums.length-1;
                int flag = target-nums[i]-nums[j];
                while (s<m){
                    if(nums[s]+nums[m]==flag){
                        List<Integer>mySums = new ArrayList<>();
                        mySums.add(nums[i]);
                        mySums.add(nums[j]);
                        mySums.add(nums[s]);
                        mySums.add(nums[m]);
                        allSums.add(mySums);
                        while (s<m && nums[s]==nums[s+1]){
                            ++s;
                        }
                        while(s<m && nums[m]==nums[m-1]){
                            --m;
                        }
                        while (j+1<s && nums[j]==nums[j+1]){
                            ++j;
                        }
                        while (i+1<j &&nums[i]==nums[i+1]){
                            ++i;
                        }
                        ++s;--m;
                    }else if(nums[s]+nums[m]<flag){
                        ++s;
                    }else {
                        --m;
                    }
                }
            }
        }
        return allSums;
    }
}
