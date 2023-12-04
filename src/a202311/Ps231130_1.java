package a202311;

import java.util.Arrays;

public class Ps231130_1 {
    public static void main(String[] args) {

    }

    class Solution {
        public char[][] rotateTheBox(char[][] box) {
            int m = box.length;
            int n = box[0].length;
            char[][] answer = new char[n][m];

            // 리턴할 n*m배열에 빈 공간을 나타내는 '.'로 채워넣는다.
            for (char[] arr : answer) Arrays.fill(arr, '.');

            for (int i = 0; i < m; i++) {
                int stoneCount = 0;

                for (int j = 0; j < n; j++) {
                    if (box[i][j] == '#') stoneCount++; // box i행의 돌의 개수를 센다.

                    if (box[i][j] == '*') { // 1. 현재 위치가 벽일때
                        // box를 시계방향으로 90도 회전시킨 answer에 벽 '*'을 넣는다.
                        answer[j][m - 1 - i] = '*';
                        int temp = j - 1;

                        // 현재 벽의 왼쪽방향으로 돌의 개수만큼 '#'을 넣는다.
                        while (stoneCount > 0) {
                            answer[temp][m - 1 - i] = '#'; // answer에 돌 '#'을 넣는다.
                            stoneCount--;
                            temp--;
                        }
                    }

                    if (j == n - 1) { // 2. 현재 위치가 공간의 우측 끝일때
                        int temp = j;
                        // 현재 위치를 '포함'하여 왼쪽 방향으로 돌 '#'을 채운다.
                        while (stoneCount > 0) {
                            answer[temp][m - 1 - i] = '#';
                            stoneCount--;
                            temp--;
                        }
                    }

                }
            }

            return answer;
        }


        // '#' = stone, '*' = obstacle, '.' = empty space
        class Solution2 {
            public char[][] rotateTheBox(char[][] box) {
                int m = box.length;
                int n = box[0].length;
                char[][] answer = new char[n][m];

                // 돌을 우측정렬
                for (int i = 0; i < m; i++) {
                    int stoneCount = 0;
                    int spaceCount = 0;
                    for (int j = 0; j < n; j++) { // i행의 모든 돌의 개수 세기

                        if (box[i][j] == '#') stoneCount++;
                        if (box[i][j] == '*') {
                            stoneMove(spaceCount, stoneCount, box, i, j);
                            spaceCount = j + 1; // 정렬 후 벽 바로 다음 공간을 초기값으로.
                            stoneCount = 0;
                        }
                        if (j == n - 1) stoneMove(spaceCount, stoneCount, box, i, j + 1);
                    }
                    for (int j = 0; j < n; j++) {
                        answer[j][m - 1 - i] = box[i][j];
                    }
                }
                return answer;
            }

            private void stoneMove(int spaceCount, int stoneCount, char[][] box, int i, int j) {
                int emptyCount = (j - spaceCount) - stoneCount; // 돌이 없는 빈 공간

                while (spaceCount < j) {
                    if (emptyCount > 0) {
                        box[i][spaceCount] = '.';
                        emptyCount--;
                    } else {
                        box[i][spaceCount] = '#';
                    }
                    spaceCount++;
                }

            }
        }


    }
}
