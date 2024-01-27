package a202401;

import java.util.HashMap;
import java.util.Map;

public class Ps240117_1 {


    class Solution {
        private static Map<Integer, Integer> map = new HashMap<>();

        public int findMinFibonacciNumbers(int k) {
            int answer = 0;
            int temp = 0;
            int i = 0;

            while (true) { // 1
                temp = fibonacci(++i);

                if (temp > k) {
                    break;
                }
            }

            temp = 0;

            while (temp != k) { // 2

                if (temp + map.get(i) <= k) {
                    temp += map.get(i);
                    answer++;
                }
                i--;
            }

            return answer;
        }

        private int fibonacci(int i) {
            if (map.containsKey(i)) return map.get(i);

            int result;

            if (i > 2) {
                result = fibonacci(i - 1) + fibonacci(i - 2);
                map.put(i, result);

            } else {
                result = 1;
                map.put(i, result);
            }

            return result;

        }

    }
}


