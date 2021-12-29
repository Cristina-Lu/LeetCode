package com.others;

public class Problem1FromWangFanXin {
    public Integer theSum(int n){
        int number = 2*n-1;
        int sum = 1;
        //if(n==1)return sum;
        for (int i = 1; i <n ; i++) {
            sum = i+2+2*sum;
        }
        return sum;
    }

}
