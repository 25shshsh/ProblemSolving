package a202401;

import java.util.Arrays;

public class Ps240121_1 {
    public static void main(String[] args) {
        int a = 5;
        int b = 10;
        int c = 12;

        int[] arr = {a,b,c};
        int answer = 0;

        Arrays.sort(arr);

        while(true) {
            arr[0]--;
            arr[2]--;
            answer++;
            if(arr[0] == 0) break;

            if(arr[1] > arr[2]) {
                int temp = arr[2];
                arr[2] = arr[1];
                arr[1] = temp;
            }
        }
        System.out.println(Arrays.toString(arr));

    }

    class Solution {
        public int maximumScore(int a, int b, int c) {
            int min = Math.min(a, Math.min(b, c));
            int max = Math.max(a, Math.max(b, c));
            int mid = (a + b + c) - (min + max);

            if(min + mid <= max) return (min + mid);
            else return min + ((mid + max - min) / 2);
        }
    }
}
