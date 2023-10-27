package a202310;

public class Ps231025_1 {

    public static void main(String[] args) {
        System.out.println('5'-48);

        String str = "601235";
    }


    class Solution {
        public int minPartitions(String n) {
            int maxDigit = 0;

            for(int i = 0; i < n.length(); i++) { // O(n)
                maxDigit = Math.max(maxDigit, n.charAt(i));
            }

            return maxDigit - 48 ; // ex) '9' - 48 = 9
        }
    }


}
