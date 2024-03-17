package a202403;

public class Ps240315_1 {
    public static void main(String[] args) {
        System.out.println(180/0);
    }


    class Solution {
        public int[] productExceptSelf(int[] nums) {
            int n = nums.length;
            int[] answer = new int[n];
            int[] hasZeros = new int[2];
            int product = 1;


            for(int i = 0; i < n; i++) { // 0~3
                if(nums[i] == 0) {
                    hasZeros[0]++;
                    hasZeros[1] = i; // hasZeros[0] == 1일때 를 위해
                }
                else product *= nums[i];
            }

            if(hasZeros[0] >= 2) return new int[n]; // 1
            else if(hasZeros[0] == 1) { // 2
                answer[hasZeros[1]] = product;
                return answer;
            }
            else { // 3
                for(int i = 0; i < n; i++) {
                    answer[i] = product / nums[i];
                }
                return answer;
            }

        }
    }


}
