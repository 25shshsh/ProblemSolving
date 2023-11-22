package a202311;

import java.util.Arrays;

public class Ps231121_1 {
    public static void main(String[] args) {
        int[][] answer = new int[3][3];
        int m = answer.length;
        int n = answer[0].length;
        int x = 0;
        int y = 0;
        int z = 0;
        int cnt = 0;
        int value = 0;

        int i = 0;
        int [] arr = {1,2,3,4,5,6,7,8,9};

        while (cnt < m*n) {
            value = arr[i];

            if (x == z && y < n-1) {
                answer[x][y++] = value;
            } else if (y == n-1) {
                answer[x++][y] = value;
            } else if (x == m-1) {
                answer[x][y--] = value;
            } else if (x == m-1 && y == z) {
                answer[x--][y] = value;
                if(x == z) {
                    z++;
                    x = z;
                    y = z;
                }
            }
            i++;
            cnt++;
        }
    }

    // 1 2 3 6 9 8 7 4 5
    class Solution {
        public int[][] spiralMatrix(int m, int n, ListNode head) {
            int[][] answer = new int[m][n];
            int x = 0;
            int y = 0;
            int z = 0;
            int cnt = 0;
            int maxCnt = m*n;

            while (cnt < maxCnt) {
                if(head == null) head = new ListNode(-1); // head가 null이면 -1을 추가하고 아니라면 head.val를 추가.
                if(x == m-1 && y == n-1) answer[x][y] = head.val; // 3*3일때 중앙값

                if (x == z && y < n-1) { // 4방향으로
                    answer[x][y++] = head.val;
                } else if (x < m-1 && y == n-1) {
                    answer[x++][y] = head.val;
                } else if (x == m-1 && y > z) {
                    answer[x][y--] = head.val;
                } else if (x > z && y == z) {
                    answer[x--][y] = head.val;
                    if(x == z) { // 1바퀴 순회시 시작인덱스 +1씩, 마지막인덱스는 -1씩
                        z++;
                        x = z;
                        y = z;
                        m--;
                        n--;
                    }
                }

                head = head.next == null? null : head.next; // head.next가 null인지 판단.
                cnt++;
            }

            return answer;
        }
    }


    public class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }
/*   if (x == z && y < n-1) {
        answer[x][y++] = value;
    } else if (x < m-1 && y == n-1) {
        answer[x++][y] = value;
    } else if (x == m-1 && y > z) {
        answer[x][y--] = value;
    } else if (x > z && y == z) {
        answer[x--][y] = value;
        if(x == z) {
            z += 1;
            x = z;
            y = z;
        }
    }*/
}
