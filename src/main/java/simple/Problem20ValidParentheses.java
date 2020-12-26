package java.simple;

import java.util.*;

public class Problem20ValidParentheses {
    /*
    * java原生栈 底层是动态数组vector
    *
    * 1ms 98.88%
    * 37.6% 5.48%
    * */
    public boolean isValid(String s) {
        Stack<Character> myStack = new Stack<>();
        char[]ss=s.toCharArray();
        for(int i=0;i<ss.length;++i){
            if(ss[i]=='[' ||ss[i]=='{' ||ss[i]=='('){
                myStack.push(ss[i]);
            }else{
                if(myStack.empty()){
                    return false;
                }else {
                    if(ss[i]==')' &&myStack.peek()=='('){
                        myStack.pop();
                    }else if(ss[i]==']' && myStack.peek()=='['){
                        myStack.pop();
                    }else if(ss[i]=='}' && myStack.peek()=='{'){
                        myStack.pop();
                    }else {
                        return false;
                    }
                }
            }
        }
        if(myStack.empty()){
            return true;
        }else {
            return false;
        }
    }
    /*
    * 栈的思想
    *
    * List+位置指针实现栈
    *
    * 1ms 98.88%
    * 37.6% 5.48%
    * */
    public boolean isValid1(String s) {
        List<Integer> myStack = new ArrayList<>();
        int place=-1;
        char[] ss=s.toCharArray();
        for(int i=0;i<ss.length;++i){
            if(ss[i]=='['){
                ++place;
                myStack.add(place,1);
            }else if(ss[i]=='{'){
                ++place;
                myStack.add(place,2);
            }else if(ss[i]=='('){
                ++place;
                myStack.add(place,3);
            }else{
                if(place==-1)return false;
                switch (myStack.get(place)){
                    case 1:{
                        if(ss[i]==']'){
                            --place;
                        }else {
                            return false;
                        }
                        break;
                    }
                    case 2:{
                        if(ss[i]=='}'){
                            --place;
                        }else {
                            return false;
                        }
                        break;
                    }
                    case 3:{
                        if(ss[i]==')'){
                            --place;
                        }else {
                            return false;
                        }
                        break;
                    }
                }
            }
        }
        if(place==-1)return true;
        else return false;
    }
}
