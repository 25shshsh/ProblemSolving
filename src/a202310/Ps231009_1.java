package a202310;

import java.util.HashMap;
import java.util.Map;

public class Ps231009_1 {

    public static void main(String[] args) {
        int temp = 5;
        int count = 0;

        while(temp != 0){
            temp = temp & (temp-1);
            count++;
        }
        System.out.println(count);
    }

    class Solution {
        public int[] countBits(int n) {
            int[] ans = new int[n + 1]; // 0, idx 0~n까지 초기값 0.

            for (int i = 1; i < n + 1; i++) { // 1
                int tmp = i;
                int cnt = 0;

                while (tmp != 0) { //2, 10ms
                    if(tmp % 2 == 1) {
                        cnt++;
                    }
                    tmp /= 2;
                }
/*                 while(tmp != 0){ // 1ms
                    tmp = tmp & (tmp-1);
                    cnt++;
                }*/

                ans[i] = cnt;
            }

            return ans; // 3
        }

    }

/*    class Solution { // 11ms 46.4
        public int[] countBits(int n) {
            int[] ans = new int[n+1];
            return countBits(n, ans);
        }

        private int[] countBits(int n, int[] ans) {
            int cnt = 0;
            for(int i = 0; i < ans.length; i++) {
                ans[i] = decimalToBinary(i, cnt);
            }
            return ans;
        }


        private int decimalToBinary(int n, int cnt) {
            if(n % 2 == 1) {
                cnt++;
            }
            if(n > 1) {
                cnt = decimalToBinary(n/2, cnt);
            }
            return cnt;
        }
    }*/
}
