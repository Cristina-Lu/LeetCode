package test.java.medium;

import main.java.medium.ProblemEightStringToInteger;
import org.junit.Test;

public class ProblemEightStringToIntegerTest {
    @Test
    public void Tests(){
        ProblemEightStringToInteger problemEightStringToInteger =new ProblemEightStringToInteger();
        //String s = "my 123";
        //String s = "  -23";

        //String s = "234 sdlk";
        //String s = "-91283472332";
        //String s= "  002340";
        //String s="+-23";
        //String s = " +0 234";
        //String s="9223372036854775808";

        //String s="-9223372036854775808";
        String s="0-1";
        System.out.println(problemEightStringToInteger.myAtoi(s));
    }
}
