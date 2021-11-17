package com.difficult;

import org.junit.Test;

public class Problem60PermutationSequenceTest {

    @Test
    public void test(){
        Problem60PermutationSequence problem60PermutationSequence
                = new Problem60PermutationSequence();

        System.out.println(problem60PermutationSequence.getPermutation(3,3));
        System.out.println(problem60PermutationSequence.getPermutation(4,9));
        System.out.println(problem60PermutationSequence.getPermutation(4,1));
        System.out.println(problem60PermutationSequence.getPermutation(3,2));


    }
}
