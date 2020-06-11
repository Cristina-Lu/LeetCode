package main.java.toolClasses;

public class ListNode {
    int val;
    public ListNode next;
    public ListNode(int x) {
        val = x;
    }


    public void setNext(ListNode next) {
        this.next = next;
    }

    @Override
    public String toString() {
        return "ListNode{" +
                "val=" + val +
                '}';
    }
}
