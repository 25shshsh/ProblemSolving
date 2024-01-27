package a202401;

public class Ps240116_1 {
    public static void main(String[] args) {

    }

    class Solution {
        public int maximumGroups(int[] grades) {
            int answer = 1;

            while((answer * (answer+1))/2 <= grades.length) { // 1, 2
               answer++;
            }

            return answer-1;
        }
    }

}
