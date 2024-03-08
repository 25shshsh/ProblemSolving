package a202403;

import java.util.Comparator;
import java.util.PriorityQueue;

public class Ps240303_1 {
    public static void main(String[] args) {

    }

    class Solution {
        public int lastStoneWeight(int[] stones) {
            PriorityQueue<Integer> queue = new PriorityQueue<>(Comparator.reverseOrder());
            int stone = 0;

            for(int temp : stones) {
                queue.add(temp);
            }

            while(queue.size() > 1) {
                stone = queue.poll();

                if(stone == queue.peek()) queue.poll();
                else if(stone > queue.peek()) {
                    queue.add(stone - queue.poll());
                }
            }

            return queue.isEmpty()? 0 : queue.poll();
        }
    }


    }
