package com.simple;

public class Problem70ClimbingStairs {

    /*
    * 假设你正在爬楼梯。需要 n 阶你才能到达楼顶。
    * 每次你可以爬 1 或 2 个台阶。你有多少种不同的方法可以爬到楼顶呢？
    * 注意：给定 n 是一个正整数。
    * */

    //动态规划思路优化
    public int climbStairs(int n) {
        if(n==1 || n==2 ||n==3){
            return n;
        }
        int[] list= new int[n+1];
        list[0]=0;
        list[1]=1;
        list[2]=2;
        list[3]=3;
        for (int i=4;i<n+1;++i){
            list[i]=list[i-1]+list[i-2];
        }
        return list[n];
    }

    //动态规划
    public int climbStairs1(int n) {
        if(n==1 || n==2 ||n==3){
            return n;
        }
        int[] list= new int[n+1];
        list[0]=0;
        list[1]=1;
        list[2]=2;
        list[3]=3;
        return dp(n,list);
    }

    public int dp(int n,int[] list){
        if(list[n]!=0){
            return list[n];
        }else {
            int result = dp(n-1,list)+dp(n-2,list);
            list[n]=result;
            return result;
        }
    }




}
