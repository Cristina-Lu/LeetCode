package java.simple;

import org.junit.Test;

public class ProblemNinePalindromeNumberTest {
    @Test
    public void tests(){
        ProblemNinePalindromeNumber problemNinePalindromeNumber
                = new ProblemNinePalindromeNumber();
        int x=1;
        //int x=121;
        //int x=-121;
        //int x=10;
        //int x=1234321;
        //int x=1234654321;
        System.out.println(problemNinePalindromeNumber.isPalindrome(x));

    }
}
