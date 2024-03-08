package a202403;

import java.util.Arrays;

public class Ps240301_1 {
    public static void main(String[] args) {

        System.out.println("a".repeat(10));

    }
    class Solution {
        public String maximumOddBinaryNumber(String s) {
            int n = s.length();
            int cnt = 0;
            char[] answer = new char[n];

            for(char ch : s.toCharArray()) { // 1
                if(ch == '1') cnt++;
            }

            if(cnt == 1) { // 2
                for(int i = 0; i < n-1; i++) {
                    answer[i] = '0';
                }
            }
            else if(cnt > 1) { // 3
                for(int i = 0; i < n-1; i++) {
                    if(cnt > 1) {
                        answer[i] = '1';
                        cnt--;
                    } else answer[i] ='0';
                }
            }
            answer[n-1] = '1';

            return new String(answer);
        }
    }

    class Solution2 {
        public String maximumOddBinaryNumber(String s) {
            StringBuilder answer = new StringBuilder();
            int cnt = 0;

            for(char ch : s.toCharArray()) {
                if(ch == '1') cnt++;
            }

            if(cnt == 1) {
                answer.append("0".repeat(s.length()-cnt));
                return answer.append(1).toString();
            }
            else if(cnt > 1) {
                answer.append("1".repeat(cnt-1));
                answer.append("0".repeat(s.length()-cnt));
                return answer.append(1).toString();
            }

            return null;
        }
    }
}
