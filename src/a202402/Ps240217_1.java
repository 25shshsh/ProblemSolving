package a202402;

import java.util.LinkedList;
import java.util.Queue;

public class Ps240217_1 {
    public static void main(String[] args) {
        
    }

    public class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }


    class Solution {
        public ListNode partition(ListNode head, int x) {
            if(head == null || head.next == null) return head;

            ListNode tempNode1 = new ListNode(0); // 1
            ListNode tempNode2 = new ListNode(0);
            ListNode tempHead1 = tempNode1;
            ListNode tempHead2 = tempNode2;

            while(head != null) { // 2
                ListNode temp = new ListNode(head.val);

                if(head.val < x) {
                    tempNode1.next = temp;
                    tempNode1 = tempNode1.next;
                } else {
                    tempNode2.next = temp;
                    tempNode2 = tempNode2.next;
                }

                head = head.next;
            }
            tempNode1.next = tempHead2.next; // 3

            return tempHead1.next;
        }
    }
}
