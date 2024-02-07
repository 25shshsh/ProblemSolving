package a202402;

import java.util.Stack;

public class Ps240207_1 {
    public static void main(String[] args) {
        
    }
    class Solution {
        public int[] nextLargerNodes(ListNode head) {
            ListNode tempHead = head;
            Stack<Integer> stack = new Stack<>();
            int[] list;
            int[] answer;
            int n = 0;
            int i = 0;

            while(tempHead != null) {
                n++;
                tempHead = tempHead.next;
            }

            list = new int[n];
            tempHead = head;

            while(tempHead != null) {
                list[i++] = tempHead.val;
                tempHead = tempHead.next;
            }

            answer = new int[n];

            for(i = 0; i < n; i++) {
                while(!stack.isEmpty() && list[stack.peek()] < list[i]) {
                    answer[stack.pop()] = list[i];
                }

                stack.push(i);
            }

            return answer;
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
