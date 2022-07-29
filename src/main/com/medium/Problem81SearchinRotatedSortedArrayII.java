package com.medium;

public class Problem81SearchinRotatedSortedArrayII {
    public boolean search(int[] nums, int target) {
        int left = 0,right = nums.length-1;
        while (left < right){
            int mid = (left + right)/2;
            while (nums[left] == nums[right] && left<right){
                if(nums[left] == target || nums[right] == target){
                    return true;
                }
                left++;
                right--;
            }
            if(nums[left] == target || nums[right] == target){
                return true;
            }
            if(nums[mid]<nums[0]^target<nums[0]^target>nums[mid]){
                left = mid +1;
            }else {
                right = mid;
            }
        }
        if(nums[left] == target){
            return true;
        }
        return false;
    }
}
