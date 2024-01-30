package a202401;


public class Ps240131_1 {
    public static void main(String[] args) {

    }

    class Solution {
        public ListNode swapPairs(ListNode head) {
            if(head == null) return null; // 1
            if(head.next == null) return head;

            ListNode oddNode = head; // 2
            ListNode evenNode = head.next;

            while(true) {
                int temp = oddNode.val; // 3
                oddNode.val = evenNode.val;
                evenNode.val = temp;

                if(oddNode.next.next == null || evenNode.next.next == null) break; // 4

                oddNode = oddNode.next.next; // 5
                evenNode = evenNode.next.next;
            }

            return head;
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
