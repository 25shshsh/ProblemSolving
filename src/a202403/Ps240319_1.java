package a202403;

import java.util.Arrays;

public class Ps240319_1 {
    public static void main(String[] args) {

    }
    // https://leetcode.com/problems/task-scheduler/solutions/4894956/easy-explanation-greedy-beats-96-38-c-java-python3-kotlin/?envType=daily-question&envId=2024-03-19
    class Solution {
        public int leastInterval(char[] tasks, int n) {
            int[] freq = new int[26];

            for (char task : tasks) { // 1
                freq[task - 'A']++;
            }

            Arrays.sort(freq); // 2

            int chunk = freq[25] - 1; // 3
            int idle = (chunk * n); // 4

            for (int i = 24; i >= 0; i--) { // 5
                idle -= Math.min(chunk, freq[i]);
            }


            return idle >= 0 ? tasks.length + idle : tasks.length; // 6
        }
    }
}
