package com.simple;

import com.toolClasses.ToString;
import org.junit.Test;

public class Problem66PlusOneTest {
    @Test
    public void test(){
        Problem66PlusOne problem66PlusOne = new Problem66PlusOne();
        int digits[] = {1,2,3};//普通用例
        ToString.SingleInt(problem66PlusOne.plusOne(digits));
        //进位用例
        int digits1[] = {1,9,9};
        ToString.SingleInt(problem66PlusOne.plusOne(digits1));
        //增加位数用例
        int digits2[] ={9};
        ToString.SingleInt(problem66PlusOne.plusOne(digits2));
    }
}
