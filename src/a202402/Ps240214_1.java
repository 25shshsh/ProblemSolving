package a202402;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Ps240214_1 {
    public static void main(String[] args) {
        
    }

    public class Solution {
        public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
            Stack<ListNode> stackA = new Stack<>();
            Stack<ListNode> stackB = new Stack<>();
            ListNode answer = new ListNode(0);

            while(headA != null) { // 1
                stackA.add(headA);
                headA = headA.next;
            }

            while(headB != null) { // 1
                stackB.add(headB);
                headB = headB.next;
            }

            if(!(stackA.peek().equals(stackB.peek()))) return null; // 2-1
            else { // 2-2
                if(stackA.size() == 1) return stackA.peek();
                else if(stackB.size() == 1) return stackB.peek();
            }

            while(!stackA.isEmpty() && !stackB.isEmpty()) { // 3
                if((stackA.peek().equals(stackB.peek()))) {
                    answer = stackA.pop();
                    stackB.pop();
                } else return answer;
            }

            return answer;
        }
    }

    public class ListNode {
        int val;
        ListNode next;
        ListNode(int x) {
            val = x;
            next = null;
        }
    }



}
