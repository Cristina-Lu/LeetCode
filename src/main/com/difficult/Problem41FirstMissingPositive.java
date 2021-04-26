package com.difficult;


public class Problem41FirstMissingPositive {
    public int firstMissingPositive(int[] nums) {
        int length =nums.length;
        int[] falgs = new int[length+1];
        for (int i:nums){
            if(i<length+1&&i>0){
                falgs[i]=1;
            }
        }
        for(int i=1;i<length+1;++i){
            if(falgs[i]==0){
                return i;
            }
        }
        return length+1;
    }
}
