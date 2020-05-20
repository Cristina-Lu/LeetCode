package main.java.medium;

import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.Map;

public class ProblemFiveLongestPalindromicSubstring {

    //10ms 92.38%
    //38.2M 25.89%
    //与longestPalindrome2的区别在于对字符串的操作都转变为对字符数组的操作
    //由此可知对字符数组的操作更为快速，尤其时访问字符串中单个字符时
    public String longestPalindrome(String s){
        if(s.length()==0)return s;
        Map<Integer,Integer> map = new IdentityHashMap<>();
        int startIndex = 0;
        int endIndex =0;
        char[] sMy = s.toCharArray();
        for(int i=0 ;i<sMy.length;++i){
            int l=i;int r=i;
            while (l>=0 && r<sMy.length &&sMy[l]==sMy[r]){
                --l;
                ++r;
            }
            int t=i;int p=i+1;
            while (t>=0&&p<sMy.length&&sMy[t]==sMy[p]){
                --t;++p;
            }

            int len = Math.max(p-t-1,r-l-1);
            if(len>endIndex-startIndex+1){
                startIndex = i-(len-1)/2;
                endIndex = i+len/2;
            }
        }
        return s.substring(startIndex,endIndex+1);
    }
    //动态规划改进版
    // 39ms 66.95%
    //38.2M 25.89%
    public String longestPalindrome2(String s){
        if(s.length()==0)return s;
        Map<Integer,Integer> map = new IdentityHashMap<>();
        int startIndex = 0;
        int endIndex =0;
        for(int i=0 ;i<s.length();++i){
            int l=i;int r=i;
            while (l>=0 && r<s.length() &&s.charAt(l)==s.charAt(r)){
                --l;
                ++r;
            }
            int t=i;int p=i+1;
            while (t>=0&&p<s.length()&&s.charAt(t)==s.charAt(p)){
                --t;++p;
            }

            int len = Math.max(p-t-1,r-l-1);
            if(len>endIndex-startIndex+1){
                startIndex = i-(len-1)/2;
                endIndex = i+len/2;
            }
        }
        return s.substring(startIndex,endIndex+1);
    }


    //动态规划 最直白的做法，遍历循环使用了多次，可以数以dps
    // 执行用时1266ms，5.01%
    // 内存消耗 40.7M 15.18%
    public String longestPalindrome1(String s) {
        if(s.length()==0)return s;
        Map<Integer,Integer> map = new IdentityHashMap<>();
        int startIndex = 0;
        int endIndex =0;
        for(int i=1;i<s.length();++i){
            if(i<s.length()-1&&s.charAt(i-1)==s.charAt(i+1)){
                map.put(new Integer(i-1),i+1);
                if(endIndex==0 || endIndex-startIndex==1){
                    startIndex=i-1;
                    endIndex = i+1;
                }
            }
            if(s.charAt(i-1)==s.charAt(i)){
                map.put(new Integer(i-1),i);
                if(endIndex==0){
                    startIndex=i-1;
                    endIndex = i;
                }
            }
        }
        for(int i=0;i<s.length()-3;++i){
            Map<Integer,Integer> nowMap = new IdentityHashMap<>();
            for(Map.Entry<Integer,Integer>temp :map.entrySet()){
                if(temp.getKey()==0||temp.getValue()==s.length()-1){
                    continue;
                }else{
                    if(s.charAt(temp.getKey()-1)==s.charAt(temp.getValue()+1)){
                        nowMap.put(new Integer(temp.getKey()-1),temp.getValue()+1);
                        if(endIndex-startIndex<temp.getValue()+1-(temp.getKey()-1)){
                            endIndex = temp.getValue()+1;
                            startIndex = temp.getKey()-1;
                        }
                    }
                }
            }
            if(nowMap.isEmpty()){
                break;
            }else {
                map.clear();
                map.putAll(nowMap);
            }
        }
        return s.substring(startIndex,endIndex+1);
    }
}
