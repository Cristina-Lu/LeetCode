package com.others;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MsProblem3Test {
    @Test
    public void test(){
        MsProblem3 msProblem3 = new MsProblem3();
        Integer[] nums1 ={};
        Integer[] nums2 ={2,4,6,8,10,12};
        List<Integer> list1 = Arrays.asList(nums1);
        List<Integer> list2 = Arrays.asList(nums2);

        System.out.println(msProblem3.mySort(list1,list2));
    }
}
