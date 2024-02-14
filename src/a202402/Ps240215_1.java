package a202402;

import java.util.Arrays;

public class Ps240215_1 {
    public static void main(String[] args) {
        
    }


    public class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }


    class Solution {
        public void reorderList(ListNode head) {
            if(head.next == null || head.next.next == null) return;

            int[] array = linkedListToArray(head); // 2
            int ptr1 = 0;
            int ptr2 = array.length-1;

            while(true) { // 3
                if(ptr1 > ptr2) break;
                else if(ptr1 == ptr2) {
                    head.val = array[ptr1];
                    break;
                }

                head.val = array[ptr1++];
                head.next.val = array[ptr2--];
                head = head.next.next;
            }
        }

        int[] linkedListToArray(ListNode head) { // 1
            int n = 0;
            ListNode tempHead = head;

            while(tempHead != null) {
                tempHead = tempHead.next;
                n++;
            }

            int[] array = new int[n];
            tempHead = head;

            for(int i = 0; i < n; i++) {
                array[i] = tempHead.val;
                tempHead = tempHead.next;
            }

            return array;
        }
    }

}
