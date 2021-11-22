package com.difficult;

import org.junit.Test;

public class Problem65ValidNumberTest {
    @Test
    public void test(){
        Problem65ValidNumber problem65ValidNumber
                = new Problem65ValidNumber();
        System.out.println("-2.5"+problem65ValidNumber.isNumber("-2.5"));
        System.out.println("-2.5e2"+problem65ValidNumber.isNumber("-2.5e2"));
        System.out.println("0098"+problem65ValidNumber.isNumber("0098"));
        System.out.println("-0.5"+problem65ValidNumber.isNumber("-0.5"));
        System.out.println("4."+problem65ValidNumber.isNumber("4."));
        System.out.println("-.5"+problem65ValidNumber.isNumber("-.5"));
        System.out.println("-2e10"+problem65ValidNumber.isNumber("-2e10"));
        System.out.println("-2.5E3"+problem65ValidNumber.isNumber("-2.5E3"));
        System.out.println("-3e+7"+problem65ValidNumber.isNumber("-3e+7"));
        System.out.println("3e-7"+problem65ValidNumber.isNumber("3e-7"));
        System.out.println("-334.4543e+752"+problem65ValidNumber.isNumber("-334.4543e+752"));
        System.out.println("--------------true and false--------------------");
        System.out.println("-2.5e2.5"+problem65ValidNumber.isNumber("-2.5e2.5"));
        System.out.println("abc"+problem65ValidNumber.isNumber("abc"));
        System.out.println("-2.5fdr"+problem65ValidNumber.isNumber("-2.5fdr"));
        System.out.println("1a"+problem65ValidNumber.isNumber("1a"));
        System.out.println("1e"+problem65ValidNumber.isNumber("1e"));
        System.out.println("e3"+problem65ValidNumber.isNumber("e3"));
        System.out.println("--6"+problem65ValidNumber.isNumber("--6"));
        System.out.println("-+3"+problem65ValidNumber.isNumber("-+3"));
        System.out.println("34a34e34"+problem65ValidNumber.isNumber("34a34e34"));
/*        System.out.println(problem65ValidNumber.isNumber("e3"));
        System.out.println(problem65ValidNumber.isNumber("e3"));
        System.out.println(problem65ValidNumber.isNumber("e3"));
        System.out.println(problem65ValidNumber.isNumber("e3"));*/
    }

    @Test
    public void testPatch(){
        Problem65ValidNumber problem65ValidNumber
                =new Problem65ValidNumber();
        System.out.println("-1"+problem65ValidNumber.isPatch("-1"));
        System.out.println("1"+problem65ValidNumber.isPatch("1"));
        System.out.println("1."+problem65ValidNumber.isPatch("1."));
        System.out.println("-1.1"+problem65ValidNumber.isPatch("-1.1"));
        System.out.println("-.1"+problem65ValidNumber.isPatch("-.1"));
        System.out.println("+1"+problem65ValidNumber.isPatch("+1"));
        System.out.println("--1"+problem65ValidNumber.isPatch("--1"));
        System.out.println("+-1"+problem65ValidNumber.isPatch("+-1"));
        System.out.println("."+problem65ValidNumber.isPatch("."));
    }

    @Test
    public void testee(){
        Problem65ValidNumber problem65ValidNumber
                =new Problem65ValidNumber();
        System.out.println("1e1 "+problem65ValidNumber.isE("1e1"));
        System.out.println("1e "+problem65ValidNumber.isE("1e"));
        System.out.println("e1 "+problem65ValidNumber.isE("e1"));
        System.out.println("1e1.2 "+problem65ValidNumber.isE("1e1.2"));
        System.out.println("+e "+problem65ValidNumber.isE("+e"));
        System.out.println("+3.e04116 "+problem65ValidNumber.isE("+3.e04116"));
    }
}
