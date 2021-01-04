package com.medium;

public class ProblemTwoAddTwoNumbers {

    /*
    *
    * 本质上不难，但需要充分了解题意
    * 本身手动计算加法就是从末位数开始算，所以把数据倒过来存储是没毛病的
    * 耗时和内存消耗都进入90%
    *
    */
    // Definition for singly-linked list.
      public static class ListNode {
          int val;
          public ListNode next;
          public ListNode(int x) { val = x; }
      }
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
          int resultVal = (l1.val+l2.val)%10;
          ListNode result = new ListNode(resultVal);
          ListNode nowListNode = result;
          Integer t=(l1.val+l2.val)/10;
          while (l1.next != null &&l2.next !=null){
              l1=l1.next;
              l2=l2.next;
              int newResultVal =(l1.val+l2.val+t)%10;
              t=(l1.val+l2.val+t)/10;
              ListNode nextListNode =new ListNode(newResultVal);
              nowListNode.next=nextListNode;
              nowListNode=nextListNode;
          }
          if(l1.next==null){
              while(l2.next!=null){
                  l2=l2.next;
                  int newResultVal = (l2.val+t)%10;
                  t=(l2.val+t)/10;
                  ListNode nextListNode =new ListNode(newResultVal);
                  nowListNode.next=nextListNode;
                  nowListNode=nextListNode;
              }
          }
          else{
              while(l1.next!=null){
                  l1=l1.next;
                  int newResultVal = (l1.val+t)%10;
                  t=(l1.val+t)/10;
                  ListNode nextListNode =new ListNode(newResultVal);
                  nowListNode.next=nextListNode;
                  nowListNode=nextListNode;
              }
          }

          if(t!=0){
              ListNode nextListNode =new ListNode(t);
              nowListNode.next=nextListNode;
          }
          return result;
    }
}
