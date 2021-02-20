package com.simple;

import org.junit.Test;

public class Problem38CountAndSayTest {
    @Test
    public void test(){
        Problem38CountAndSay problem38CountAndSay
                =new Problem38CountAndSay();

        problem38CountAndSay.countAndSay(70);
        problem38CountAndSay.countAndSay1(70);
    }
}
