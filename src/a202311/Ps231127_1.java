package a202311;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Ps231127_1 {
    public static void main(String[] args) {

    }

    class Solution {
        public int equalPairs(int[][] grid) {
            int n = grid.length;
            int cnt = 0;
            Map<String,Integer> rowSums = new HashMap<>();

            for(int[] row : grid) { // 1. 모든 row저장
                String rowString = Arrays.toString(row);
                rowSums.put(rowString, rowSums.getOrDefault(rowString, 0) + 1);
            }

            for(int i = 0; i < n; i++) { // 2. 각 col마다 모든 row와 비교
                int [] colSum = new int[n];
                for(int j = 0; j < n; j++) {
                    colSum[j] = grid[j][i];
                }
                String colString = Arrays.toString(colSum);
                cnt += rowSums.getOrDefault(colString, 0); // col == row 일때 cnt++
            }

            return cnt;
        }
    }


}
