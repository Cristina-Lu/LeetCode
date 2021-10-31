package com.medium;

import org.junit.Test;

public class Problem46PermutationsTest {
    @Test
    public void test(){
        Problem46Permutations problem46Permutations
                = new Problem46Permutations();
        System.out.println(problem46Permutations.permute(new int[]{1,2,3}));
        System.out.println(problem46Permutations.permute(new int[]{1,2}));
        System.out.println(problem46Permutations.permute(new int[]{1}));
    }
}
