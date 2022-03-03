package com.others;

import com.toolClasses.ListNode;

import java.awt.font.NumericShaper;

public class Problemximalaya {
    public ListNode allNode(ListNode n1,ListNode n2){
        ListNode head = null;
        ListNode now = null;
        ListNode next =null;
        while (n1!=null && n2!=null){
            if(n1.val<n2.val){
                next = n1;
                n1 = n1.next;
            }else {
                next = n2;
                n2 = n2.next;
            }
            if(head == null){
                head = next;
                now = next;
            }else {
                now.next=next;
                now = next;
            }
        }
        if (head != null) {
            if (n1 == null) {
                now.next=n2;
            }else {
                now.next = n1;
            }
        }else {
            if(n1 ==null){
                return n2;
            }else {
                return n1;
            }
        }
        return head;
    }
}
