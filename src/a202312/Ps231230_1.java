package a202312;

import java.util.Arrays;

public class Ps231230_1 {
    public static void main(String[] args) {

    }

    class Solution {
        public int matchPlayersAndTrainers(int[] players, int[] trainers) {
            int answer = 0;
            int ptr1 = 0;
            int ptr2 = 0;

            Arrays.sort(players);
            Arrays.sort(trainers);

            while(true) {
                if(trainers.length == ptr2 || players.length == ptr1) break;

                if(players[ptr1] <= trainers[ptr2]) {
                    answer++;
                    ptr1++;
                    ptr2++;
                } else {
                    ptr2++;
                }
            }

            return answer;
        }
    }
}
