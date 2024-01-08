package a202401;

import java.util.Arrays;

public class Ps240107_1 {
    public static void main(String[] args) {

    }

    class Solution {
        public int minimumOperations(int[] nums) {
            int sub = 0;
            int answer = 0;
            Arrays.sort(nums);

            for(int num : nums) {
                int temp = num - sub; // 현재 ~ 이전 값의 차이
                if(temp != 0) { // 중복카운트 방지
                    sub += temp; // 메모이제이션과 같다.
                    answer++;
                }
            }

            return answer;
        }
    }
}
