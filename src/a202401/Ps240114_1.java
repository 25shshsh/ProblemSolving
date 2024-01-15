package a202401;

public class Ps240114_1 {
    public static void main(String[] args) {
    }

    class Solution {
        public int partitionString(String s) {
            int answer = 0;
            int i = 0;
            int n = s.length();

            while(i < n) {
                boolean[] flags = new boolean[26]; // 1

                while(i < n) {
                    if(!flags[s.charAt(i)-'a']) flags[s.charAt(i)-'a'] = true; // 2
                    else break;

                    i++; // 3
                }
                answer++;
            }

            return answer;
        }
    }

    class Solution2 {
        public int partitionString(String s) {
            int answer = 0;
            int i = 0;

            while(i < s.length()) {
                int[] arr = new int[26];
                answer++;

                while(i < s.length()) {
                    if(arr[s.charAt(i) - 97] > 0) break;

                    arr[s.charAt(i) - 97]++;
                    i++;
                }
            }

            return answer;
        }
    }
}
