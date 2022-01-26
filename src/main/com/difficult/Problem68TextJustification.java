package com.difficult;

import java.util.ArrayList;
import java.util.List;

public class Problem68TextJustification {
    /*贪心法，
    * 第一遍遍历确认输出的行数和每行的单词数、空隔数
    * 第二遍组装String并输出
    * */
    public List<String> fullJustify(String[] words, int maxWidth) {
        int minLength = maxWidth;
        List<Integer> size = new ArrayList<>();//记录每行的所有空格数
        List<Integer> cows = new ArrayList<>();//记录每行的单词数
        int cowsize = 0;
        for (int i=0;i<words.length;++i){
            if(minLength<words[i].length()){//如果单行长度已经超过最大长度
                if(cows.size()!=0){
                    cows.add(i-cowsize);
                    cowsize=i;
                } else {
                    cows.add(i);
                    cowsize=i;
                }
                size.add(minLength+cows.get(cows.size()-1));//记录间隔数
                minLength =maxWidth;//重置当前行长度
                i--;//回退下标
            }else {
                minLength = minLength-words[i].length()-1;
                if(i==words.length-1){
                    if(cows.size()!=0){
                        cows.add(i-cowsize+1);
                    } else {
                        cows.add(i);
                    }
                    size.add(minLength+cows.get(cows.size()-1));
                }
            }
        }
        List<String> fullString = new ArrayList<>();
        int t=0;
        minLength=maxWidth;//记录当前行剩余长度
        for (int i=0;i<size.size();++i){
            StringBuffer stringBuffer = new StringBuffer(maxWidth);//用于记录每行的字符串
            //计算当前行空格数量
            int intervalnum = cows.get(i)-1;
            int interval=0;
            int remainder=0;
            if(intervalnum!=0){
                interval = size.get(i)/(cows.get(i)-1);
                remainder =size.get(i)%(cows.get(i)-1);
            }else {
                interval = size.get(i);
            }
            if(i==size.size()-1){
                interval = 1;
                remainder = 0;
            }
            while (minLength>0){
                stringBuffer.append(words[t]);//组合
                minLength = minLength-words[t].length();
                ++t;
                if(minLength<=0)
                    break;
                for (int j=0;j<interval;++j){
                    stringBuffer.append(" ");
                }
                minLength = minLength-interval;
                if(--remainder>=0){
                    stringBuffer.append(" ");
                    minLength--;
                }
                if(t==words.length){
                  while (minLength--!=0){
                      stringBuffer.append(" ");
                  }
                }
            }
            fullString.add(stringBuffer.toString());
            minLength = maxWidth;//重置前提条件
        }
        return fullString;
    }
}
