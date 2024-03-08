package a202402;

public class Ps240221_1 {

    public static void main(String[] args) {
        int shift = 0;
        int left = 23;
        int right = 31;


        System.out.println(Integer.toBinaryString(31)+" "+Integer.toBinaryString(16));
        System.out.println(Integer.toBinaryString(left) +" " + Integer.toBinaryString(right));

        while(left != right) {
            left >>= 1;
            right >>= 1;
            System.out.println(Integer.toBinaryString(left) +" " + Integer.toBinaryString(right));
            shift++;
        }

        System.out.println(shift+", " + (left << shift));
        System.out.println(Integer.toBinaryString(left << shift));
        System.out.println(16 & 31);


    }


    public static int rangeBitwiseAnd(int left, int right) {
        if(left == right) return left;

        int answer = left;

        while(left+1 <= right) {
            answer = answer & left+1;
            left++;
        }

        return answer;
    }

    class Solution {
        public int rangeBitwiseAnd(int left, int right) {
            int shift = 0;

            while(left != right) {
                left >>= 1;
                right >>= 1;
                shift++;
            }

            return left << shift;
        }
    }
}
