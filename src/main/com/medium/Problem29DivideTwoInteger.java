package com.medium;

import java.sql.SQLOutput;

public class Problem29DivideTwoInteger {
    //给定两个整数，被除数 dividend 和除数 divisor。将两数相除，要求不使用乘法、除法和 mod 运算符。
    //
    //返回被除数 dividend 除以除数 divisor 得到的商。
    //
    //整数除法的结果应当截去（truncate）其小数部分，例如：truncate(8.345) = 8 以及 truncate(-2.7335) = -2
    //
    //来源：力扣（LeetCode）
    //链接：https://leetcode-cn.com/problems/divide-two-integers
    //著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
    //提示：
    //被除数和除数均为 32 位有符号整数。
    //除数不为 0。
    //假设我们的环境只能存储 32 位有符号整数，其数值范围是 [−231,  231 − 1]。本题中，如果除法结果溢出，则返回 231 − 1。
    //


    //解题思路：考虑位运算或贪心算法

    public int divide(int dividend, int divisor){
        //除法的商就是可以从被除数中减去除数的次数而不使其为负的次数
        //左移没有溢出的话相当于乘以2

        if(dividend == divisor) return 1;
        if(divisor == Integer.MIN_VALUE) return 0;
        if((dividend == Integer.MIN_VALUE && divisor==-1)) return  Integer.MAX_VALUE;
        if(divisor ==1) return  dividend;
        long m = Math.abs(dividend),n=Math.abs(divisor);
        int sign = (dividend < 0) ^ (divisor < 0) ? -1 : 1;
        int res=0;//商
        if(dividend ==Integer.MIN_VALUE ) {
            m = Math.abs(dividend+n);
            res +=1;
        }
        while (m>=n){
            long t=n,p=1;
            while (m>(t<<1)){
                t=t<<1;
                p=p<<1;
            }
            res+=p;
            m-=t;
        }
        return sign==1?res:-res;
    }

    //位运算复习
    public void bitwise(int theFirst,int theSecond){
        //相比在代码中直接使用(+、-、*、/)运算符，合理的运用位运算更能显著提高代码在机器上的执行效率。

        //按位与
        //System.out.println(getType(theFirst&theSecond));//结果：java.lang.Integer
        //在输出时遇到错误，错误原因是与运算输出的数据类型为基础数据类型int，而非引用对象Integer，printf只对对象进行输出

        System.out.println("theFirst:"+Integer.toBinaryString(theFirst));
        System.out.println("theSecond:"+Integer.toBinaryString(theSecond));
        //按位与规则：只有两个都为1时才为1，其他时候都为0
        System.out.println("按位与："+Integer.valueOf(theFirst&theSecond)+"二进制："+Integer.toBinaryString(theFirst&theSecond));
        //按位或规则：只有两个都为0时才为0，其他时候都为1
        System.out.println("按位或："+Integer.valueOf(theFirst|theSecond)+"二进制："+Integer.toBinaryString(theFirst|theSecond));
        //按位异或规则：两个位相同为0，相异为1
        System.out.println("按位异或："+Integer.valueOf(theFirst^theSecond)+"二进制："+Integer.toBinaryString(theFirst^theSecond));
        //取反规则：0变成1，1变成0
        System.out.println("取反:"+ Integer.valueOf(~theFirst)+"二进制："+Integer.toBinaryString(~theFirst));
        //左移规则：各二进位全部左移若干位，高位丢弃，低位补0
        //左移一位，在不溢出的情况下，相当于乘以2，
        System.out.println("左移:"+Integer.valueOf(theFirst<<1)+"二进制"+Integer.toBinaryString(theFirst<<1));
        //右移规则：各二进位全部右移若干位，对无符号数，高位补0，对有符号数，高位补1
        System.out.println("左移:"+Integer.valueOf(~theFirst>>1)+"二进制"+Integer.toBinaryString(~theFirst>>1));

    }

    private static String getType(Object test) {
        //若 object为技术数据类型 int 则会输出其对应的引用类型Integer
        return test.getClass().getName();

    }
}














