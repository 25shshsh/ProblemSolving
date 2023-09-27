package a202309;

import java.util.*;

public class Ps230926_1 {

    // https://leetcode.com/problems/merge-two-sorted-lists/

    /**
     * Definition for singly-linked list.
     * public class ListNode {
     * int val;
     * ListNode next;
     * ListNode() {}
     * ListNode(int val) { this.val = val; }
     * ListNode(int val, ListNode next) { this.val = val; this.next = next; }
     * }
     */
    public static void main(String[] args) {



        ListNode l1 = new ListNode(1);
        ListNode list2 = new ListNode(2);

        ListNode l2 = new ListNode(3);
        ListNode list4 = new ListNode(4);
        l1.next = list2;
        l2.next = list4;


        ListNode prehead = new ListNode(-1);
        ListNode cur = prehead;

        while (l1 != null && l2 != null) {
            if (l1.val <= l2.val) {
                cur.next = l1;
                l1 = l1.next;
            } else {
                cur.next = l2;
                l2 = l2.next;
            }
            cur = cur.next;
        }
        cur.next = l1 == null ? l2 : l1;
        System.out.println(prehead.next.val);
        System.out.println(prehead.next.next.val);
        System.out.println(prehead.next.next.next.val);
        System.out.println(prehead.next.next.next.next.val);
    }


    static class Solution {
        public ListNode mergeTwoLists(ListNode l1, ListNode l2) {

            ListNode prehead = new ListNode(-1);
            ListNode cur = prehead;

            while (l1 != null && l2 != null) {
                if (l1.val <= l2.val) {
                    cur.next = l1;
                    l1 = l1.next;
                } else {
                    cur.next = l2;
                    l2 = l2.next;
                }
                cur = cur.next;
            }

            cur.next = l1 == null ? l2 : l1;
            return prehead.next;
        }


    }

    public static class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

}




