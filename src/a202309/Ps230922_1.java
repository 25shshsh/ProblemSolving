package a202309;


import java.util.PriorityQueue;
import java.util.stream.IntStream;

public class Ps230922_1 {
// https://school.programmers.co.kr/learn/courses/30/lessons/42626

    public static void main(String[] args) {

        int[] scoville ={1, 2, 3, 9, 10, 12};
        int K = 7;
        int cnt = 0;
        PriorityQueue<Integer> queue = new PriorityQueue<>();

        for (int i = 0; i < scoville.length; i++) {
            queue.add(scoville[i]);
        }

        System.out.println(queue.size());

        while(queue.peek() < K) { // 가장 덜 매운 음식이 K미만일때만 실행

            if(queue.size() == 1) { // 마지막까지 음식을 합쳤음에도 불구하고 K보다 작은 경우
                System.out.println(-1);
                break;
            }

            int mixture = queue.poll() + queue.poll() * 2;
            queue.add(mixture);
            cnt++;
        }
        System.out.println(cnt);

    }


    class Solution {
        public int solution(int[] scoville, int K) {

            int cnt = 0;
            PriorityQueue<Integer> queue = new PriorityQueue<>();

            for (int i = 0; i < scoville.length; i++) {
                queue.add(scoville[i]);
            }

            while(queue.peek() < K) { // 가장 덜 매운 음식이 K미만일때만 실행

                if(queue.size() == 1) { // 마지막까지 음식을 합쳤음에도 불구하고 K보다 작은 경우
                    return -1;
                }

                int mixture = queue.poll() + queue.poll() * 2;
                queue.add(mixture);
                cnt++;
            }
            return cnt;
        }
    }

    static void printArr(int[] array) {
        IntStream.rangeClosed(1, array.length).forEach(i -> {
            System.out.print(array[i - 1] + " ");
        });
        System.out.println();
    }
}


