package a202309;

import java.util.Stack;
import java.util.stream.IntStream;

public class Ps230928_2 {

    public static void main(String[] args) {
        // nums = [3,2,2,3], val = 3 일때, nums = [2,2,_,_]로 수정하고 2를 리턴하면 된다.
        // nums = [0,1,2,2,3,0,4,2], val = 2 일때, nums = [0,1,4,0,3,_,_,_]로 수정하고 5룰 리턴하면 된다.

        int[] nums = {0,1,2,2,3,0,4,2};
        int val = 2;
        int idx = 0;
        Stack<Integer> stack = new Stack<>();

        for(int i = 0; i <nums.length; i++) {
            if(nums[i] != val) {
                stack.push(nums[i]);
                nums[idx++] = stack.pop();
            }
        }


    }

    class Solution {
        public int removeElement(int[] nums, int val) {
            int idx = 0;
            Stack<Integer> stack = new Stack<>();

            for(int i = 0; i <nums.length; i++) {
                if(nums[i] != val) {
                    stack.push(nums[i]);
                    nums[idx++] = stack.pop();
                }
            }

            return idx;
        }
    }

    static void printArr(int[] arr) {
        IntStream.rangeClosed(1, arr.length).forEach(i -> {
            System.out.print(arr[i - 1] + " ");
        });
        System.out.println();
    }


}
