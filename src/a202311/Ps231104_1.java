package a202311;

import java.util.stream.IntStream;

public class Ps231104_1 {

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        for(int i = 0; i < 5; i++) {
            if(i == 5 - 1 || arr[i+1] == 5) {
                System.out.println(i);
            }
        }

    }
    // board = [["X",".",".","X"],[".",".",".","X"],[".",".",".","X"]]
    class Solution {
        public int countBattleships(char[][] board) {
            int m = board.length;
            int n =  board[0].length;
            int cnt = 0;

            if(m * n == 1) { //
                if(board[0][0] == 'X') return 1;
                else return 0;
            }

            for(int i = 0; i < m; i++) {
                for(int j = 0; j < n; j++) {

                    if(board[i][j] == 'X'
                            && (i == m - 1 || board[i + 1][j] == '.')
                            && (j == n - 1 || board[i][j + 1] == '.')) {
                        cnt++;
                    }
                }
            }
            return cnt;
        }
    }
}
