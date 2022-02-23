package com.others;

import com.toolClasses.ListNode;


public class MSProblem1 {
    /*
    * 部分反转链表
    * 输入：1->2->3->4->5->6,k=4
    * 输出：4->3->2->1->5->6
    * */
    public ListNode invert(ListNode node, int k) {
        //反转后的链表头
        ListNode head = node;
        //当前反转段后的第一个节点
        ListNode nextHead = node;
        //当前反转段的头节点
        ListNode nowHead = node;
        //上一反转段的尾节点
        ListNode lastTail = node;

        while (nextHead != null) {
            //设置反转的起点
            nowHead = nextHead;
            //标记当前反转段是否足够K个节点，若不足k个节点，flag为true
            boolean flag = false;
            //确定当前反转段，找到反转的终点
            for (int i = 0; i < k; ++i) {
                if (nextHead != null) {//nextHead为null时，已经到达链表尾
                    nextHead = nextHead.next;
                } else {
                    flag = true;//如果到达链表尾但不到k，不对该段进行处理
                    break;
                }
            }
            if (flag) {
                break;
            }
            //开始反转
            //设置反转完成时的链表尾
            ListNode nowTail = nowHead;
            //反转
            while (nowTail.next != nextHead) {
                ListNode next = nowTail.next;
                nowTail.next = next.next;
                next.next = nowHead;
                nowHead = next;
            }
            //与已反转部分及未反转部分串联
            if (lastTail != head) {
                lastTail.next = nowHead;
            } else {//处理整个链表的头节点特殊情况
                head = nowHead;
            }
            //重置上一反转段的尾节点
            lastTail = nowTail;
        }
        return head;
    }
}
