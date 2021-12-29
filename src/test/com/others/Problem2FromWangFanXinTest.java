package com.others;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

public class Problem2FromWangFanXinTest {
    @Test
    public void test(){
        Problem2FromWangFanXin problem2FromWangFanXin
                = new Problem2FromWangFanXin();
        Integer[] tests ={1,2,5,4,8,2,4,5,6,88,56,45,15,26,75,45,15,23,46,58,15,3,61,54,25,23,
        84,75,95,48,62,35,48,26,46,58,94,65,84,65,51,26,35,64,57,48,56,25,15,24,64,58,35,48,56,
        15,14,57,48,95,45,65,25,13,28,65};
        System.out.println(problem2FromWangFanXin.statistic(
                new ArrayList<Integer>(Arrays.asList(tests))));

    }
}
