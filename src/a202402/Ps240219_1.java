package a202402;

public class Ps240219_1 {

    public class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
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
        public ListNode deleteDuplicates(ListNode head) {
            if(head == null || head.next == null) return head;

            ListNode dummyHead = new ListNode(0, head);
            ListNode prevNode = dummyHead;
            ListNode currNode = head;
            boolean foundDuplicate = false;

            while(currNode.next != null) {
                if(currNode.val == currNode.next.val) { // 중복노드 발견
                    currNode = currNode.next;
                    foundDuplicate = true;
                }
                else {
                    currNode = currNode.next;

                    if(foundDuplicate) { // 중복노드 탐색 끝, 중복노드 삭제
                        prevNode.next = currNode;
                        foundDuplicate = false;
                    }
                    else prevNode = prevNode.next; // 중복노드 발견x
                }
            }
            if(foundDuplicate) prevNode.next = null;

            return dummyHead.next;
        }
    }



}
