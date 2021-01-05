package com.difficult;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class Problem30SubstringWithConcatenationOfAllWords {
    //无法通过测试用例5
    //在算法中使用数字替换相关信息在数字进行加减时容易出现原有逻辑之外的合适，需要增加更多限制条件，不建议使用该种方式
    public List<Integer> findSubstring1(String s, String[] words) {
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

    /*
    * 执行用时：24 ms, 在所有 Java 提交中击败了70.53%的用户
    * 内存消耗：38.9 MB, 在所有 Java 提交中击败了78.73%的用户
    */
    //滑动窗口，维护一个窗口长度
    public List<Integer> findSubstring(String s, String[] words){
        List<Integer> res = new ArrayList<>();
        if(s.isEmpty() || s==null||words.length==0 || words==null)
            return res;
        int words_num = words.length;
        int length = words[0].length();

        Map<String,Integer> map = new HashMap<>();
        for(String word:words){
            //对words中的单词进行map整理，整理后出现的情况是，key为word，value为该word出现的次数
            map.put(word,map.getOrDefault(word,0)+1);
        }
        //开始维护滑动窗口
        for(int i=0;i<length;++i){
            //设置滑动窗口标志
            int left = i;
            int right = i;
            //记录滑动统计次数
            int count = 0;
            //放置对截取字符串的整理结果
            Map<String,Integer> temp_map = new HashMap<>();
            while(right+length<=s.length()){
                //对s字符串进行定长字符的截取
                String ss = s.substring(right,right+length);
                //对截取出来的word进行汇总处理
                temp_map.put(ss,temp_map.getOrDefault(ss,0)+1);
                //滑动窗口
                right+=length;
                //记录滑动统计次数
                ++count;
                //如果该次汇总处理结果与原words汇总处理结果不同，则将左窗口按word长度前进，并消减相关word汇总信息
                while (temp_map.getOrDefault(ss,0)>map.getOrDefault(ss,0)){
                    String sss = s.substring(left,left+length);
                    temp_map.put(sss,temp_map.get(sss)-1);
                    //滑动窗口
                    left += length;
                    //记录滑动统计次数
                    --count;
                }
                if(count == words_num) res.add(left);
            }
        }
        return res;
    }
}
