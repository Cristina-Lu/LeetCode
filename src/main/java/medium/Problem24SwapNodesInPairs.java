package main.java.medium;

import main.java.toolClasses.ListNode;

public class Problem24SwapNodesInPairs {
    /*
    * 0ms 100.0%
    * 37.5M 6.35%
    * */
    public ListNode swapPairs(ListNode head) {
        ListNode first,second;
        ListNode myNode=head;
        ListNode upNode=null;
        while (myNode!=null){
            first=myNode;
            if(myNode.next!=null){
                second=myNode.next;
            }else {
                break;
            }
            if(myNode==head){
                head=second;
                first.next=second.next;
                second.next=first;
            }else {
                upNode.next=second;
                first.next=second.next;
                second.next=first;
            }
            upNode=first;
            myNode=first.next;
        }
        return head;
    }
}
