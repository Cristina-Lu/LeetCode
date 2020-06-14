package test.java.difficult;

import main.java.difficult.Problem23MergeKSortedLists;
import main.java.toolClasses.ListNode;
import org.junit.Test;

public class Problem23MergeKSortedListsTest {
    @Test
    public void test(){
        Problem23MergeKSortedLists problem23MergeKSortedLists
                =new Problem23MergeKSortedLists();

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
        ListNode[] n=new ListNode[5];
        n[0]=head1;
        n[1]=head2;
        n[2]=new ListNode(19);
        n[3]=new ListNode(15);
        n[4]=new ListNode(8);
        System.out.println(
                problem23MergeKSortedLists.mergeKLists(n));
    }
}
