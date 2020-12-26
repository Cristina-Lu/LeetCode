package java.medium;

import org.junit.Test;

public class ProblemSixZigZagConversionTest {
    @Test
    public void Tests(){
        ProblemSixZigZagConversion problemSixZigZagConversion = new ProblemSixZigZagConversion();
        String s = "asdfg";

        System.out.println(problemSixZigZagConversion.convert(s,1));


        System.out.println(problemSixZigZagConversion.convert(s,2));


        System.out.println(problemSixZigZagConversion.convert(s,3));


        System.out.println(problemSixZigZagConversion.convert(s,5));


        System.out.println(problemSixZigZagConversion.convert(s,8));
    }
}
