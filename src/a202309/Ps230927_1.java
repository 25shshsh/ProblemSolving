package a202309;

import java.util.Stack;
import java.util.stream.IntStream;

public class Ps230927_1 {

    public static void main(String[] args) {
        int[] nums = {0,0,1,1,1,2,2,3,3,4};

        Stack<Integer> stack = new Stack<>();
        int idx = 0;

        stack.push(nums[0]);
        for(int i = 1; i < nums.length; i++) {

            if(stack.peek() != nums[i]) {
                nums[idx++] = stack.peek();
                stack.push(nums[i]);

            }
        }
        nums[idx++] = stack.pop();

        System.out.println(idx);
        printArr(nums);

    }

    class Solution {
        public int removeDuplicates(int[] nums) {

            int idx = 0;
            Stack<Integer> stack = new Stack<>();

            stack.push(nums[0]);
            for(int i = 1; i < nums.length; i++) {

                if(stack.peek() != nums[i]) {
                    nums[idx++] = stack.peek();
                    stack.push(nums[i]);

                }
            }
            nums[idx++] = stack.pop();
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
