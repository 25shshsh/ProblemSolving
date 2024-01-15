package a202401;

public class Ps240110_1 {
    public static void main(String[] args) {
        System.out.println((int) '?'); //63
        System.out.println('5' - '0'); // 5
        System.out.println((int) ':'); // 58
    }

    // char array 변환 후 수정 >> array를 String을 수정
    class Solution {
        public String maximumTime(String time) {
            char[] arr =time.toCharArray();

            if(arr[0] == '?' && arr[1] == '?') {
                arr[0] = '2'; arr[1] = '3';
            }

            if(arr[0] == '?') {
                if(arr[1] >= '4') arr[0] = '1';
                else arr[0] = '2';
            }

            if(arr[1] == '?') {
                if(arr[0] == '2') arr[1] = '3';
                else arr[1] = '9';
            }

            if(arr[3] == '?') arr[3] = '5';
            if(arr[4] == '?') arr[4] = '9';

            return new String(arr);
        }
    }


}

