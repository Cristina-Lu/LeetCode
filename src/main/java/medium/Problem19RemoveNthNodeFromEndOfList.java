package java.medium;

import java.toolClasses.ListNode;


public class Problem19RemoveNthNodeFromEndOfList {
    /*
    * 耗时最低解法
    * */
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode p,q,pre;
        p=head;
        q=head;
        pre=head;
        while (n>0){
            p=p.next;
            --n;
        }
        if(p==null){
            return head.next;
        }
        while (p!=null){
            p=p.next;
            pre=q;
            q=q.next;
        }
        pre.next=q.next;
        return head;
    }
        /*
    * 1ms 30.27%
    *
    * 37.8ms 5.43%
    * */
    public ListNode removeNthFromEnd1(ListNode head, int n) {
        if(head.next==null)return null;
        if(head.next.next==null){
            if(n==2) return head.next;
            else {
                head.next=null;
                return head;
            }
        }
        ListNode myHead=new ListNode(0);
        myHead.next=head;
        ListNode firstNode=head;
        ListNode nextNode=myHead;
        Integer nodeNumber=0;
        while (firstNode!=null){
            ++nodeNumber;
            if(nodeNumber>n){
                nextNode=nextNode.next;
            }
            firstNode=firstNode.next;
        }
        nextNode.next=nextNode.next.next;
        return myHead.next;
    }
}
