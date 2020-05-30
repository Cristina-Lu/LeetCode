package test.java.medium;

import main.java.medium.ProblemTwelveIntegerToRoman;
import org.junit.Test;

public class ProblemTwelveIntegerToRomanTest {
    @Test
    public void tests(){
        ProblemTwelveIntegerToRoman problemTwelveIntegerToRoman
                =new ProblemTwelveIntegerToRoman();
        System.out.println(problemTwelveIntegerToRoman.intToRoman(3499));
    }
}
