package a202312;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class Ps231203_1 {
    public static void main(String[] args) {
        // 97 ~ 122, a ~ z
        System.out.println((int) 'd');
        System.out.println((int) 'c');
        System.out.println('z' - 0);
        System.out.println(13 % 2);

        int[] arr1 = new int[1];
        int[] arr2 = new int[1];

        System.out.println(arr1 == arr2);
        System.out.println(Arrays.equals(arr1, arr2));

    }

    class Solution {
        public String oddString(String[] words) {
            int n = words[0].length(); // 0
            int[] arr1 = new int[n];
            int ptr = 0;
            int cnt = 0;

            for (int j = 0; j + 1 < n; j++) { // 1
                arr1[j] += words[0].charAt(j + 1) - words[0].charAt(j);
            }

            for (int i = 1; i < words.length; i++) {
                int[] arr2 = new int[words[0].length()]; // 2

                for (int j = 0; j + 1 < n; j++) { // 3
                    arr2[j] += words[i].charAt(j + 1) - words[i].charAt(j);
                }

                if (Arrays.equals(arr1, arr2)) cnt++; // 4
                else ptr = i;
            }

            return cnt == 0 ? words[0] : words[ptr]; // 5
        }
    }
}
