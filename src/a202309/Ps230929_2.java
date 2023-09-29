package a202309;

public class Ps230929_2 {

    public static void main(String[] args) {
        int[] nums = {1,3,5,6};
        int target = 0;

        int start = 0;
        int end = nums.length-1;



        while(start != end) {

            int middle = ((start + end) / 2) + 1;

            if(target >= nums[middle]) {
                start = middle;
            } else {
                end = middle - 1;
            }

        }

        if(target >= nums[start]) {
            System.out.println(start+1);
        }
        else {
            System.out.println(start);
        }



    }

    class Solution {
        public int searchInsert(int[] nums, int target) {
            int start = 0;
            int end = nums.length-1;

            while(start != end) {
                int middle = ((start + end) / 2) + 1;

                if(target >= nums[middle]) {
                    start = middle;
                } else {
                    end = middle - 1;
                }

            }
            return target > nums[start] ? start + 1 : start;

        }
    }


}
