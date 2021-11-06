package com.medium;

public class Problem50FastPow {
    public double myPow(double x, int n) {
        double res = 1.0f;
        long b = n;
        if(n<0){
            x = 1/x;
            b=-b;
        }
        while (b>0){
            if((b&1)==1){
                res*=x;
            }
            x*=x;
            b>>=1;
        }
        return res;

    }
}
