package a202402;

import java.util.Stack;

public class Ps240203_1 {
    public static void main(String[] args) {
        System.out.println('0'-48);
        System.out.println('9');

    }

    class Solution {
        public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
            Stack<Integer> stack1 = new Stack<>();
            Stack<Integer> stack2 = new Stack<>();
            ListNode head = new ListNode();
            ListNode answer = head;
            int carry = 0;

            while(l1 != null || l2 != null) { // 1
                if(l1 != null) {
                    stack1.push(l1.val);
                    l1 = l1.next;
                }
                if(l2 != null) {
                    stack2.push(l2.val);
                    l2 = l2.next;
                }
            }

            while(!(stack1.isEmpty() && stack2.isEmpty() && carry == 0)) { // 2
                int sum = 0;

                if(!stack1.isEmpty()) sum += stack1.pop();
                if(!stack2.isEmpty()) sum += stack2.pop();

                if(carry > 0) {
                    sum += carry;
                    carry = 0;
                }

                if(sum >= 10) {
                    sum %= 10;
                    carry++;
                }

                if(head.next == null) {
                    head.next = new ListNode(sum);
                } else { // 3
                    ListNode tempNode = head.next;
                    head.next = new ListNode(sum);
                    head.next.next = tempNode;
                }
            }

            return answer.next;
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
