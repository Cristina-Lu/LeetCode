package com.difficult;

import org.junit.Test;

public class Problem44WildcordMatchingTest {
    @Test
    public void test(){
        Problem44WildcordMatching problem44WildcordMatching
                =new Problem44WildcordMatching();
        System.out.println("1 s abcd & p abcd return "+problem44WildcordMatching.isMatch("abcd","abcd"));
        System.out.println("2 s abcd & p *abcd return "+problem44WildcordMatching.isMatch("abcd","*abcd"));
        System.out.println("3 s abcd & p ab？d return "+problem44WildcordMatching.isMatch("abcd","ab?d"));
        System.out.println("4 s abcd & p a*d return "+problem44WildcordMatching.isMatch("abcd","a*d"));
        System.out.println("5 s abcd & p *b？d return "+problem44WildcordMatching.isMatch("abcd","*b?d"));
        System.out.println("6 s abcd & p *ab？d return "+problem44WildcordMatching.isMatch("abcd","*ab?d"));
        System.out.println("7 s abcd & p * return "+problem44WildcordMatching.isMatch("abcd","*"));
        System.out.println("10 s 空 & p * return "+problem44WildcordMatching.isMatch("","*"));
        System.out.println("13 s abcd & p abcd* return "+problem44WildcordMatching.isMatch("abcd","abcd*"));
        System.out.println("17 s 空 & p *** return "+problem44WildcordMatching.isMatch("","***"));
        System.out.println("19 s abcdcdecdef & p ab*cdef return "+problem44WildcordMatching.isMatch("abcdcdecdef","ab*cdef"));
        System.out.println("20 s aaaa & p ***a return "+problem44WildcordMatching.isMatch("aaaa","***a"));
        System.out.println("---------true and false line -------------------");
        System.out.println("8 s 空 & p abcd return "+problem44WildcordMatching.isMatch("","abcd"));
        System.out.println("9 s abcd & p 空 return "+problem44WildcordMatching.isMatch("abcd",""));
        System.out.println("11 s 空 & p *a return "+problem44WildcordMatching.isMatch("","*a"));
        System.out.println("12 s abcd & p abcde return "+problem44WildcordMatching.isMatch("abcd","abcde"));
        System.out.println("14 s ab & p ?d return "+problem44WildcordMatching.isMatch("ab","?d"));
        System.out.println("15 s ab & p a return "+problem44WildcordMatching.isMatch("ab","a"));
        System.out.println("16 s acdcb & p a*c?b return "+problem44WildcordMatching.isMatch("acdcb","a*c?b"));
        System.out.println("18 s mississippi & p m??*ss*?i*pi return "+problem44WildcordMatching.isMatch("mississippi","m??*ss*?i*pi"));
    }
}
