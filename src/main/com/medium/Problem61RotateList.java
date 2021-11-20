package com.medium;

import com.toolClasses.ListNode;

public class Problem61RotateList {
    public ListNode rotateRight(ListNode head, int k) {
        ListNode pro = head;
        ListNode node = head;
        ListNode tail = null;
        if(node==null)
            return head;
        int sum = 0;
        while(node!=null){
            sum++;
            if(node.next==null)
                tail = node;
            node=node.next;
        }
        k=sum-k%sum;
        for (int i=0;i<k-1;++i){
            pro = pro.next;
        }
        node = pro.next;
        if(node == null)
            return head;
        pro.next = null;
        tail.next = head;
        return node;
    }


}
