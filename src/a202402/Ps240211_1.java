package a202402;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Ps240211_1 {
    public static void main(String[] args) {
        
    }

    class Solution {
        public int numComponents(ListNode head, int[] nums) {
            Set<Integer> set = new HashSet<>();
            boolean flag = false;
            int answer = 0;

            for(int num : nums) { // 1
                set.add(num);
            }

            while(head != null) { // 2
                if(set.contains(head.val)) {
                    if(!flag) {
                        answer++;
                        flag = true;
                    }
                } else flag = false;
                head = head.next;
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
