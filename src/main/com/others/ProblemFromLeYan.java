package com.others;

import java.util.ArrayList;

public class ProblemFromLeYan {
    String value;

    public ProblemFromLeYan(String value) {
        this.value = value;
    }

    public void readFirst() throws InterruptedException {
        Thread thread = new Thread(){
            @Override
            public void run() {
                while ("A".equals(value)){
                    System.out.println(value);
                }
            }
        };
        value = "B";
        thread.run();
        thread.join();
    }


    public void add(ArrayList arrayList){
        arrayList.add("8");
        arrayList = new ArrayList();
    }


}
