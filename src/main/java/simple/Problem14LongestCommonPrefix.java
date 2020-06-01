package main.java.simple;

public class Problem14LongestCommonPrefix {

    /*
    * 官方最简写法，前两个字符串先找出公共前缀
    * 然后用公共前缀匹配下一个，直到最后一个或公共前缀为空时输出即可
    * 与我的思路最大的区别是我遍历了整个字符串数组多次，但每次只访问一个字符
    * 他遍历了整个字符串数组一次，对每一个元素操作多次
    *
    * */
    public String longestCommonPrefix(String[] strs) {
        if (strs.length == 0) return "";
        String prefix = strs[0];
        for (int i = 1; i < strs.length; i++)
            while (strs[i].indexOf(prefix) != 0) {
                prefix = prefix.substring(0, prefix.length() - 1);
                if (prefix.isEmpty()) return "";
            }
        return prefix;
    }

    /*
    * 1ms 78.64%
    * 38MB 7.5%
    *
    * */
    public String longestCommonPrefix1(String[] strs) {
        if(strs.length==0)return "";
        StringBuffer stringBuffer = new StringBuffer();
        boolean flag=false;
         for(int i=0;i<strs[0].length();++i){
             char m=strs[0].charAt(i);
             for (String s:strs) {
                 if(s.length()<=i){
                     flag=true;
                     break;
                 }else {
                     if(s.charAt(i)!=m){
                         flag=true;
                         break;
                     }
                 }
             }
             if(flag){
                 break;
             }else {
                 stringBuffer.append(m);
             }
        }
        return stringBuffer.toString();
    }
}
