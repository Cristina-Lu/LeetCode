package com.simple;

import org.junit.Test;

public class Problem35SearchInsertPositionTest {
    @Test
    public void test(){
        Problem35SearchInsertPosition problem35SearchInsertPosition
                = new Problem35SearchInsertPosition();
        int[] nums = {1,3,5,8,10};
        System.out.println(problem35SearchInsertPosition.searchInsert(nums,8));
        System.out.println(problem35SearchInsertPosition.searchInsert(nums,7));
        System.out.println(problem35SearchInsertPosition.searchInsert(nums,9));
        System.out.println(problem35SearchInsertPosition.searchInsert(nums,2));
        System.out.println(problem35SearchInsertPosition.searchInsert(nums,11));



    }
}
