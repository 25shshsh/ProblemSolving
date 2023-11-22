package a202311;

public class Ps231122_1 {
    public static void main(String[] args) {

    }

    class Solution {
        public int[][] generateMatrix(int n) {
            int cnt = 0;
            int maxCnt = n*n;
            int [][] answer = new int[n][n];
            int x = 1;

            if(n == 1) {
                answer[0][0] = 1;
                return answer;
            }

            while(cnt < maxCnt) {


                for(int i = x-1; i < n; i++) { // 1,2,3 넣고 cnt = 3이 된다.
                    answer[x-1][i] = ++cnt;
                }

                for(int i = x; i < n; i++) { // 4, 5 넣고 cnt = 5가 된다.
                    answer[i][n-1] = ++cnt;
                }

                for(int i = n-2; i >= x-1; i--) { // 6,7 넣고 cnt = 7이 된다.
                    answer[n-1][i] = ++cnt;
                }

                for(int i = n-2; i >= x; i--) { // 8 넣고 i j 초기값 1씩 추가
                    answer[i][x-1] = ++cnt;
                }
                x++;
                n--;
            }

            return answer;
        }
    }

}
