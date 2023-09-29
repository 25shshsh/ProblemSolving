package a202309;

import java.util.stream.IntStream;

public class PrintArr {

    static void printArr(int[] arr) {
        IntStream.rangeClosed(1, arr.length).forEach(i -> {
            System.out.print(arr[i - 1] + " ");
        });
        System.out.println();
    }


}
