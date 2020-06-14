package main.java.simple;

import main.java.toolClasses.ListNode;

public class Problem21MergeTwoSortedLists {
    /*
    * 递归解法
    * */
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if(l1==null)return l2;
        else if(l2==null)return l1;
        if(l1.val>l2.val){
            l2.next=mergeTwoLists(l1,l2.next);
            return l2;
        }else {
            l1.next=mergeTwoLists(l1.next,l2);
            return l1;
        }
    }
        /*
    * 1ms 62.79%
    * 39.3% 59.81%
    *
    * */
    public ListNode mergeTwoLists1(ListNode l1, ListNode l2) {
        if(l1==null)return l2;
        else if(l2==null)return l1;
          ListNode next=null;
        if(l1.val>l2.val){
            next=l2;
            l2=l2.next;
        }else {
            next=l1;
            l1=l1.next;
        }
          ListNode head=next;
          ListNode n1=l1;
          ListNode n2=l2;
          while (n1!=null &&n2!=null){
              if(n1.val>n2.val){
                  next.next=n2;
                  n2=n2.next;
              }else {
                  next.next=n1;
                  n1=n1.next;
              }
              next=next.next;
          }
          if(n1==null){
              next.next=n2;
          }else {
              next.next=n1;
          }
          return head;
    }
}
