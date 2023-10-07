package a202310;

import java.util.PriorityQueue;

public class Ps231003_1 {

    public static void main(String[] args) {

    }

    class Solution {
        public void merge(int[] nums1, int m, int[] nums2, int n) {
            PriorityQueue<Integer> queue = new PriorityQueue<>();
            int idx = 0;

            for(int i = 0; i < m; i++) {
                queue.add(nums1[i]);
            }
            for(int i = 0; i < n; i++) {
                queue.add(nums2[i]);
            }
            while(queue.size() != 0) {
                nums1[idx++] = queue.poll();
            }

        }
    }


}
