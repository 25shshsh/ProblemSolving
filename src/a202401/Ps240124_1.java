package a202401;

import java.util.*;

public class Ps240124_1 {
    public static void main(String[] args) {

    }


    class Solution {
        public int pairSum(ListNode head) {
            ListNode mid = head;
            ListNode end = head;
            int answer = 0;

            while(end != null && end.next != null) { /// 1
                mid = mid.next;
                end = end.next.next;
            }

            ListNode reverseHead = null; // 2
            ListNode nextNode = null;

            while(mid != null) { // 3
                nextNode = mid.next;
                mid.next = reverseHead;
                reverseHead = mid;
                mid = nextNode;
            }

            while(true) { // 4
                if(head == null || reverseHead == null) break;
                answer = Math.max(head.val+reverseHead.val, answer);
                head = head.next;
                reverseHead = reverseHead.next;
            }

            return answer;
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
