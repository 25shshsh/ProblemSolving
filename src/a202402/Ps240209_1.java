package a202402;

public class Ps240209_1 {
    public static void main(String[] args) {
        
    }

    class Solution {
        public ListNode deleteMiddle(ListNode head) {
            ListNode mid = head;
            ListNode end = mid;

            if(head.next == null) return null; // 0
            else if(head.next.next == null) {
                head.next = null;
                return head;
            }

            while(true) { //1, 2
                if(end.next == null) {
                    mid.val = mid.next.val;
                    mid.next = mid.next.next;
                    return head;
                } else if(end.next.next == null) {
                    mid.next = mid.next.next;
                    return head;
                }
                mid = mid.next;
                end = end.next.next;
            }

        }
    }

    public class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }
}
