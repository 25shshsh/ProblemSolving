package a202403;

import java.util.*;

public class Ps240312_1 {
    public static void main(String[] args) {
        Map<Integer, ListNode> sumToNode = new HashMap<>();
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(-3);
        head.next.next.next.next = new ListNode(1);

        ListNode dummy = new ListNode(0);
        dummy.next = head;
        int sum = 0;

        for (ListNode curr = dummy; curr != null; curr = curr.next) {
            sum += curr.val;
            sumToNode.put(sum, curr);
        }

        System.out.println(sumToNode.get(3).val);

    }


    class Solution {
        public ListNode removeZeroSumSublists(ListNode head) {
            ListNode dummy = new ListNode(0);
            dummy.next = head;
            Map<Integer, ListNode> sumToNode = new HashMap<>();
            int sum = 0;

            for (ListNode curr = dummy; curr != null; curr = curr.next) {
                sum += curr.val;
                sumToNode.put(sum, curr);
            }

            sum = 0;

            for (ListNode curr = dummy; curr != null; curr = curr.next) {
                sum += curr.val;
                curr.next = sumToNode.get(sum).next;
            }

            return dummy.next;
        }
    }


    public static class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }

}
