package com.toolClasses;


public class ListNode {
    public int val;
    public ListNode next;
    public int local;
    public ListNode() {}
    public ListNode(int val) {
        this.val = val;
    }
    public ListNode(int val, ListNode next) {
        this.val = val;
        this.next=next;
    }

    @Override
    public String toString() {
        String s = String.valueOf(this.val)+"->";
        ListNode n=this;
        while (n.next!=null){
            n=n.next;
            s=s+String.valueOf(n.val)+"->";
        }
        return s;
    }
}
