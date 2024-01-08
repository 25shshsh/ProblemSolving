package a202312;

public class Ps231224_1 {
    public static void main(String[] args) {

    }

    class Solution {
        public int[] rearrangeArray(int[] nums) {
            int evenIdx = 0;
            int oddIdx = 1;
            int[] answer = new int[nums.length];

            for (int num : nums) {
                if (num > 0) {
                    answer[evenIdx] = num;
                    evenIdx += 2;
                } else {
                    answer[oddIdx] = num;
                    oddIdx += 2;
                }
            }

            return answer;
        }
    }
}
