package com.medium;

import org.junit.Test;

public class Problem29DivideTwoIntegerTest {
    @Test
    public void test(){
        Problem29DivideTwoInteger problem29DivideTwoInteger
                =new Problem29DivideTwoInteger();

        //35:0010 0011
        //25:0001 1001
        //与:0000 0001
        //或:0011 1011
      //异或:0011 1010
      //取反:1101 1100
        problem29DivideTwoInteger.bitwise(35,25);

        System.out.println(problem29DivideTwoInteger.divide(-2147483648,2));
    }
}
