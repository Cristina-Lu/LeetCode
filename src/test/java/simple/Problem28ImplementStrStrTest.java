package test.java.simple;

import main.java.simple.Problem28ImplementStrStr;
import org.junit.Test;

public class Problem28ImplementStrStrTest {
    @Test
    public void tests(){
        Problem28ImplementStrStr problem28ImplementStrStr
                =new Problem28ImplementStrStr();
        /*String haystack="nopqrstabcdefabcdefghijklmnopqrst";
        String needle="rstabcdefabcdefghijklmnopq";*/
        /*String haystack="mississippi";
        String needle="pi";//9*/

        /*String haystack="aabaaabaaac";
        String needle="aabaaac";//4*/

        String haystack="bbbbababbbaabbba";
        String needle="abb";//6
        System.out.println(problem28ImplementStrStr.strStr(haystack,needle));
    }
}
