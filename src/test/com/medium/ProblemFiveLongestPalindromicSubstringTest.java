package com.medium;

import org.junit.Test;

public class ProblemFiveLongestPalindromicSubstringTest {
    @Test
    public void Tests(){
        ProblemFiveLongestPalindromicSubstring problemFiveLongestPalindromicSubstring
                =new ProblemFiveLongestPalindromicSubstring();
        //String s="babaaaabab";
        //String s="babaaa";
        //String s="cbanabsss";
        //String s = "cbanab";
        //String s ="";
        //String s="cbanabssbabaaaaaaaaa";
        //String s="cbba";
        //String s="aaaa";
        //String s="a";
        String s="ac";
        System.out.println(
                problemFiveLongestPalindromicSubstring.longestPalindrome(s));
    }
}
