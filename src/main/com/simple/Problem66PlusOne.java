package com.simple;

import java.util.Arrays;

public class Problem66PlusOne {
    public int[] plusOne(int[] digits) {
        //确定数组的长度，以定位个位
        int digit = digits.length;
        //初始化当前位置要增加的量（个位为加一，其他位为进位数）
        int t=1;
        for (int i = digit-1;i>=0;--i){
            int m = digits[i]+t;
            t=0;
            digits[i]= m%10;
            if(m>9){
                t=m/10;
            }else {
                break;
            }
        }
        int newDigits[];
        if(t!=0){
            newDigits = new int[digit+1];
            /*
             * src=>即digits，源数组
             * srcPos=>源数组复制到目标数组的起始位置
             * dest=>即newDigits，目标数组
             * destPos=>目标数组中开始接受源数组数据的位置
             * length=>即digit，需要从源数组中复制的位数
            */
            System.arraycopy(digits,0,newDigits,1,digit);
            newDigits[0]=t;
        }else {
            newDigits = digits;
        }
        return newDigits;
    }
}
