package test.java.medium;

import main.java.medium.Problem24SwapNodesInPairs;
import main.java.toolClasses.ListNode;
import org.junit.Test;

public class Problem24SwapNodesInPairsTest {
    @Test
    public void test(){
        Problem24SwapNodesInPairs problem24SwapNodesInPairs
                =new Problem24SwapNodesInPairs();
        ListNode n2=new ListNode(2);
        ListNode head2=n2;
        for (int i=4;i<18;i+=2){
            n2.next=new ListNode(i);
            n2=n2.next;
        }
        System.out.println( problem24SwapNodesInPairs.swapPairs(n2));
    }
}
