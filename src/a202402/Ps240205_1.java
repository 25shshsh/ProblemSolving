package a202402;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Ps240205_1 {
    public static void main(String[] args) {
        int n = 100;

        while(true) {
            int ran = (int)(Math.random()*100)+1;
            System.out.println(ran); // 1~100
        }
    }




    class Solution {
        int n;
        List<Integer> list = new ArrayList<>();

        public Solution(ListNode head) {
            while(head != null) {
                list.add(head.val); // 1
                head = head.next;
            }
            n = list.size(); // 2
        }

        public int getRandom() {
            return list.get((int)(Math.random()*n)); // 3
        }
    }

    public class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }

/**
 * Your Solution object will be instantiated and called as such:
 * Solution obj = new Solution(head);
 * int param_1 = obj.getRandom();
 */
}
