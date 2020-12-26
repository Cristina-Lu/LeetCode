package java.medium;

import org.junit.Test;

import java.toolClasses.ListNode;

public class Problem19RemoveNthNodeFromEndOfListTest {
    @Test
    public void test(){
        Problem19RemoveNthNodeFromEndOfList problem19RemoveNthNodeFromEndOfList
                =new Problem19RemoveNthNodeFromEndOfList();
        ListNode head=new ListNode(1);
        ListNode next=head;
        ListNode newNode;
        for(int i=2;i<4;++i){
            newNode=new ListNode(i);
            next.next=newNode;
            next=next.next;
        }
        System.out.println(
                problem19RemoveNthNodeFromEndOfList.removeNthFromEnd(head,3));
    }
}
