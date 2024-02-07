package a202402;

import java.util.*;

public class Ps240209_1 {
    public static void main(String[] args) {
        List<Integer> list = new LinkedList<>();

        list.add(1);
        list.add(4);
        list.add(2);
        list.add(3);

        int n = list.size();
        list.remove(1);



      /*  int[] array = set.stream()  // set의 스트림 생성
                .mapToInt(Integer::intValue)  // 각 Integer를 int로 언박싱
                .toArray();  // 스트림을 int[] 배열로 변환*/



    }
// https://leetcode.com/problems/next-greater-node-in-linked-list/description/
    class Solution {
        public int[] nextLargerNodes(ListNode head) {
            ListNode tempHead = head;
            Stack<Integer> stack = new Stack<>();
            int[] list;
            int[] answer;
            int n = 0;
            int i = 0;

            while(tempHead != null) { // 1
                n++;
                tempHead = tempHead.next;
            }

            list = new int[n];
            tempHead = head;

            while(tempHead != null) { // 2
                list[i++] = tempHead.val;
                tempHead = tempHead.next;
            }

            answer = new int[n]; // 3

            for(i = 0; i < n; i++) { // 4
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
