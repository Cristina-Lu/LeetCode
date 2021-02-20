package com.simple;

public class Problem38CountAndSay {
    private String getNext(String s){
        StringBuilder s1=new StringBuilder();
        char lastChar = '.';
        int num = 1;
        for (int j = 0;j <= s.length();++j){
            if(j == s.length()){
                s1.append(num).append(lastChar);
                break;
            }else if(s.charAt(j) == lastChar){
                num++;
            }else {
                if(lastChar != '.'){
                    s1.append(num).append(lastChar);
                    lastChar = s.charAt(j);
                    num=1;
                }else {
                    lastChar = s.charAt(j);
                }
            }
        }
        return s1.toString();
    }
    public String countAndSay(int n) {
        long start = System.currentTimeMillis();
        String s ="1";
        for (int i = 1; i <n ; i++) {
            s = getNext(s);
        }
        long cha = System.currentTimeMillis()-start;
        System.out.println("抽成函数用时："+cha);
        return s;
    }

    public String countAndSay1(int n) {
        long start = System.currentTimeMillis();
        String s ="1";
        for (int i = 1; i <n ; i++) {
            StringBuilder s1=new StringBuilder();
            char lastChar = '.';
            int num = 1;
            for (int j = 0;j <= s.length();++j){
                if(j == s.length()){
                    s1.append(num).append(lastChar);
                    break;
                }else if(s.charAt(j) == lastChar){
                    num++;
                }else {
                    if(lastChar != '.'){
                        s1.append(num).append(lastChar);
                        lastChar = s.charAt(j);
                        num=1;
                    }else {
                        lastChar = s.charAt(j);
                    }
                }
            }
            s=s1.toString();
        }
        long cha = System.currentTimeMillis()-start;
        System.out.println("不抽出函数用时："+cha);
        return s;
    }
}
