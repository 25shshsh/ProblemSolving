package a202310;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Ps231024_1 {

    public static void main(String[] args) {

    }

    class Solution {
        public boolean isPowerOfFour(int n) { // 4^0~15 , 16개
            Map<Integer,Integer> map = new HashMap<>();
            int num = 1;

            map.put(1, 0); // {값 : 지수}
            for (int i = 1; i <= 15; i++) {
                map.put((int) Math.pow(4,i), i);
                if(map.containsKey(n)) return true;
            }

            return false;

        }
    }

}
