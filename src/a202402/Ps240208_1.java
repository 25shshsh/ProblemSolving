package a202402;

import java.util.*;

public class Ps240208_1 {
    public static void main(String[] args) {
        int min = Integer.MAX_VALUE;
        System.out.println(min);
    }

    class Solution {
        public int[] nodesBetweenCriticalPoints(ListNode head) {
            List<Integer> arr = new ArrayList<>();
            int idx = 1;

            if (head.next.next == null) return new int[]{-1, -1}; // 1

            ListNode prevNode = head; // 2
            ListNode currNode = prevNode.next;
            ListNode nextNode = currNode.next;

            while(nextNode != null) { // 3
                if((prevNode.val < currNode.val && currNode.val > nextNode.val)
                        || (prevNode.val > currNode.val && currNode.val < nextNode.val)) {
                    arr.add(idx);
                }

                idx++;
                prevNode = currNode;
                currNode = nextNode;
                nextNode = nextNode.next;
            }
            if (arr.size() < 2) return new int[]{-1, -1}; // 4
            else if(arr.size() == 2) {
                int temp = arr.get(1) - arr.get(0);
                return new int[]{temp, temp};
            }

            int minima = 0;
            for (int i = 1; i < arr.size(); i++) { // 5
                minima = minima != 0? Math.min(minima, arr.get(i) - arr.get(i - 1))
                        : arr.get(i) - arr.get(i - 1);
            }

            return new int[]{minima, arr.get(arr.size() - 1) - arr.get(0)};
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
