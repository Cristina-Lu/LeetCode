package com.medium;

import org.junit.Test;

public class Problem22GenerateParenthesesTest {
    @Test
    public void test(){
        Problem22GenerateParentheses problem22GenerateParentheses
                =new Problem22GenerateParentheses();
        int n=4;
        System.out.println(
                problem22GenerateParentheses.generateParenthesis(4));
    }
}
