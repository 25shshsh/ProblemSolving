package a202310;

import java.util.stream.IntStream;

public class Ps231001_1 {

    public static void main(String[] args) {
        String a = "111", b = "111"; // output : 10101
        StringBuilder c = new StringBuilder();
        int carry = 0; // 덧셈의 자리올림(carry)

        int i = a.length() - 1; // i j는 일의자리
        int j = b.length() - 1;

        while(i >= 0 || j >= 0){
            int sum = carry; // 다음 자릿수에서 시작될때 받아올린 수는 누적되면서 사용된다.
            if(i >= 0) sum += a.charAt(i--) - '0'; // (int) 49 - 48 or (int) 48 - 48
            if(j >= 0) sum += b.charAt(j--) - '0'; // 아스키코드를 이용하여 정수변환없이 사용한다.
            carry = sum > 1 ? 1 : 0;
            c.append(sum % 2);
        }
        if(carry != 0) c.append(carry); // 모든 연산이 끝난 후 자리올림(carry)이 남아있다면 마지막으로 자릿수를 올려준다.

        // append 말고 맨 앞에 채울 수 있었다면 reverse()가 없어도 될텐데
        System.out.println(c.reverse().toString());





    }

    class Solution {
        public String addBinary(String a, String b) {
            StringBuilder c = new StringBuilder();
            int carry = 0; // 덧셈의 자리올림(carry)

            int i = a.length() - 1; // i j는 일의자리
            int j = b.length() - 1;

            while(i >= 0 || j >= 0){
                int sum = carry; // 다음 자릿수에서 시작될때 받아올린 수는 누적되면서 사용된다.
                if(i >= 0) sum += a.charAt(i--) - '0'; // (int) 49 - 48 or (int) 48 - 48
                if(j >= 0) sum += b.charAt(j--) - '0'; // 아스키코드를 이용하여 정수변환없이 사용한다.
                carry = sum > 1 ? 1 : 0;
                c.append(sum % 2);
            }
            if(carry != 0) c.append(carry); // 모든 연산이 끝난 후 자리올림(carry)이 남아있다면 마지막으로 자릿수를 올려준다.

            // append 말고 맨 앞에 채울 수 있었다면 reverse()가 없어도 될텐데
            return c.reverse().toString();

        }
    }


    static void printArr(int[] arr) {
        IntStream.rangeClosed(1, arr.length).forEach(i -> {
            System.out.print(arr[i - 1] + " ");
        });
        System.out.println();
    }
}
