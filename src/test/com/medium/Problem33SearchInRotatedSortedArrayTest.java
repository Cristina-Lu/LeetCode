package com.medium;

import org.junit.Test;

public class Problem33SearchInRotatedSortedArrayTest {
    @Test
    public void test(){
        Problem33SearchInRotatedSortedArray problem33SearchInRotatedSortedArray
                = new Problem33SearchInRotatedSortedArray();
        /*int[] nums = {4,5,6,7,0,1,2};
        int target = 0;//4*/

        /*int[] nums ={6};
        int target = 0;*/

        /*int[] nums ={6};
        int target = 6;//0*/

        /*int[] nums = {4,5,7,8,0,1,2};
        int target = 6;*/

        /*int[] nums = {4,5,7,8,0,1,2};
        int target = 3;//-1*/

        /*int[] nums = {4,5};
        int target = 6;*/

        int[] nums = {4,5,7,8};
        int target = 6;



        System.out.println(problem33SearchInRotatedSortedArray.search(nums,target));
    }
}
