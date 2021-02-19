package com.medium;

import org.junit.Test;

public class Problem34FindFirstAndLastPositionofElementinSortedArrayTest {
    @Test
    public void test(){
        Problem34FindFirstAndLastPositionofElementinSortedArray problem34FindFirstAndLastPositionofElementinSortedArray
                = new Problem34FindFirstAndLastPositionofElementinSortedArray();

        int[] nums = {1,1,2,3,3,4,5,5,5,5,7,7,7,7};
        //当target非最前也非最后且有重复值
        int[] result = problem34FindFirstAndLastPositionofElementinSortedArray.searchRange(nums,3);//3,4
        //当target在最后且有重复值
        //int[] result = problem34FindFirstAndLastPositionofElementinSortedArray.searchRange(nums,7);//10,13
        //当target在最前且有重复值
        //int[] result = problem34FindFirstAndLastPositionofElementinSortedArray.searchRange(nums,1);//0,1
        //当target居中且无重复值
        //int[] result = problem34FindFirstAndLastPositionofElementinSortedArray.searchRange(nums,4);//5,5
        //当target不在nums中
        //int[] result = problem34FindFirstAndLastPositionofElementinSortedArray.searchRange(nums,6);//-1,-1

        /*int[] nums ={1,2,3,4,5,6,7};
        //当target在最前且无重复值
        //int[] result = problem34FindFirstAndLastPositionofElementinSortedArray.searchRange(nums,1);
        //当target在最后且无重复值
        //int[] result = problem34FindFirstAndLastPositionofElementinSortedArray.searchRange(nums,7);//6,6*/

        /*//当nums内无元素时
        int[] nums ={};
        int[] result = problem34FindFirstAndLastPositionofElementinSortedArray.searchRange(nums,7);//-1,-1*/

        //提交用例测试
        /*int[] nums = {5,7,7,8,8,10};
        int[] result = problem34FindFirstAndLastPositionofElementinSortedArray.searchRange(nums,6);*/

        /*int[] nums = {0,0,0,1,2,3};
        int[] result = problem34FindFirstAndLastPositionofElementinSortedArray.searchRange(nums,0);*/

        for(int i = 0; i<result.length;++i){
            System.out.print(result[i]+" ");
        }
        }
}
