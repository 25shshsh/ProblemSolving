package a202402;

import a202401.Ps240126_1;

public class Ps240216_1 {
    public static void main(String[] args) {
        
    }


    class Solution {
        public ListNode reverseBetween(ListNode head, int left, int right) {
            ListNode tempHead = new ListNode(0, head); // 1
            reverseLeftToRight(tempHead, left, right);
            return tempHead.next;
        }

        void reverseLeftToRight(ListNode tempHead, int left, int right) {
            int n = 0;
            ListNode prevNode = new ListNode();

            while(n < left) { // 2
                if(n+1 == left) prevNode = tempHead;
                tempHead = tempHead.next;
                n++;
            }

            ListNode reverseHeadNode = null;
            ListNode nextNode = null;
            ListNode reverseTailNode = tempHead;

            while(n <= right) { // 3
                nextNode = tempHead.next;
                tempHead.next = reverseHeadNode;
                reverseHeadNode = tempHead;
                tempHead = nextNode;
                n++;
            }

            prevNode.next = reverseHeadNode; // 4
            reverseTailNode.next = nextNode;
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
