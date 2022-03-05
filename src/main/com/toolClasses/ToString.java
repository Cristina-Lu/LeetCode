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

    static public void listNode(ListNode listNode){
        System.out.print("[");
        ListNode now = listNode;
        while (now!=null){
            System.out.print(now.val);
            if(now.next!=null){
                System.out.print(",");
            }
            now = now.next;
        }
        System.out.print("]");
        System.out.println();
    }

    static public void SingleInt(int[] digits){
        System.out.print("[");
        for (int t:digits) {
            System.out.print(t +",");
        }
        System.out.println("]");
    }

    static public void SingleDouble(double[] digits){
        System.out.print("[");
        for (double t:digits){
            System.out.print(t+",");
        }
        System.out.println("]");
    }
}
