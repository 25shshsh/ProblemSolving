package a202310;

import java.util.Arrays;
import java.util.Comparator;

public class Ps231018_1 {

    public static void main(String[] args) {

        int [][] arr = {{1,3},{2,2},{3,1}};

        Arrays.sort(arr, (o1, o2) -> o2[1] - o1[1]);
        System.out.println(arr[0][0]);
        System.out.println(arr[1][0]);
        System.out.println(arr[2][0]);
    }

    class Solution {
        public int maximumUnits(int[][] boxTypes, int truckSize) {
            Arrays.sort(boxTypes, (o1, o2) -> o2[1] - o1[1]);
            int ans = 0;

            for(int i = 0; i < boxTypes.length; i++) {
                truckSize -= boxTypes[i][0];
                ans += boxTypes[i][0] * boxTypes[i][1];

                if(truckSize < 0) {
                    ans -= (-truckSize) * boxTypes[i][1];
                    return ans;
                }
            }

            return ans;
        }
    }


}
