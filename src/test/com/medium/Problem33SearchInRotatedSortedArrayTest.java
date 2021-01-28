package com.medium;

import org.junit.Test;

public class Problem33SearchInRotatedSortedArrayTest {
    @Test
    public void test(){
        Problem33SearchInRotatedSortedArray problem33SearchInRotatedSortedArray
                = new Problem33SearchInRotatedSortedArray();
        int[] nums = {4,5,6,7,0,1,2};
        int target = 0;//4//数组端值点问题

        /*int[] nums ={6};
        int target = 0;//-1*/

        /*int[] nums ={6};
        int target = 6;//0*/

        /*int[] nums = {4,5,7,8,0,1,2};
        int target = 6;//-1*/

        /*int[] nums = {4,5,7,8,0,1,2};
        int target = 3;//-1*/

        /*int[] nums = {4,5};
        int target = 6;//-1*/

        /*int[] nums = {4,5,6,7,8};
        int target = 6;//2*/


        /*int[] nums = {5,4};
        int target = 5;//0*/

        /*int[] nums = {5,6,7,8,9,10,4};
        int target = 10;//5*/

        /*int [] nums = {5,3,4};
        int target = -1;*/

        /*int[] nums = {12,5,6,7,8,9,10};
        int target = 12;//0*/


        System.out.println(problem33SearchInRotatedSortedArray.search(nums,target));
    }
}
