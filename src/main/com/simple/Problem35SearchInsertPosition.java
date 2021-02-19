package com.simple;

public class Problem35SearchInsertPosition {
    /*
    *给定一个排序数组和一个目标值，在数组中找到目标值，并返回其索引。
    * 如果目标值不存在于数组中，返回它将会被按顺序插入的位置。
    * 你可以假设数组中无重复元素。
    * */

    /*
    * 思路：标准二分查找
    * */
    public int searchInsert(int[] nums, int target) {
        int left = 0,right = nums.length,mid = -1;
        while (left<right){
            mid = (left + right)/2;
            if(nums[mid] == target){
                break;
            }else if(nums[mid] > target){
                right = mid;
            }else {
                left = mid+1;
            }
        }

          /*if(nums[mid] < target ){
                mid++;
            }*/

        return left;
    }
}
