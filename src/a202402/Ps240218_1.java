package a202402;

import java.util.PriorityQueue;
import java.util.Queue;

public class Ps240218_1 {
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
        public ListNode insertionSortList(ListNode head) {
            Queue<Integer> queue = new PriorityQueue<>(); // 1
            ListNode tempHead = head;

            while(tempHead != null) { // 2
                queue.add(tempHead.val);
                tempHead = tempHead.next;
            }

            tempHead = head;

            while(tempHead != null) { // 3
                tempHead.val = queue.poll();
                tempHead = tempHead.next;
            }

            return head;
        }
    }

}
