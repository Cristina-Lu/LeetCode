package com.others;

import com.toolClasses.ListNode;
import org.junit.Test;

public class ProblemximalayaTest {
    @Test
    public void test(){
        Problemximalaya problemximalaya = new Problemximalaya();

        ListNode head = new ListNode(2);
        ListNode tail=head;
        tail.next =new ListNode(4);
        tail=tail.next;
        tail.next =new ListNode(6);
        tail=tail.next;
        tail.next =new ListNode(8);
        tail=tail.next;
        tail.next =new ListNode(10);
        ListNode head1 = new ListNode(1);
        tail =head1;
        tail.next =new ListNode(3);
        tail=tail.next;
        tail.next =new ListNode(5);
        tail=tail.next;
        tail.next =new ListNode(7);
        tail=tail.next;
        tail.next =new ListNode(9);
        tail=tail.next;
        tail.next =new ListNode(11);
        System.out.println("n1 is "+head.toString());

        System.out.println("n2 is "+head1.toString());

        System.out.println("new ListNode is "+problemximalaya.allNode(head,head1));
    }
}
