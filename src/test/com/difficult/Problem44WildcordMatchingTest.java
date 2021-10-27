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
        System.out.println("8 s 空 & p abcd return "+problem44WildcordMatching.isMatch("","abcd"));
        System.out.println("9 s abcd & p 空 return "+problem44WildcordMatching.isMatch("abcd",""));
        System.out.println("10 s 空 & p * return "+problem44WildcordMatching.isMatch("","*"));
    }
}
