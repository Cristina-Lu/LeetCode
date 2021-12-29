package com.others;

import org.junit.Test;

import java.util.ArrayList;

public class ProblemFromLeYanTest {
    @Test
    public void test() throws InterruptedException {
        ProblemFromLeYan problemFromLeYan = new ProblemFromLeYan("A");
        problemFromLeYan.readFirst();
    }

    @Test
    public void testAdd(){
        ProblemFromLeYan problemFromLeYan = new ProblemFromLeYan("A");
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("1");
        problemFromLeYan.add(arrayList);
        System.out.println(arrayList.toString());
    }
}
