package a202402;

import java.util.Arrays;
import java.util.PriorityQueue;

public class Ps240227_1 {

    public static void main(String[] args) {
        int[] nums = {-2,5,0,2,-2};
        int k = 3;
        int[] numbers = new int[201]; // -100 ~ 100
        int sum = 0;
        int maxAbs = 0;

        for (int n: nums) {
            maxAbs = Math.max(maxAbs, Math.abs(n));
            numbers[100 + n]++;
            sum += n;
        }
        if (maxAbs == 0);


        while (k-- != 0) {
            int i = 100 - maxAbs;
            while (numbers[i] == 0) {
                i++;
            }
            numbers[i]--;
            numbers[200 - i]++;
            sum -= 2 * (i - 100);
        }



    }

    class Solution {
        public int largestSumAfterKNegations(int[] nums, int k) {
            PriorityQueue<Integer> queue = new PriorityQueue<>();
            int sum = 0;

            for(int num : nums){
                queue.offer(num);
            }

            while(k > 0){
                int temp = queue.poll();
                temp = -temp;
                queue.offer(temp);
                k--;
            }

            while(!queue.isEmpty()){
                sum += queue.poll();
            }

            return sum;
        }
    }

}
