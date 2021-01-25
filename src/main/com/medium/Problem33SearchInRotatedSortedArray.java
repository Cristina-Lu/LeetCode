package com.medium;

public class Problem33SearchInRotatedSortedArray {
    public int search(int[] nums, int target) {
        int left = 0,right = nums.length-1;
        int test = nums[0],tLeft = left,tRight = right,aim=-1;
        if(right == 0){
            if(nums[0]==target)
                return 0;
            else
                return -1;
        }
        if(right == 1){
            if(nums[0] == target){
                return 0;
            }
            if (nums[1] == target){
                return 1;
            }
            return -1;
        }
        //二分法找到折点
        while (tLeft<tRight){
            aim = (tLeft+tRight)/2;
            if(aim+1<nums.length && nums[aim-1]>nums[aim]){
                break;
            }else if(nums[aim]>test){
                tLeft = aim;
            }else if(nums[aim]<test){
                tRight = aim;
            }
        }
        if(test<target){
            right = aim-1;
        }else if(test>target){
            if(target == nums[aim])
                return aim;
            left = aim;
        }else {
            return 0;
        }
        if(target>nums[aim-1]){
            return -1;
        }
        aim = -1;
        while (left+1 < right){
            aim = (left + right)/2;
            if(nums[aim]<target){
                left =aim;
            }else if(nums[aim]>target){
                right = aim;
            }else {
                break;
            }
        }
        if(left+1 >= right)
            return -1;
        else
            return aim;
    }
}
