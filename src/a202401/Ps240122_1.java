package a202401;

import java.util.Arrays;

public class Ps240122_1 {
    public static void main(String[] args) {
        int[] nums = {1,2,4,4};
        int[] answer = new int[2];
        int n = nums.length;
        int ptr = 0;
        int temp = 1;

        Arrays.sort(nums);

        for(int i = 0; i+1 < n; i++) {
            if(nums[i] == nums[i+1]) {
                answer[0] = nums[i];
                nums[i] = 0;
                break;
            }
        }
        System.out.println(Arrays.toString(nums));

        for(int i = 0; i < n; i++) {
            if(nums[i] == 0) {
                i++;
                answer[1] = temp++;
                continue;
            }

            if(nums[i] != temp) {
                answer[1] = temp;
                break;
            }

            if(i == n-1 && answer[1] == 0) answer[1] = n;
            temp++;
        }

        /*while(ptr < n) {
            if(nums[ptr] == 0) {
                ptr += 2;
                temp++;
                continue; // 0인 경우 이하 모두 건너뛰기
            }

            if(nums[ptr] != temp) {
                answer[1] = temp;
                break;
            }

            if(ptr == n-1) answer[1] = n;
            ptr++;
            temp++;
        }*/

        System.out.println(Arrays.toString(answer));
    }

    class Solution {
        public int[] findErrorNums(int[] nums) {
            int n = nums.length;
            boolean[] temp = new boolean[n+1];
            int[] answer = new int[2];


            for(int num : nums) {
                if(temp[num] && !temp[0]) {
                    answer[0] = num;// 이미 temp[num] == true인 경우에 num은 중복된 수 + 중복된 수는 단 하나기 때문에 boolean도 가능함.
                    temp[0] = true;
                }
                temp[num] = true;
            }

            for(int i = 1; i < temp.length; i++) {
                if(!temp[i]) {
                    answer[1] = i;
                    break;
                }
            }

            return answer;
        }
    }

}
