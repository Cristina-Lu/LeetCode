package com.medium;

import org.junit.Test;

public class Problem34FindFirstAndLastPositionofElementinSortedArrayTest {
    @Test
    public void test(){
        Problem34FindFirstAndLastPositionofElementinSortedArray problem34FindFirstAndLastPositionofElementinSortedArray
                = new Problem34FindFirstAndLastPositionofElementinSortedArray();

        int[] nums = {1,2,3,3,4,5,5,5,5,6,7,7,7,7};
        //当tag非最前也非最后时
        int[] result = problem34FindFirstAndLastPositionofElementinSortedArray.searchRange(nums,3);
        for(int i = 0; i<result.length;++i){
            System.out.print(result[i]+" ");
        }
        }
}
