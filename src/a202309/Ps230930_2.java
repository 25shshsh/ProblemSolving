package a202309;

import java.util.HashMap;
import java.util.stream.IntStream;

public class Ps230930_2 {

    public static void main(String[] args) {
        int[] digits = {9, 9, 9};
        int n = 0;

        HashMap<Integer, Integer> map = new HashMap<>();


        for (int i = digits.length - 1; 0 <= i; i--) {

            if (i == 0) { // 마지막 자릿수에 +1
                map.put(i, digits[n++] + 1);
                break;
            }

            map.put(i, digits[n++]); // K : V = 자릿수(차수) : 값
        }


        System.out.println(map.entrySet());


        for (int i = 0; i < digits.length; i++) {

            if (map.get(i) == 10) { // (i+1)번째 수를 자리 올림을 해야한다면? (끝자리에 +1덧셈이라 올림해야할 때 값은 10 뿐이다.

                try{
                    map.put(i, map.get(i) % 10);
                    map.put(i + 1, map.get(i + 1) + 1);
                } catch (NullPointerException e) { // 999에서 1000일 경우 기존의 V가 존재하지 않기 때문에 자릿수를 새로 만든다.
                    map.put(i + 1, 1);
                }
            }
        }
        System.out.println(map.entrySet());

        digits = new int[map.size()];
        n = 0;
        System.out.println(digits.length);

        for (int i = digits.length-1; 0 <= i; i--) {
            digits[n++] = map.get(i);
        }




    }


        class Solution {
            public int[] plusOne(int[] digits) {
                // 1
                int n = 0;
                HashMap<Integer, Integer> map = new HashMap<>();

                for (int i = digits.length - 1; 0 <= i; i--) {
                    if (i == 0) {
                        map.put(i, digits[n++] + 1);
                        break;
                    }
                    map.put(i, digits[n++]);
                }

                // 2
                for (int i = 0; i < digits.length; i++) {

                    if (map.get(i) == 10) {

                        try{
                            map.put(i, map.get(i) % 10);
                            map.put(i + 1, map.get(i + 1) + 1);
                        } catch (NullPointerException e) {
                            map.put(i + 1, 1);
                        }
                    }
                }

                // 3
                digits = new int[map.size()];
                n = 0;

                for (int i = digits.length-1; 0 <= i; i--) {
                    digits[n++] = map.get(i);
                }

                return digits;
            }

        }

/*
    class Solution {
        public int[] plusOne(int[] digits) {

            int j = 0;
            double temp = 1;
            int length = digits.length;

            for (int i = length - 1; i >= 0; i--) {
                double result = Math.pow(10, i);
                temp += (digits[j++] * result);
            }

            String str = String.valueOf(temp);
            digits = temp / Math.pow(10, length - 1) >= 10 ? new int[length + 1] : new int[length];

            for(int i = 0; i < digits.length; i++) {
                int k = str.charAt(i) - 48;
                digits[i] = k;
            }

            return digits;
        }

    }
*/


    static void printArr(int[] arr) {
        IntStream.rangeClosed(1, arr.length).forEach(i -> {
            System.out.print(arr[i - 1] + " ");
        });
        System.out.println();
    }


}
