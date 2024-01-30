package a202401;

public class Ps240128_1 {
    public static void main(String[] args) {

    }

    class Solution {
        public ListNode removeNodes(ListNode head) {
            ListNode tempHead = head;
            ListNode reverseHead = null;

            while(tempHead != null) { // 1
                ListNode nextNode = tempHead.next;
                tempHead.next = reverseHead;
                reverseHead = tempHead;
                tempHead = nextNode;
            }

            ListNode answer = reverseHead;

            while(reverseHead.next != null) {
                if(reverseHead.val > reverseHead.next.val) { // 2
                    if(reverseHead.next.next != null) reverseHead.next = reverseHead.next.next;
                    else reverseHead.next = null;
                }
                else reverseHead = reverseHead.next;
            }

            reverseHead = null;

            while(answer != null) { // 3
                ListNode nextNode = answer.next;
                answer.next = reverseHead;
                reverseHead = answer;
                answer = nextNode;
            }

            return reverseHead;
        }

        public class ListNode {
            int val;
            ListNode next;
            ListNode() {}
            ListNode(int val) { this.val = val; }
            ListNode(int val, ListNode next) { this.val = val; this.next = next; }
        }
    }



}
