package a202311;

import java.util.Arrays;
import java.util.Objects;
import java.util.PriorityQueue;
import java.util.Queue;

public class Ps231110_1 {
    public static void main(String[] args) { // {군인의 수, 인덱스}
        int [][] arr = {{2,0},{4,1},{1,2},{2,3},{5,4}};

        Arrays.sort(arr, (o1, o2) -> o1[0] - o2[0]); // 군인의 수가 적은 순부터, 인덱스가 작은 순부터

        System.out.println(arr[0][1]);
        System.out.println(arr[1][1]);
        System.out.println(arr[2][1]);

    }

    class Solution {
        public int[] kWeakestRows(int[][] mat, int k) {

            Queue<SoldierIndex> queue = new PriorityQueue<>();
            int [] answer = new int[k];


            for(int i = 0; i < mat.length; i++) {
                int soldier = 0;

                for(int j = 0; j < mat[0].length; j++) {
                    soldier += mat[i][j];
                }

                SoldierIndex soldierIndex = new SoldierIndex(soldier, i);
                queue.add(soldierIndex);
            }


            for(int i = 0; i < k; i++) {
                answer[i] = Objects.requireNonNull(queue.poll()).index;
            }

            return answer;
        }

        static class SoldierIndex implements Comparable<SoldierIndex>{
            int soldier;
            int index;

            SoldierIndex (int soldier, int index) {
                this.soldier = soldier;
                this.index = index;
            }


            @Override
            public int compareTo(SoldierIndex o) {
                int comparison = Integer.compare(this.soldier, o.soldier);

                if(comparison == 0) return Integer.compare(this.index, o.index);

                return soldier - o.soldier;
            }
        }

    }

}
