package com.simple;

import org.junit.Test;

public class Problem69SqortXForMyselfTest {
    @Test
    public void test(){
        Problem69SqortXForMyself problem69SqortXForMyself = new Problem69SqortXForMyself();
        int x=8;
        System.out.println("x="+x+",and the sqort is "+problem69SqortXForMyself.mySqrt(x));

        int x1=12;
        System.out.println("x="+x1+",and the sqort is "+problem69SqortXForMyself.mySqrt(x1));

        int x2=4;
        System.out.println("x="+x2+",and the sqort is "+problem69SqortXForMyself.mySqrt(x2));

        int x3=1;
        System.out.println("x="+x3+",and the sqort is "+problem69SqortXForMyself.mySqrt(x3));

        int x4=2147395599;
        System.out.println("x="+x4+",and the sqort is "+problem69SqortXForMyself.mySqrt(x4));
    }
}
