package com.others;

import com.toolClasses.ListNode;
import org.junit.Test;

public class MSProblem1Test {
    @Test
    public void test(){
        MSProblem1 msProblem1 = new MSProblem1();
        ListNode head = new ListNode(1);
        ListNode tail=head;
        tail.next =new ListNode(2);
        tail=tail.next;
        tail.next =new ListNode(3);
        tail=tail.next;
        tail.next =new ListNode(4);
        tail=tail.next;
        tail.next =new ListNode(5);
        tail=tail.next;
        tail.next =new ListNode(6);
        System.out.println(head.toString());
        System.out.println(msProblem1.invert(head,4));
    }
}
