package com.simple;

public class Problem26RemoveDuplicatesFromSortedArray {
    /*
    * 空间复杂度更低的解法
    * */
    public int removeDuplicates(int[] nums) {
        if (nums == null) return 0;
        int j = 0;
        for (int i = 1; i < nums.length; i ++) {
            if (nums[i] != nums[j]) {
                j ++;
                nums[j] = nums[i];
            }
        }
        return j + 1;

    }
    /*
    * 1ms 98.11%
    *
    * 41.8MB 5.74%
    * */
    public int removeDuplicates1(int[] nums) {
        int size=1;
        int now=0;
        for(int i=1;i<nums.length;++i){
            if(nums[i-1]!=nums[i]){
                ++now;
                ++size;
                if(now!=i){
                    nums[now]=nums[i];
                }
            }
        }
        return size;
    }
}
