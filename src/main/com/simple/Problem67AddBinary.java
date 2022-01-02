package com.simple;

public class Problem67AddBinary {
    public String addBinary(String a, String b) {
        //确定循环长度
        int aLength = a.length();
        int bLength = b.length();
        int length = aLength>bLength?aLength:bLength;
        //明确进位位
        int t = 0;
        //明确结果指针
        StringBuffer result = new StringBuffer();
        for(int i= 0;i<length;++i){
            //确定当前循环的位值
            int aa = 0;
            int bb = 0;
            if(i<aLength){
                aa= a.charAt(a.length()-i-1)-'0';
            }
            if(i<bLength){
                bb = b.charAt(b.length()-i-1)-'0';
            }
            /*
            * offset：插入位置
            * i：插入的值
            */
            result.insert(0,(aa+bb+t)%2);
            t = (aa+bb+t)/2;
        }
        if(t!=0){
            result.insert(0,t);
        }
        return  result.toString();
    }
}
