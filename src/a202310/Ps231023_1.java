package a202310;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

public class Ps231023_1 {

    public static void main(String[] args) {
        System.out.println((int)'1'); // 49
        System.out.println((int)'9'); // 57
        System.out.println('1'- 48); // 1
        System.out.println('9'-48); // 9

        System.out.println(818 / 10);
        System.out.println(818 % 10);
        System.out.println(2%10);

    }

    class Solution {
        public List<Integer> addToArrayForm(int[] num, int k) {
            List<Integer> list = new LinkedList<>();
            int carry = 0;

            for(int i = num.length-1; i >= 0; i--) {
                list.add(0, (num[i] + k) % 10);
                k = (num[i] + k) / 10;
            }

            while(k > 0) { // {0} , 10000
                list.add(0,k%10);
                k /= 10;
            }

            return list;
        }
    }


}
