package com.simple;

import org.junit.Test;

public class Problem26RemoveDuplicatesFromSortedArrayTest {
    @Test
    public void test(){
        Problem26RemoveDuplicatesFromSortedArray problem26RemoveDuplicatesFromSortedArray
                =new Problem26RemoveDuplicatesFromSortedArray();
        int[] tests={1,2,3,3,3,4,5};
        System.out.println(problem26RemoveDuplicatesFromSortedArray.removeDuplicates(tests));
    }
}
