package com.simple;

public class Problem69SqortXForMyself {
    /*
    * 二分法,端点为[0,x)
    * 需要考虑int的数值界限问题，int的最大值除以二再平方是一定会越界的，所以需要采用除法
    * */
    public int mySqrt(int x) {
        if(x==1)
            return x;
        if(x==0)
            return x;
        int start =0;
        int end = x;
        int now ;
        do{
            //确定当前循环的值
            now =(start+end)/2;
            if(now<=x/now && (now+1)>x/(now+1)){
                break;
            }else if(now>x/now){
                end=now;
            }else{
                start = now;
            }
        }while (true);
        //System.out.println(Math.sqrt(x));
        return now;
    }
}
