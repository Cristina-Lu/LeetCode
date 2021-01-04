package com.difficult;

import java.util.ArrayList;
import java.util.List;


public class Problem30SubstringWithConcatenationOfAllWords {
    //无法通过测试用例5
    public List<Integer> findSubstring(String s, String[] words) {
        int num = s.length();
        int length = words[0].length();
        int[] nums = new int[num];
        for(int i = 0;i<words.length;++i){
            for(int j=0,k=0;j<num;++j){
                if(s.charAt(j)==words[i].charAt(k)){
                    k++;
                }else if(k!=0){
                    k=0;
                }
                if(k==length){
                    if(nums[j-length+1]==0){
                        nums[j-length+1]=i+1;
                        j=j-length+1;
                    }
                    k=0;
                }
            }
        }
        int chazhi=0;
        for(int i=0;i<words.length;++i){
            boolean tag = false;
            for(int k=0;k<i;++k){
                if(words[k].equals(words[i])){
                    tag=true;
                    break;
                }
            }
            if(tag)continue;;
            for(int j=i+1;j<words.length;++j){
                if(words[i].equals(words[j])){
                    chazhi += j-i;
                }
            }
        }


        List<Integer> trueList = new ArrayList<>();
        int trueSum=(1+words.length)*words.length/2;
        for(int i=0;i<num;++i){
            int sum = 0;
            if(nums[i]!=0){
                for(int j=0;j<words.length;++j){
                    if(i+j*length<num){
                        sum += nums[i+j*length];
                    }else{
                        sum=0;
                    }
                }
            }
            if(trueSum == sum+chazhi){
                boolean tag2 = false;
                String ss=s.substring(i,i+words.length*length);
                for(int j=0;j<words.length;++j){
                    if(ss.indexOf(words[j])==-1){
                        tag2 =true;
                        break;
                    }
                }
                if(tag2)continue;
                trueList.add(i);
            }
        }
        return trueList;
    }
}
