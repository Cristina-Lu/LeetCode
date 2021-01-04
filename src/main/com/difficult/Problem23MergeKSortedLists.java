package com.difficult;


import com.toolClasses.ListNode;

public class Problem23MergeKSortedLists {
    /*
    * 3ms 83.29%
    * 42.2MB 42.65%
    * 分治法
    * */
    public ListNode mergeKLists(ListNode[] lists) {
        int myLength=lists.length;
        if(myLength==0)return null;
        while (myLength!=1){
            for(int i=0;i<myLength-1;i+=2){
                lists[i/2]=mergeTwoLists(lists[i],lists[i+1]);
            }
            if(myLength%2==1){
                lists[myLength/2]=lists[myLength-1];
            }
            myLength=(myLength+1)/2;
        }
        return lists[0];
    }
    public ListNode mergeTwoLists(ListNode l1,ListNode l2){
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
}
