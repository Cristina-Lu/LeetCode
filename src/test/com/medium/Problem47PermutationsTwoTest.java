package com.medium;

import org.junit.Test;

public class Problem47PermutationsTwoTest {
    @Test
    public void test(){
        Problem47PermutationsTwo problem47PermutationsTwo
                = new Problem47PermutationsTwo();
        System.out.println(problem47PermutationsTwo.permuteUnique(new int[]{1,2,1}));
        System.out.println(problem47PermutationsTwo.permuteUnique(new int[]{1,1,2,2}));
    }
}
