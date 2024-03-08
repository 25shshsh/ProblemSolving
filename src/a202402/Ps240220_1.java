package a202402;

public class Ps240220_1 {
    public static void main(String[] args) {

    }

    public class ListNode {
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

    /**
     * Definition for singly-linked list.
     * public class ListNode {
     *     int val;
     *     ListNode next;
     *     ListNode() {}
     *     ListNode(int val) { this.val = val; }
     *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
     * }
     */
    class Solution {
        public ListNode removeNthFromEnd(ListNode head, int n) {
            if(head.next == null) return null;

            ListNode dummyHead = new ListNode(0, head);
            ListNode prevNode = dummyHead;

            //int len = -n-1;
            int len = 0;

            while (prevNode.next != null) {
                len++;
                prevNode = prevNode.next;
            }

            if(len == n) return head.next;
            else len -= (n+1);

            prevNode = head;

            while (len > 0) {
                len--;
                prevNode = prevNode.next;
            }

            if(prevNode.next.next == null) prevNode.next = null;
            else prevNode.next = prevNode.next.next;

            return dummyHead.next;
        }
    }

}