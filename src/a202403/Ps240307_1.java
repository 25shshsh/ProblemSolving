package a202403;

public class Ps240307_1 {

    public static void main(String[] args) {
        // end.next == null return middle;
        // else if end.next.next == null return middle.next;
    }

    class Solution {
        public ListNode middleNode(ListNode head) {
            ListNode middle = head; // 1
            ListNode end = head;

            while(true) {
                if(end.next == null) return middle;
                else if (end.next.next == null) return middle.next;

                middle = middle.next;
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
