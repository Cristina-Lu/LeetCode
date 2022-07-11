package com.difficult;

import org.junit.Test;

public class Problem76MinimumWindowSubstringTest {
    @Test
    public void test(){
        Problem76MinimumWindowSubstring problem76MinimumWindowSubstring =
                new Problem76MinimumWindowSubstring();
        System.out.println(
                problem76MinimumWindowSubstring.minWindow("ADOBECODEBANC","ABC"));
        System.out.println(
                problem76MinimumWindowSubstring.minWindow("AC","AAC"));
        System.out.println(
                problem76MinimumWindowSubstring.minWindow("a","a"));
        System.out.println(
                problem76MinimumWindowSubstring.minWindow("ab","a"));
    }
}
