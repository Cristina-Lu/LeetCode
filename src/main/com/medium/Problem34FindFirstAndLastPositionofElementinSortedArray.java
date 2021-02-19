package com.medium;

public class Problem34FindFirstAndLastPositionofElementinSortedArray {
    /*
    * 题目
    * 给定一个按照升序排列的整数数组 nums，和一个目标值 target。
    * 找出给定目标值在数组中的开始位置和结束位置。
    * 如果数组中不存在目标值 target，返回 [-1, -1]。
    * 要求，时间复杂度为O（log n）
    * */

    /*
    * 思路1：
    * 二分法找到target，然后找到在该位置前找到第一个小于target的值，
    * 在该位置后找到第一个大于target的值
    * */
    public int[] searchRange(int[] nums, int target){
        int left = 0,right = nums.length-1,tag = -1;
        int[] result = {-1,-1};
        //二分法找到target
        while (left<=right){
            tag = (left+right)/2;
            if(nums[tag] == target){
                break;
            }
            if(nums[tag] > target){
                right = tag-1;
            }else {
                left = tag+1;
            }
        }
        if(left > right){
            return result;
        }

        left = tag;
        while (left>=0&&!(nums[left]<target)){
            --left;
        }
        right = tag;
        while (right<nums.length&&!(nums[right]>target)){
            ++right;
        }
        result[0]=left+1;
        result[1]=right-1;
        return result;

    }
    public int[] searchRange1(int[] nums, int target) {
        int[] result = new int[2];
        int length = nums.length;
        int left = 0,right = length-1,tag = -1;

        //二分法找到target
        while (left<=right){
            tag = (left+right)/2;
            if(nums[tag] == target){
                break;
            }
            if(nums[tag] > target){
                right = tag-1;
            }else {
                left = tag+1;
            }
        }
        if(left > right)
            return new int[]{-1, -1};
        /*
        * 二分法找到边界
        * 思路，tag≠target，tag+1或者tag-1 = target
        * */

        //找左边界
        int leftTag = (tag+left)/2,rTag = tag;
        while (!((leftTag ==0 && nums[leftTag]==target)||(nums[leftTag] == target && nums[leftTag-1] < target ))){
            if(nums[leftTag] >= target){
                rTag = leftTag-1;
            }else {
                left = leftTag+1;
            }
            leftTag = (rTag + left)/2;
        }

        //二分法找右边界
        rTag = tag;
        int rightTag = (rTag + right)/2;
        while (!((rightTag ==nums.length-1 && nums[rightTag]==target)||(nums[rightTag]==target && nums[rightTag+1] >target) )){
            if(nums[rightTag] <= target){
                rTag = rightTag+1;
            }else {
                right = rightTag-1;
            }
            rightTag = (rTag + right)/2;
        }

        result[0] = leftTag;
        result[1] = rightTag;

        return result;
    }
}
