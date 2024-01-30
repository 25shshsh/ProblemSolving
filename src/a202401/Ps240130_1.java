package a202401;


import java.util.List;

public class Ps240130_1 {
    public static void main(String[] args) {

    }

    class Solution {
        public ListNode oddEvenList(ListNode head) {
            if (head == null || head.next == null) return head; // 1

            ListNode odd = head; // 2
            ListNode evenHead = head.next;
            ListNode even = evenHead;

            while(even != null && even.next != null) { // 3
                odd.next = even.next;
                even.next = odd.next.next ;

                odd = odd.next;
                even = even.next;
            }

            odd.next = evenHead; // 4

            return head;
        }
    }

    public class ListNode { int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }

}
