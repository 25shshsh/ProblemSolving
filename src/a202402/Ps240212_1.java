package a202402;

import a202401.Ps240126_1;

import java.util.Arrays;
import java.util.Stack;

public class Ps240212_1 {
    public static void main(String[] args) {
        
    }
// https://leetcode.com/problems/reverse-nodes-in-even-length-groups/
class Solution {
    public ListNode reverseEvenLengthGroups(ListNode head) {
        ListNode answer = new ListNode(0, head);
        ListNode prevNode = answer;
        int currentGroupSize = 1;

        while (head != null) {
            ListNode currStartNode = head;
            int size = 0;

            while (head != null && size < currentGroupSize) { // 3
                head = head.next;
                size++;
            }

            if (size % 2 == 0) { // 4
                ListNode[] reversed = reverseGroup(currStartNode, size);
                prevNode.next = reversed[0];
                prevNode = reversed[1];
            } else {
                prevNode.next = currStartNode; // 5
                prevNode = head == null ? currStartNode : getGroupEndNode(currStartNode, size);
            }

            currentGroupSize++;
        }

        return answer.next;
    }

    private ListNode[] reverseGroup(ListNode head, int size) { // 2
        ListNode tempHead = head;
        ListNode startNode = null;
        ListNode endNode = head;
        int cnt = 0;

        while (cnt < size) {
            ListNode nextNode = tempHead.next;
            tempHead.next = startNode;
            startNode = tempHead;
            tempHead = nextNode;
            cnt++;
        }
        endNode.next = tempHead;
        return new ListNode[]{startNode, endNode};
    }

    private ListNode getGroupEndNode(ListNode start, int size) { // 1
        while (start != null && size > 1) {
            start = start.next;
            size--;
        }
        return start;
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
