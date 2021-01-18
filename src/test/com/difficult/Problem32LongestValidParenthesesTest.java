package com.difficult;

import org.junit.Test;

public class Problem32LongestValidParenthesesTest {
    @Test
    public void test(){
        Problem32LongestValidParentheses problem32LongestValidParentheses
                =new Problem32LongestValidParentheses();

        //String s = ")((()()))(";
        //String s = ")()())";
        String s = "(()";
        System.out.println(problem32LongestValidParentheses.longestValidParentheses(s));
    }
}
