package test.java.simple;

import main.java.simple.Problem20ValidParentheses;
import org.junit.Test;

public class Problem20ValidParenthesesTest {
    @Test
    public void Test(){
        Problem20ValidParentheses problem20ValidParentheses
                =new Problem20ValidParentheses();
        String s="{}[]()";//true
        //String s="{}[]()[";//false
        //String s="[{()}]";//true
        //String s="([{]})";//false
        //String s="[{}]()";//true
        //String s="[{[}]";//false
        //String s="((";//false
        //String s="]";//false
        System.out.println(problem20ValidParentheses.isValid(s));
    }
}
