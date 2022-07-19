package com.medium;

import org.junit.Test;

public class Problem80RemoveDuplicatesfromSortedArrayTest {
    @Test
    public void test(){
        Problem80RemoveDuplicatesfromSortedArray problem80RemoveDuplicatesfromSortedArray
                = new Problem80RemoveDuplicatesfromSortedArray();
        int[] num = {1,1,1,2,2,3};
        System.out.println(problem80RemoveDuplicatesfromSortedArray.removeDuplicates(num));
        int[] num1 = {0,0,1,1,1,1,2,3,3};
        System.out.println(problem80RemoveDuplicatesfromSortedArray.removeDuplicates(num1));
    }
}
