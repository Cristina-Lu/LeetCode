package com.medium;

import org.junit.Test;

import com.toolClasses.ListNode;

public class Problem24SwapNodesInPairsTest {
    @Test
    public void test(){
        Problem24SwapNodesInPairs problem24SwapNodesInPairs
                =new Problem24SwapNodesInPairs();
        ListNode n2=new ListNode(2);
        ListNode head2=n2;
        for (int i=4;i<18;i+=2){
            n2.next=new ListNode(i);
            n2=n2.next;
        }
        System.out.println( problem24SwapNodesInPairs.swapPairs(n2));
    }
}
