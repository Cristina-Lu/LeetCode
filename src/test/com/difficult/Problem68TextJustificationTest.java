package com.difficult;

import org.junit.Test;

public class Problem68TextJustificationTest {
    @Test
    public void test(){
        Problem68TextJustification problem68TextJustification = new Problem68TextJustification();
        String[] words = {"This", "is", "an", "example", "of", "text", "justification."};
        System.out.println(problem68TextJustification.fullJustify(words,16));
        String[] word1 = {"What","must","be","acknowledgment","shall","be"};
        System.out.println(problem68TextJustification.fullJustify(word1,16));
        String[] word2 = {"My","momma","always","said,","\"Life","was","like",
                "a","box","of","chocolates.","You","never","know","what","you're","gonna","get."};
    }
}
