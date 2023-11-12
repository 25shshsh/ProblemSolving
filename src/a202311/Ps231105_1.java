package a202311;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Ps231105_1 {
    public static void main(String[] args) {
        int k = 4;
        int total = 12;
        for(int i = 0; i < total; i++) {
            System.out.println((total + k + i) % total);
        }

    }

    // https://leetcode.com/problems/shift-2d-grid/solutions/1934777/java-easy-to-understand-explanation-iterate-and-add-as-though-a-1d-array/
    class Solution {
        public List<List<Integer>> shiftGrid(int[][] grid, int k) {
            List<List<Integer>> list = new ArrayList<>();
            int m = grid.length;
            int n = grid[0].length;
            int total = m*n;
            k = k % total;


            for(int i = 0; i < m; i++){
                list.add(new ArrayList<>());
            }
            for(int i = 0; i < total; i++) {
                int index = (total - k + i) % total;
                list.get(i/n).add(grid[index/n][index%n]);

            }
            return list;
        }
    }

}
