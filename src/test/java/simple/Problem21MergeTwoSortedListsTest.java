package java.simple;

import org.junit.Test;

import java.toolClasses.ListNode;

public class Problem21MergeTwoSortedListsTest {
    @Test
    public void test(){
        Problem21MergeTwoSortedLists problem21MergeTwoSortedLists
                =new Problem21MergeTwoSortedLists();
        ListNode n1=new ListNode(0);
        ListNode head1=n1;
         for(int i=1;i<7;i+=2){
            n1.next=new ListNode(i);
            n1=n1.next;
        }
         ListNode n2=new ListNode(2);
         ListNode head2=n2;
         for (int i=4;i<18;i+=2){
             n2.next=new ListNode(i);
             n2=n2.next;
         }

        System.out.println(problem21MergeTwoSortedLists.mergeTwoLists(head1,head2));
    }
}
