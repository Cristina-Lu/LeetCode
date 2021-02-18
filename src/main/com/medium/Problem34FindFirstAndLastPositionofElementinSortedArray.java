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
    public int[] searchRange(int[] nums, int target) {
        int[] result = new int[2];
        int length = nums.length;
        int left = nums[0],right = nums[length-1],tag = length/2;

        //二分法找到target
        while (nums[tag] != target){
            if(nums[tag] > target){
                right = tag;
            }else {
                left = tag;
            }
            tag = (right + left)/2;
        }

        /*
        * 二分法找到边界
        * 思路，tag≠target，tag+1或者tag-1 = target
        * */

        return result;
    }
}
