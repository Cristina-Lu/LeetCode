package main.java.simple;

public class Problem28ImplementStrStr {
    /*
    * KMP算法
    *
    * 5ms 20.99%
    * */
    public int strStr(String haystack, String needle){
        if(needle.length()==0)return 0;
        else if(haystack.length()<needle.length())return -1;
        char[] haystacks=haystack.toCharArray();
        char[] needles=needle.toCharArray();
        if(needle.length()==1){
            int i=0;
            for(;i<haystack.length();++i){
                if(haystacks[i]==needles[0])return i;
            }
            if(i==haystack.length())return -1;
        }
        int[] next=new int[needle.length()];
        next[0]=0;next[1]=0;
         for (int i = 2,j=0; i <needle.length() ; i++) {
             while (j>0&&needles[i-1]!=needles[j]){
                 j=next[j];
             }
             if(needles[i-1]==needles[j]){
                 j++;
             }
             next[i]=j;
        }
        for (int i =0,j=0; i < haystack.length(); i++) {
            if(haystacks[i]==needles[j]){
                ++j;
                if(j==needle.length()){
                    return i+1-j;
                }
            }else{
                i=i-j;
                j=next[j];
                i=i+j;
            }
        }
        return -1;
    }
    /*
    * 1477ms 5%
    *
    * 38.3M 5.43%
    * */
    public int strStr1(String haystack, String needle) {
        if(needle.length()==0)return 0;
        else if(haystack.length()<needle.length())return -1;
        char[] haystacks=haystack.toCharArray();
        char[] needles=needle.toCharArray();
        for (int i = 0; i <haystack.length() ; i++) {
            if(haystacks[i]==needles[0]){
                int j = 1;
                for (;i+j<haystack.length()&& j <needle.length() ; j++) {
                    if(haystacks[i+j]!=needles[j]){
                        break;
                    }
                }
                if(j==needle.length())return i;
            }
        }
        return -1;
    }
}
