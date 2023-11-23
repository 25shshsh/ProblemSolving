package a202311;

import java.util.stream.IntStream;

public class Ps231124_1 {

    public static void main(String[] args) {

    }


    // 움직이는 순서는 오 밑 왼 위 순 4번으로 나뉜다.
    // 오 밑은 무조건 홀수번 이동, 왼 위는 짝수번 이동. 1 1 2 2 3 3 4 4 5 5 순으로 나선형 증가
    // cnt는 rows * cols 이 될때까지 증가
    // 인덱스가 벗어났다면 그냥 rStart, cStart 증감만 있을뿐 값 추가는 없다.
        class Solution {
            public int[][] spiralMatrixIII(int rows, int cols, int rStart, int cStart) {
                int[][] answer = new int[rows * cols][2];
                int cnt = 0;
                int n = 1;
                int x = rStart;
                int y = cStart;

                while (cnt < rows * cols) {

                    for (int i = cStart; i < cStart + n; i++) { // 오
                        if(x < rows && y < cols && x >= 0 && y >= 0) {
                            answer[cnt][0] = x;
                            answer[cnt][1] = y;
                            ++cnt;
                        }
                        y++;
                    }
                    cStart = y;

                    for (int i = rStart; i < rStart + n; i++) { // 밑
                        if(x < rows && y < cols && x >= 0 && y >= 0) {
                            answer[cnt][0] = x;
                            answer[cnt][1] = y;
                            ++cnt;
                        }
                        x++;
                    }
                    rStart = x;
                    n++;

                    for (int i = cStart; i > cStart - n; i--) { // 왼
                        if(x < rows && y < cols && x >= 0 && y >= 0) {
                            answer[cnt][0] = x;
                            answer[cnt][1] = y;
                            ++cnt;
                        }
                        y--;
                    }
                    cStart = y;

                    for (int i = rStart; i > rStart - n; i--) { // 위
                        if(x < rows && y < cols && x >= 0 && y >= 0) {
                            answer[cnt][0] = x;
                            answer[cnt][1] = y;
                            ++cnt;
                        }
                        x--;
                    }
                    rStart = x;
                    n++;

                }

                return answer;
            }
        }

}
