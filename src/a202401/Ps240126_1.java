package a202401;

public class Ps240126_1 {
    public static void main(String[] args) {

    }
    /*nextNode = mid.next;
    mid.next = reverseHead;
    reverseHead = mid;
    mid = nextNode;*/
    class Solution {
        public boolean isPalindrome(ListNode head) {
            ListNode mid = head;
            ListNode end = head;
            ListNode reverseHead = null;

            while(true) { // 1.
                if(end.next != null && end.next.next == null) {
                    mid = mid.next;
                    break;
                }
                else if(end != null && end.next == null) break;

                mid = mid.next;
                end = end.next.next;
            }

            while(mid != null) { // 2.
                ListNode nextNode = mid.next;
                mid.next = reverseHead;
                reverseHead = mid;
                mid = nextNode;
            }

            while(head != null && reverseHead != null) { // 3.
                if(head.val != reverseHead.val) return false;
                head = head.next;
                reverseHead = reverseHead.next;
            }

            return true;
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
    }



}
