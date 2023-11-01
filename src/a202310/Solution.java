package a202310;

public class Solution {
    public static void main(String[] args) {
        ListNode head4 = new ListNode(3);
        ListNode head3 = new ListNode(10,head4);
        ListNode head2 = new ListNode(6,head3);
        ListNode head1 = new ListNode(18, head2);
        ListNode head = insertGreatestCommonDivisors(head1);

        while(head.next != null) {
            System.out.println(head.val);
            head.next = head;
        }

    }

    public static ListNode insertGreatestCommonDivisors(ListNode head) {
        helper(head);
        return head;
    }

    private static void helper(ListNode head) {
        if(head.next == null) {
            return; // exit
        }

        ListNode insertionNode = new ListNode(gcd(head.val, head.next.val), head.next);

        //head.next = insertionNode; // 기존 노드를 수정할때는 초기화하면 안된다.
        ListNode newHead = new ListNode(head.val, insertionNode);

        insertGreatestCommonDivisors(head.next.next);
    }

    private static int gcd (int i, int j) { // Greatest Common Divisor (변형)
        if(j == 0) {
            return i;
        } else {
            return gcd(j, i%j);
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
