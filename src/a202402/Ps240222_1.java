package a202402;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Set;

public class Ps240222_1 {

    public static void main(String[] args) {
        int[][] trust = {{3, 4}, {1, 2}};

        Arrays.sort(trust, (a, b) -> a[0] - b[0]);

    }

    class Solution {
        public int findJudge(int n, int[][] trust) {
            int[] trustScore = new int[n+1];
            boolean[] voter = new boolean[n+1];

            for(int i = 0; i < trust.length; i++) {
                voter[trust[i][0]] = true;
                trustScore[trust[i][1]]++;
            }

            for(int i = 1; i < trustScore.length; i++) {
                if(!voter[i] && trustScore[i] == n-1) return i;
            }

            return -1;
        }
    }
}
