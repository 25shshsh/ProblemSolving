package a202310;

import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.Queue;

public class Ps231008_2 {

    public static void main(String[] args) {
        int num = 2932;
        String str = String.valueOf(num);
        Character[] arr = new Character[str.length()];
        StringBuilder new1 = new StringBuilder();
        StringBuilder new2 = new StringBuilder();
        int idx = 0;

        for(int i = 0; i <str.length(); i++) {
            arr[i] = str.charAt(i);
        }

        Arrays.sort(arr);

        while(idx <str.length()) {
            new1.append(arr[idx++]);
            new2.append(arr[idx++]);
        }

        System.out.println(Integer.parseInt(new1.toString()) + Integer.parseInt(new2.toString()));

    }


    class Solution {

        public int minimumSum(int num) {
            String str = String.valueOf(num);
            Character[] arr = new Character[str.length()];
            StringBuilder new1 = new StringBuilder();
            StringBuilder new2 = new StringBuilder();
            int idx = 0;

            for(int i = 0; i <str.length(); i++) {
                arr[i] = str.charAt(i);
            }

            while(idx <str.length()) {
                new1.append(arr[idx++]);
                new2.append(arr[idx++]);
            }

            return Integer.parseInt(new1.toString()) + Integer.parseInt(new2.toString());

        }
    }

}
