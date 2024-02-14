package a202402;

public class Ps240213_1 {
    public static void main(String[] args) {
        
    }
    //https://fierycoding.tistory.com/45
    // https://leetcode.com/problems/linked-list-cycle-ii/
    public class Solution {
        public ListNode detectCycle(ListNode head) {
            ListNode slow = head; // 1
            ListNode fast = head;

            if(head == null || head.next == null) return null; // 2

            while(true) {
                if (fast.next == null || fast.next.next == null) return null; // 3

                slow = slow.next; // 4
                fast = fast.next.next;

                if(slow == fast) { // 4
                    slow = head;

                    while(true) { // 5
                        if(slow == fast) return slow;
                        slow = slow.next;
                        fast = fast.next;
                    }
                }
            }

        }
    }

    class ListNode {
        int val;
        ListNode next;
        ListNode(int x) {
            val = x;
            next = null;
        }
    }
}
