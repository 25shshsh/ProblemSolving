package a202311;

import java.util.Stack;

public class Ps231120_1 {
    public static void main(String[] args) {

    }

    class Solution {
        public void gameOfLife(int[][] board) {
            int m = board.length;
            int n = board[0].length;
            int sum = 0;
            Stack<Integer> stack = new Stack<>();

            for (int i = 0; i < m; i++) { // 1
                for (int j = 0; j < n; j++) {
                    sum = 0;
                    int x = i - 1;
                    int y = j - 1;

                    while (x < i + 2) { // 2
                        if (x >= 0 && y >= 0 && x < m && y < n) {
                            sum += board[x][y];
                        }

                        y++;

                        if (y > j + 1) {
                            x++;
                            y = j - 1;
                        }
                    }

                    sum -= board[i][j]; // 3

                    if (board[i][j] == 0) { // 4
                        if (sum == 3) stack.push(1);
                        else stack.push(0);
                    } else {
                        if (sum == 2 || sum == 3) stack.push(1);
                        else stack.push(0);
                    }
                }
            }

            for (int i = m - 1; i >= 0; i--) { // 5
                for (int j = n - 1; j >= 0; j--) {
                    board[i][j] = stack.pop();
                }
            }
        }
    }

}
