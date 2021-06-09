package com.medium;

import org.junit.Test;

public class Problem43MultiplyStringsTest {
    @Test
    public void test(){
        Problem43MultiplyStrings problem43MultiplyStrings
                =new Problem43MultiplyStrings();
        /*String num1="1234";
        String num2="234";*/
        String num1="123456789";
        String num2="987654321";
        System.out.println(problem43MultiplyStrings.multiply(num1,num2));

    }
}
