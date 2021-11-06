package com.simple;

import org.junit.Test;

public class Problem58LengthofLastWordTest {
    @Test
    public void test(){
        Problem58LengthofLastWord problem58LengthofLastWord
                = new Problem58LengthofLastWord();
        System.out.println(problem58LengthofLastWord.lengthOfLastWord(
                "hello world"));
        System.out.println(problem58LengthofLastWord.lengthOfLastWord(
                "fls me    skdj     "));
    }
}
