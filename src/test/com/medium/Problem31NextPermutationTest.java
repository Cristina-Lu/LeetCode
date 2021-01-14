package com.medium;

import org.junit.Test;

public class Problem31NextPermutationTest {
    @Test
    public void test(){
        //int[] nums={1,2,3};
        //int[] nums={1,2,3,4,5};
        //int[] nums={1,2,3,5,4};
        //int[] nums={1,2,4,3,5,};
        //int[] nums={1,2,4,5,3};
        //int[] nums={1,2,5,3,4};
        //int[] nums={1,2,5,4,3};
        //int[] nums={1,3,2,4,5};
        //int[] nums={1,3,2,5,4};
        //int[] nums={1,3,4,2,5};
        //int[] nums={1,3,4,5,2};
        //int[] nums={1,3,5,2,4};
        //int[] nums={5,4,3,2,1};

        int[] nums={1,3};



        Problem31NextPermutation problem31NextPermutation
                =new Problem31NextPermutation();
        problem31NextPermutation.nextPermutation(nums);
    }
}
