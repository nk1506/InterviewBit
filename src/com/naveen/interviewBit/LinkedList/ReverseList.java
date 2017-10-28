package com.naveen.interviewBit.LinkedList;

public class ReverseList {
    public ListNode reverseList(ListNode a) {
        ListNode temp = a;
        ListNode res = null;
        while (temp != null) {
            ListNode t = temp.next;
            temp.next = res;
            res = temp;
            temp = t;

        }
        return res;
    }
}
