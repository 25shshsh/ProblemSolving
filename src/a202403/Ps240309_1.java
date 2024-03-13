package a202403;

import java.util.HashMap;
import java.util.Map;

public class Ps240309_1 {
    public static void main(String[] args) {

    }

    class Solution {
        public int tribonacci(int n) {
            if(n == 0) return 0; // 1
            if(n <= 2) return 1;

            int answer = 0;
            int a = 0;
            int b = 1;
            int c = 1;

            for(int i = 3; i <= n; i++) { // 2
                answer = a + b + c;

                a = b;
                b = c;
                c = answer;
            }

            return answer;
        }
    }
}
