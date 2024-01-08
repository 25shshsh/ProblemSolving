package a202312;

public class Ps231228_1 {
    public static void main(String[] args) {

    }

    class Solution {
        public int[] twoSum(int[] numbers, int target) {
            int ptr1 = 0; // 1
            int ptr2 = numbers.length-1;

            while(ptr1 < ptr2) {
                int temp = numbers[ptr1] + numbers[ptr2];

                if(temp > target) ptr2--; // 2~3
                else if(temp < target) ptr1++; // 4
                else return new int[]{ptr1+1, ptr2+1};
            }

            return null;
        }
    }


}
