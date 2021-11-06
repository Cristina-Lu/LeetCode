package com.medium;

import org.junit.Test;

public class Problem50FastPowTest {
    @Test
    public void test(){
        Problem50FastPow problem50FastPow
                = new Problem50FastPow();
        System.out.println(problem50FastPow.myPow(3,5));
        System.out.println(problem50FastPow.myPow(3,-5));
        System.out.println(problem50FastPow.myPow(2.0,-2147483648));
    }
}
