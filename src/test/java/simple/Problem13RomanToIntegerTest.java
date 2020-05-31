package test.java.simple;

import main.java.simple.Problem13RomanToInteger;
import org.junit.Test;

public class Problem13RomanToIntegerTest {
    @Test
    public void tests(){
        Problem13RomanToInteger problem13RomanToInteger
                =new Problem13RomanToInteger();
        System.out.println(problem13RomanToInteger.romanToInt("IX"));
    }
}
