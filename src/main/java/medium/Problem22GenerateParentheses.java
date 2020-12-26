package java.medium;

import java.util.ArrayList;
import java.util.List;

public class Problem22GenerateParentheses {
    /*
    * 官方解法
    * 通过追踪当前字符串的左括号与右括号的数量来控制整个字符串
    * 使得产生的字符串没有重复值
    * */
    public List<String> generateParenthesis(int n) {
        List<String>myList=new ArrayList<>();
        backtrack(myList,new StringBuilder(),0,0,n);
        return myList;
    }

    public void backtrack(List<String> ans, StringBuilder cur, int open, int close, int max) {
        if(cur.length()==max*2){
            ans.add(cur.toString());
            return;
        }
        if(open<max){
            cur.append('(');
            backtrack(ans,cur,open+1,close,max);
            cur.deleteCharAt(cur.length()-1);
        }
        if(close<open){
            cur.append(')');
            backtrack(ans,cur,open,close+1,max);
            cur.deleteCharAt(cur.length()-1);
        }
    }
    /*
    * 40ms 5.15%
    * 39.6MB 5.26%
    *
    * 用contains方法进行查重限定，效率极慢
    *
    * */
    public List<String> generateParenthesis1(int n) {
        List<String>myList=new ArrayList<>();
        if(n==0){}
        else if(n==1){
            myList.add("()");
        }else{
            List<String> upList=generateParenthesis1(n-1);
            for(int i=0;i<upList.size();++i){
                myList.add("("+upList.get(i)+")");
            }
            for(int m=1;m<n;++m){
                List<String> myFirstList=generateParenthesis1(m);
                List<String>mySecondList=generateParenthesis1(n-m);
                for(int i=0;i<myFirstList.size();++i){
                    for(int j=0;j<mySecondList.size();++j){
                        String s1=myFirstList.get(i)+mySecondList.get(j);
                        if(!myList.contains(s1)){
                            myList.add(s1);
                        }
                    }
                }
            }
        }
        return myList;
    }
}
