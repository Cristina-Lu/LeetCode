package main.java.medium;

import java.util.ArrayList;
import java.util.List;

public class ProblemSixZigZagConversion {
    /*
    * 19ms 26.01%
    *
    * 40.3M 8.33%
    * */
    public String convert(String s, int numRows) {
        if(numRows ==1)return s;
        List<String> bigS = new ArrayList<>();
        int len = Math.min(numRows,s.length());
        for(int i=0;i<len;++i){
            bigS.add("");
        }
        int j=0;
        boolean way = false;
        char[] sMy = s.toCharArray();
        for(int i=0;i<s.length();++i){
            bigS.set(j,bigS.get(j).concat(String.valueOf(sMy[i])));
            if(way){
                --j;
            }else {
                ++j;
            }
            if(j==len-1 || j==0)
                way=!way;
        }
        String myS="";
        for(int i=0;i<bigS.size();++i){
            myS+=bigS.get(i);
        }
        return myS;
    }
}
