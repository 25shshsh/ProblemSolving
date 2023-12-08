package a202312;

public class Ps231205_1 {

    public static void main(String[] args) {

        // a~z 는 97 ~ 122, 1~26
   /*     System.out.println('a' - 96);
        System.out.println('z' - 96);*/

// https://leetcode.com/problems/sum-of-digits-of-string-after-convert/
    }

    class Solution {
        public int getLucky(String s, int k) {
            StringBuilder str = new StringBuilder();
            int sum = 0;

            for(int i = 0; i < s.length(); i++) { // 1. convert
                str.append(s.charAt(i) - 96);
            }

            while(k > 0) { // 2. transform(repeat k times)
                if(str.length() == 1) return str.charAt(0) - '0';
                sum = 0;

                for (int i = 0; i < str.length(); i++) {
                    sum += str.charAt(i) - '0';
                }

                str.setLength(0);
                str.append(sum);
                k--;
            }

            return sum;
        }
    }
}
