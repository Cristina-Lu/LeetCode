package com.difficult;

import org.junit.Test;

public class Problem30SubstringWithConcatenationOfAllWordsTest {
    @Test
    public void test(){
        Problem30SubstringWithConcatenationOfAllWords problem30SubstringWithConcatenationOfAllWords
                =new Problem30SubstringWithConcatenationOfAllWords();
        /*//测试用例1
        String s="barfoofoobarthefoobarman";
        String[] m = {"bar","foo","the"};//[6,9,12]*/

        /*//测试用例2
        String s = "wordgoodgoodgoodbestword";
        String[] m = {"word","good","best","word"};//[]*/

        /*//测试用例3
        String s = "ababababab";
        String[] m = {"ababa","babab"};//[0]*/

        /*//测试用例4
        String s="thethethethe";
        String[] m = {"foo","foo","the","man"};//[]*/

        //测试用例5
        String s="bcabbcaabbccacacbabccacaababcbb";
        String[] m = {"c","b","a","c","a","a","a","b","c"};//[6,16,17,18,19,20]
        System.out.println(problem30SubstringWithConcatenationOfAllWords.findSubstring(s,m));

    }
}
