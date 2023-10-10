package a202310;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.IntStream;

public class Ps231010_1 {

    public static void main(String[] args) {

    }


    class Solution {
        public int[] arrayRankTransform(int[] arr) {
            // 1
            Map<Integer, Integer> map = new HashMap<>();
            int n = arr.length;
            int[] temp = new int[n];

            // 2
            if(n == 0) return arr;

            // 3
            for (int i = 0; i < n; i++) {
                temp[i] = arr[i];
            }

            Arrays.sort(arr); // 4

            // 5
            map.put(arr[0], 1);
            for (int i = 1, j = 1; i < n; i++) { // {값, 우선순위}

                if (arr[i - 1] == arr[i]) {
                    map.put(arr[i], j);
                } else {
                    map.put(arr[i], j + 1);
                    j++;
                }
            }

            // 6
            for (int i = 0; i < n; i++) {
                temp[i] = map.get(temp[i]);
            }

            return temp; // 7
        }
    }

    static void printArr(int[] arr) {
        IntStream.rangeClosed(1, arr.length).forEach(i -> {
            System.out.print(arr[i - 1] + " ");
        });
        System.out.println();
    }





}
