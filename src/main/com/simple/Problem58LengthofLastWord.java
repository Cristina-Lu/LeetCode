package com.simple;

public class Problem58LengthofLastWord {
    public int lengthOfLastWord(String s) {
        int num=0;
        boolean isTrue = false;
        for (int i= s.length()-1;i>=0;--i){
            if(!isTrue && s.charAt(i)!=' '){
                isTrue=true;
                ++num;
            }else if(isTrue && s.charAt(i)==' '){
                break;
            }else if(isTrue){
                ++num;
            }
        }
        return num;
    }
}
