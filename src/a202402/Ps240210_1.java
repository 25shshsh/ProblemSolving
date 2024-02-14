package a202402;

import java.util.*;

public class Ps240210_1 {
    public static void main(String[] args) {
        int[] arr = new int[]{5,4,3,2,1,6,7,9,8,10};


    }


    class Solution {
        public ListNode sortList(ListNode head) {
            ListNode tempHead = head;
            int[] arr;
            int n = 0;

            while(tempHead != null) {
                tempHead = tempHead.next;
                n++;
            }

            arr = new int[n];
            tempHead = head;

            for(int i = 0; i < n; i++) {
                arr[i] = tempHead.val;
                tempHead = tempHead.next;
            }

            Arrays.sort(arr);
            tempHead = head;

            for(int temp : arr) {
                tempHead.val = temp;
                tempHead = tempHead.next;
            }

            return head;
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
