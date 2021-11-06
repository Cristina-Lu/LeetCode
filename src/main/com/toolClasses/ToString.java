package com.toolClasses;

public  class ToString {
    static public  void TwoFloorInt(int[][] interval){
        System.out.print("{");
        for (int[] inters:interval) {
            System.out.print("[");
            for (int i=0;i<inters.length;++i){
                System.out.print(inters[i]);
                if(i!=inters.length-1)
                System.out.print(",");
            }
            System.out.print("]");
        }
        System.out.print("}");
        System.out.println();
    }
}
