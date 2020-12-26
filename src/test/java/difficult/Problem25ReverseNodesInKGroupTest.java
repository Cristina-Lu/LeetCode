package java.difficult;


import java.toolClasses.ListNode;
import org.junit.Test;

public class Problem25ReverseNodesInKGroupTest {
    @Test
    public void test(){
        Problem25ReverseNodesInKGroup problem25ReverseNodesInKGroup
                =new Problem25ReverseNodesInKGroup();
        ListNode n2=new ListNode(2);
        ListNode head2=n2;
        for (int i=4;i<18;i+=2){
            n2.next=new ListNode(i);
            n2=n2.next;
        }
        System.out.println(problem25ReverseNodesInKGroup.reverseKGroup(head2,9));
    }
}
