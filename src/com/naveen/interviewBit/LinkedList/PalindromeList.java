package com.naveen.interviewBit.LinkedList;

public class PalindromeList {
    public boolean isPalindrome(ListNode a) {
        if (a== null) return true;
        ListNode middle = new ReverseList().reverseList(getMiddleNode(a));

        while (middle!=null) {
            if (a.value != middle.value) return false;
            a=a.next;
            middle = middle.next;
        }
        return true;

    }

    private ListNode getMiddleNode(ListNode a) {
        ListNode slow = a;
        ListNode fast = a;

        while (fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow.next;
    }
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
}
