package com.difficult;

public class Problem65ValidNumber {
    //正则表达式尝试,有漏洞，很大
    public boolean isNumber(String s) {
        String patch  = "((\\+|\\-)?[0-9]*)+\\.?[0-9]*";//小数
        String integer = "(\\+|\\-)?[0-9]+";//整数
        String withE = "("+patch+"){1}(e|E)("+integer+")";//带e的数
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(patch).append("|").append(integer).append("|").append(withE);
        return s.matches(stringBuilder.toString());
    }

    //无法避免只有.出现的情况，所以需要分开来写
    public boolean isPatchError(String s){
        String patch  = "(^[+-]?[0-9]*)+\\.?[0-9]*";//小数或整数
        return s.matches(patch);
    }

    public boolean isPatch(String s){
        String patch = "^[+-]?\\.\\d+|^[+-]?\\d+\\.?|^[+-]?\\d+\\.\\d+";//匹配小数或整数
        return s.matches(patch);
    }

    public boolean isE(String s){
        String ee = "(^[+-]?\\.\\d+|^[+-]?\\d+\\.?|^[+-]?\\d+\\.\\d+)([eE][+-]?\\d+)?$";
        return s.matches(ee);
    }
}
