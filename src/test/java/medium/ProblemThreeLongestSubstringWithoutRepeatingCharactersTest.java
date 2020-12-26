package java.medium;

import org.junit.Test;

public class ProblemThreeLongestSubstringWithoutRepeatingCharactersTest {

    @Test
    public void Tests(){
        ProblemThreeLongestSubstringWithoutRepeatingCharacters pc
                =new ProblemThreeLongestSubstringWithoutRepeatingCharacters();
        //String s="abiades";// sout 6
        //String s="";  //sout 0
        //String s="ssss";//1
        //String s="anskdiflda";//8
        //String s="anskdifldaqwer";//9
        //String s="anskdiflaqwer";//12
        //String s="asedffghj";//5
        String s="assdfghj";//6

        System.out.println(pc.lengthOfLongestSubstring(s));
    }
}
