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
        List<Integer> size = new ArrayList<>();//记录每行的单词数
        for (int i=0;i<words.length;++i){
            if(minLength<words[i].length()){//如果单行数量已经超过
                i--;
                size.add(new Integer(i));
                minLength =maxWidth;
            }
        }

        return null;
    }
}
