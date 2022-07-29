package com.medium;

import org.junit.Test;

public class Problem81SearchinRotatedSortedArrayIITest {
    @Test
    public void test(){
        Problem81SearchinRotatedSortedArrayII problem81SearchinRotatedSortedArrayII
                = new Problem81SearchinRotatedSortedArrayII();
        int[] nums = {4,5,6,0,2,3,3,4};
        System.out.println(
                problem81SearchinRotatedSortedArrayII.search(nums,5));
        int[] nums1 = {2,5,6,0,0,1,2};
        System.out.println(problem81SearchinRotatedSortedArrayII.search(nums1,3));
        int[] num2 ={1};
        System.out.println(problem81SearchinRotatedSortedArrayII.search(num2,1));
        //[2,2,2,3,2,2,2]
        //3
        int[] num3 = {2,2,2,2,2,2,3,2,2,2};
        System.out.println(problem81SearchinRotatedSortedArrayII.search(num3,3));
        int[] num4 = {1,0,1,1,1};
        System.out.println(problem81SearchinRotatedSortedArrayII.search(num4,0));
        int[] num5 = {1,0,1};
        System.out.println(problem81SearchinRotatedSortedArrayII.search(num5,1));
    }
}
