package a202402;

import java.util.PriorityQueue;
import java.util.Queue;

public class Ps240218_2 {
    public static void main(String[] args) {
        // heights = [4,2,7,6,9,14,12], bricks = 5, ladders = 1
        // 사다리는 보너스
        // 벽돌은 (다음인덱스의 값 - 현재인덱스의 값) > 0 의 경우 사용가능
        // 최종적으로 현재 위치 인덱스를 리턴
    }
    // 사다리를 쓴 최솟값 >= difference 라면?
    // 무조건 벽돌 사용해야하고, 벽돌 사용불가시 끝.

    // 사다리를 쓴 최솟값 < difference 라면?

    // 사다리를 쓴 최솟값 <= 벽돌개수 일때 -> 사다리를 쓴 최솟값만큼 벽돌투입, 사다리 회수
    // 사다리를 현재 difference로 땜빵

    // 사다리를 쓴 최솟값 > 벽돌개수 일때 끝.

    // 아예 사다리가 존재하지 않았다면?
    class Solution {
        public int furthestBuilding(int[] heights, int bricks, int ladders) {
            int n = heights.length;
            Queue<Integer> laddersLength = new PriorityQueue<>(); // 1

            if(n == 1) return 0;

            for(int i = 0; i+1 < n; i++) { // 2
                if(heights[i] < heights[i+1]) {
                    int difference = heights[i+1] - heights[i]; // the height difference

                    if(ladders > 0) {
                        ladders--;
                        laddersLength.add(difference);
                    } else {

                        if(!laddersLength.isEmpty()) {
                            if(laddersLength.peek() >= difference) {
                                if(bricks - difference >= 0) bricks -= difference;
                                else return i;
                            }
                            else {
                                if(laddersLength.peek() <= bricks) {
                                    bricks -= laddersLength.poll();
                                    laddersLength.add(difference);
                                } else return i;
                            }
                        }
                        else {
                            if(bricks - difference >= 0) bricks -= difference;
                            else return i;
                        }
                    }
                }
            }

            return n-1;
        }
    }

}
