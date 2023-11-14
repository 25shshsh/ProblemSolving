package a202310;

import java.util.*;

public class Ps231020_1 {

    public static void main(String[] args) {
        int n = 2;

        int temp = (int) Math.sqrt(n)+1;
         System.out.println((int) Math.sqrt(n)+1);

        for(int i = 2; i <= temp; i++) {
            if(n % i == 0 ) {
                System.out.println("n is not prime");
                // 소수x
            } else {
                System.out.println("n is prime");
            }
        }


    }
    // for문 2개로 크로스하는 형식으로 각각의 대각선의 수를 구한다.
    // 만약 현재 대각선의 수가 소수가 맞다면 최대값과 비교하여 저장.
    class Solution {
        public int diagonalPrime(int[][] nums) {

            Queue<Integer> queue = new PriorityQueue<>(Comparator.reverseOrder());
            int length = nums.length;
            int temp = length-1;

            for(int i = 0; i < length; i++) {
                queue.add(nums[i][i]);
                queue.add(nums[i][temp--]);
            }
            if(queue.peek() == 1) return 0;
            if(queue.peek() == 2) return 2;

            while(!queue.isEmpty()) {
                int largest = queue.poll();
                int sqrt = (int) Math.sqrt(largest)+1;

                for(int i = 2; i <= sqrt; i++) {
                    if(largest == 2) {
                        return largest;
                    }
                    if(largest % i == 0) {
                        break;
                    }
                    if(i == sqrt) {
                        return largest;
                    }
                }
            }

            return 0;
        }



    }
}
