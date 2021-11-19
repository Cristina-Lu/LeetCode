package com.medium;

import com.toolClasses.ListNode;
import com.toolClasses.ToString;
import org.junit.Test;

public class Problem61RotateListTest {
    @Test
    public void test(){
        Problem61RotateList problem61RotateList =
                new Problem61RotateList();
        ToString.listNode(
                problem61RotateList.rotateRight(makeNodes(new int[]{1,2,3,4,5}),2));
        ToString.listNode(
                problem61RotateList.rotateRight(makeNodes(new int[]{1,2,3,4,5}),1));

        ToString.listNode(
                problem61RotateList.rotateRight(makeNodes(new int[]{0,1,2,}),4));
        ToString.listNode(
                problem61RotateList.rotateRight(makeNodes(new int[]{0,1,2,}),6));

    }

    public ListNode makeNodes(int[] nums){
        ListNode head = new ListNode(nums[0]);
        ListNode now = head;
        for (int i =1;i<nums.length;++i) {
            ListNode next = new ListNode(nums[i]);
            now.next = next;
            now = next;
        }
        return head;
    }
}
