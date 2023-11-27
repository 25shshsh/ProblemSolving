package a202311;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/*Input:queens=[[0,1],[1,0],[4,0],[0,4],[3,3],[2,4]],king=[0,0]
        Output:[[0,1],[1,0],[3,3]]*/

public class Ps231126_1 {
    public static void main(String[] args) {
        boolean[][] flag = new boolean[8][8];
        System.out.println(flag[0][0]);

    }

    class Solution {
        boolean[][] flag;
        List<List<Integer>> answer;

        public List<List<Integer>> queensAttacktheKing(int[][] queens, int[] king) {
            flag = new boolean[8][8];
            for (int[] x : queens) {
                flag[x[0]][x[1]] = true;
            }
            answer = new ArrayList<>();
            move(king[0], king[1], 1, 0);
            move(king[0], king[1], -1, 0);
            move(king[0], king[1], 0, 1);
            move(king[0], king[1], 0, -1);
            move(king[0], king[1], 1, 1);
            move(king[0], king[1], -1, -1);
            move(king[0], king[1], -1, 1);
            move(king[0], king[1], 1, -1);
            return answer;
        }

        private void move(int x, int y, int row, int col) {
            if (x < 0 || x > 7 || y < 0 || y > 7) {
                return;
            }
            if (flag[x][y]) {
                answer.add(List.of(x, y));
                return;
            }
            move(x + row, y + col, row, col);
        }
    }

}
