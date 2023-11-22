package a202311;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Stack;
import java.util.stream.IntStream;

public class Ps231116_1 {
    public static void main(String[] args) {

    }

// https://leetcode.com/problems/number-of-laser-beams-in-a-bank/
    class Solution {
        public int numberOfBeams(String[] bank) {
            int answer = 0;
            int ptr1 = 0;
            int ptr2 = 0;
            boolean ptr1HasValue = false;

            for (int i = 0; i < bank.length; i++) {
                int sum = 0;

                for (int j = 0; j < bank[0].length(); j++) {
                    if (bank[i].charAt(j) == '1') sum++;
                }

                if (sum != 0 && !ptr1HasValue) {
                    ptr1 = sum;
                    ptr1HasValue = true;
                    continue; // 초기 값 설정하는 1회용
                }

                if(sum != 0) {
                    ptr2 = sum;
                    answer += ptr1 * ptr2;
                    ptr1 = ptr2;
                }
            }

            return answer;
        }
    }


    class Solution2 {
        public int numberOfBeams(String[] bank) {
            Stack<Integer> stack = new Stack<>();
            int answer = 0;

            for (int i = bank.length - 1; i >= 0; i--) {
                int sum = 0;
                for (int j = bank[0].length() - 1; j >= 0; j--) {
                    if (bank[i].charAt(j) == '1') sum++;
                }
                if (sum != 0) stack.push(sum);
            }

            while (stack.size() != 1) {
                answer += stack.pop() * stack.peek();
            }

            return answer;
        }
    }


}
