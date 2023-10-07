package a202310;

import java.util.HashMap;
import java.util.Map;

public class Ps231002_1 {

    public static void main(String[] args) {

    }


    class Solution {
        public int climbStairs(int n) {

            Map<Integer, Integer> map = new HashMap<>();


            return climbStairs(n, map);
        }

        private int climbStairs(int n, Map<Integer, Integer> map) {

            switch (n) {
                case 1:
                    return 1;
                case 2:
                    return 2;
            }

            if (!map.containsKey(n)) {
                map.put(n, climbStairs(n - 1, map) + climbStairs(n - 2, map));
            }

            return map.get(n);
        }
    }

/*    class Solution { // n = 45일때 시간초과
        public int climbStairs(int n) {
            if (n == 0 || n == 1) {
                return 1;
            }
            return climbStairs(n-1) + climbStairs(n-2);
        }
    }*/



/*    class Solution { // 재귀함수 44번째에서 시간초과

        static int cnt = 0;
        static int ans = 0;

        public static int climbStairs(int n) {
            int ans = upStairs(n,0,0);
            cnt = 0;
            return ans;
        }

        public static int upStairs(int n, int sum, int step) {
            if(sum > n) {
                return -1;
            }

            if(n == sum) {
                cnt++;
                return -1;
            }
            sum += step;
            upStairs(n,sum,1);
            upStairs(n,sum,2);


            return cnt/2;
        }
    }*/


}
