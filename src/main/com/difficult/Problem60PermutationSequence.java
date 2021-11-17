package com.difficult;

import java.util.LinkedList;

public class Problem60PermutationSequence {
    public String getPermutation(int n, int k) {
        int ns =1;
        StringBuilder builder = new StringBuilder();
        LinkedList<Integer> list = new LinkedList<>();
        for (int i = 1; i <n ; i++) {
            list.add(Integer.valueOf(i));
            ns=ns*i;
        }
        list.add(Integer.valueOf(n));
        for (int i = n-1; i >0 ; i--) {
            if(k==0){
                for(int j = list.size()-1;j>0;--j){
                    builder.append(list.get(j));
                    list.remove(j);
                }
                break;
            }
            int t = (k-1)/ns;
            builder.append(list.get(t));
            k=k%ns;
            list.remove(t);
            ns = ns/i;
        }
        builder.append(list.get(0));
        return builder.toString();
    }
}
