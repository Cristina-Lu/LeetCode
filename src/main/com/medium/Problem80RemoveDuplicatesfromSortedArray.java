package com.medium;

public class Problem80RemoveDuplicatesfromSortedArray {
    public int removeDuplicates(int[] nums) {
        int length = 0;
        int now = nums[0],nowi = 0;
        for (int i = 0; i < nums.length; i++) {
            if(now == nums[i]){
                nowi++;
            }else {
                now = nums[i];
                nowi = 1;
            }
            if(nowi <3){
                nums[length] = nums[i];
                length++;
            }
        }
        return length;
    }
}
