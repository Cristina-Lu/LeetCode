package com.medium;

import com.toolClasses.ListNode;

public class Problem61RotateList {
    public ListNode rotateRight(ListNode head, int k) {
        ListNode pro = null;
        ListNode node = head.next;
        ListNode tail = null;
        if(node==null)
            return head;
        int sum = 0;
        for (int i = 1;node!=null;++i){

        }
        node = pro.next;
        pro.next = null;
        tail.next = head;
        return node;
    }


}
