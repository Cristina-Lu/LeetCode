package java.simple;

import org.junit.Test;

public class ProblemSevenReverseIntegerTest {
    @Test
    public void Tests(){
        ProblemSevenReverseInteger problemSevenReverseInteger = new ProblemSevenReverseInteger();

        //int x=2147483647;
        //int x=2147483;
        //int x=-2147483648;
        //int x=-2147483647;

        //特殊测试用例，截取十六进制四位后仍是正数
        int x=1534236469;
        //int x=-21474836;
        System.out.println(problemSevenReverseInteger.reverse(x));
    }
}
