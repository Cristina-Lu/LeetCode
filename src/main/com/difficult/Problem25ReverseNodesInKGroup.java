package com.difficult;

import com.toolClasses.ListNode;

public class Problem25ReverseNodesInKGroup {
    /*
    * 1ms 49.15%
    *
    * 39.9M 7.32%
    * */
    public ListNode reverseKGroup(ListNode head, int k) {
        ListNode start=head;
        if(head==null || head.next==null ||k==1)return head;
        ListNode now=head,inUpNode=new ListNode(0);
        inUpNode.next=head;
        int i=0;
        while (now!=null){
            ++i;
            now=now.next;
            if(i%k==0){
                ListNode end=start;
                    int j=0;
                    while (j!=k-1){
                        ListNode move=end.next;
                        end.next=move.next;
                        move.next=start;
                        start=move;
                        ++j;
                    }
                    inUpNode.next=start;
                if(i==k)head=start;
                start=now;
                inUpNode=end;
            }
        }
        return head;
    }
}
