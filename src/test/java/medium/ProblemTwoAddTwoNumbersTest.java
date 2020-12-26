package java.medium;

import org.junit.Test;

public class ProblemTwoAddTwoNumbersTest {
    @Test
    public void Tests(){
        ProblemTwoAddTwoNumbers thisAddTwoNumbers=new ProblemTwoAddTwoNumbers();
        ProblemTwoAddTwoNumbers.ListNode listNode11
                = new ProblemTwoAddTwoNumbers.ListNode(5);
        ProblemTwoAddTwoNumbers.ListNode listNode12
                = new ProblemTwoAddTwoNumbers.ListNode(6);
        ProblemTwoAddTwoNumbers.ListNode listNode13
                = new ProblemTwoAddTwoNumbers.ListNode(3);
        ProblemTwoAddTwoNumbers.ListNode listNode21
                = new ProblemTwoAddTwoNumbers.ListNode(2);
        ProblemTwoAddTwoNumbers.ListNode listNode22
                = new ProblemTwoAddTwoNumbers.ListNode(4);
        ProblemTwoAddTwoNumbers.ListNode listNode23
                = new ProblemTwoAddTwoNumbers.ListNode(4);

        listNode11.next=listNode12;
        listNode12.next=listNode13;

        listNode21.next=listNode22;
        listNode22.next=listNode23;

        thisAddTwoNumbers.addTwoNumbers(listNode11,listNode21);
    }
}
