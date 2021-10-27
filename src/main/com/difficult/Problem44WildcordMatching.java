package com.difficult;

public class Problem44WildcordMatching {
    //通配符匹配 字符串s与字符串p完全匹配时返回成功，通配符包括？与*，？匹配一个字符，*任意字符串

    public boolean isMatch(String s,String p){
        int st=0;//当前匹配的s字符串的位置
        int pt=0;//当前匹配的p字符串的位置
        int prWcmSt=-1;//遇到*通配符后S字符串再次匹配的位置
        int prWcmPt=-1;//遇到*通配符后P字符串再次匹配的位置
        boolean wcm=false;//是否遇到*通配符
        do{
            if(p.charAt(pt)=='*'){//如果遇到通配符 * ，记录遇到，进行下一步匹配，如果无法匹配就跳过
                wcm=true;
                pt++;
                //如果之前已有通配符，重置通配符再次匹配位置
                prWcmPt=-1;
                prWcmSt=-1;
                continue;
            }else if(p.charAt(pt)=='?'){
                //如果遇到通配符 ？，则跳过当前匹配的字符
                st++;
                pt++;
            }else {
                if(p.charAt(pt)==s.charAt(st)){
                    pt++;st++;
                    if(wcm){//如果之前遇到通配符 *，再次匹配上之后，停止通配符效应，并记录当前位置
                        wcm=false;
                        prWcmSt=st;
                        prWcmPt=pt;
                    }
                }else if(wcm){
                    //如果当前字段不匹配，且在通配符效应期，跳过该字段
                    st++;
                }else {
                    //如果当前字段不匹配，且不在通配符效应期内，回溯至上次匹配位置
                    st=prWcmSt+1;
                    pt=prWcmPt;
                }
            }
        }while (st!=s.length());
        if(pt==p.length()){
            return true;
        }
        return false;
    }
}
