package com.medium;

public class Problem31NextPermutation {
    public void nextPermutation(int[] nums) {
        int pro = -1;
        int theI=0;
        for ( theI = nums.length-1; theI>0 ; --theI) {
            if(nums[theI]<pro){
                pro = nums[theI];
                break;
            }
            pro = nums[theI];
        }
        Boolean flag = false;
        for(int theJ =nums.length-1;theJ>theI;--theJ){
            if(nums[theJ]>nums[theI]){
                int temp =nums[theI];
                nums[theI] = nums[theJ];
                nums[theJ] = temp;
                flag = true;
                break;
            }
        }
        if(flag) ++theI;
        for(int theJ =nums.length-1;theJ>theI;--theJ,++theI){
            int temp =nums[theI];
            nums[theI] = nums[theJ];
            nums[theJ] = temp;
        }
        for (int t:nums) {
            System.out.print(t+",");
        }
    }
}
