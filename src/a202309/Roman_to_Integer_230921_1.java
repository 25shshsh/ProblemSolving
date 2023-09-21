package a202309;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class Roman_to_Integer_230921_1 {
    // https://leetcode.com/problems/roman-to-integer/

    public static void main(String[] args) {
        // K:V 형태니까 맵으로 접근
        Map<String, Integer> map = new HashMap<>();
        int temp = 0;
        int preValue = 0;
        boolean isIXC = false; // 특수한 3가지 경우일 때 알려주기 위함 (I다음 V or X, X 다음 L or C, C 다음 D or M 일 경우)

        map.put("I", 1);
        map.put("V", 5);
        map.put("X", 10);
        map.put("L", 50);
        map.put("C", 100);
        map.put("D", 500);
        map.put("M", 1000);

        String problem = "MCMXCIV"; // 1994

        Stack<Integer> stack = new Stack<>();

        for(int i = 0; i < problem.length(); i++) {

            String s = String.valueOf(problem.charAt(i));

            if(isIXC) { // 3가지 경우일때
                switch (preValue) {
                    case 1:
                        if(map.get(s) == 5 || map.get(s) == 10) {
                            temp += (map.get(s) - 2);
                        } else {
                            temp += map.get(s);
                        }
                        break;
                    case 10:
                        if(map.get(s) == 50 || map.get(s) == 100) {
                            temp += (map.get(s) - 20);
                        } else {
                            temp += map.get(s);
                        }
                        break;
                    case 100:
                        if(map.get(s) == 500 || map.get(s) == 1000) {
                            temp += (map.get(s) - 200);
                        } else {
                            temp += map.get(s);
                        }
                        break;
                }
                isIXC = false;
            } else {
                temp += map.get(s);
            }

            if(s.equals("I") || s.equals("X") || s.equals("C")) { // 3가지 경우 boolean on
                isIXC = true;
                preValue = map.get(s);
            }

        }
        System.out.println(temp); // 1994

    }

    class Solution {
        public int romanToInt(String problem) {

            Map<String, Integer> map = new HashMap<>();
            int temp = 0;
            int preValue = 0;
            boolean isIXC = false;

            map.put("I", 1);
            map.put("V", 5);
            map.put("X", 10);
            map.put("L", 50);
            map.put("C", 100);
            map.put("D", 500);
            map.put("M", 1000);


            for(int i = 0; i < problem.length(); i++) {

                String key = String.valueOf(problem.charAt(i));

                if(isIXC) {
                    switch (preValue) {
                        case 1:
                            if(map.get(key) == 5 || map.get(key) == 10) {
                                temp += (map.get(key) - 2);
                            } else {
                                temp += map.get(key);
                            }
                            break;
                        case 10:
                            if(map.get(key) == 50 || map.get(key) == 100) {
                                temp += (map.get(key) - 20);
                            } else {
                                temp += map.get(key);
                            }
                            break;
                        case 100:
                            if(map.get(key) == 500 || map.get(key) == 1000) {
                                temp += (map.get(key) - 200);
                            } else {
                                temp += map.get(key);
                            }
                            break;
                    }
                    isIXC = false;
                } else {
                    temp += map.get(key);
                }

                if(key.equals("I") || key.equals("X") || key.equals("C")) {
                    isIXC = true;
                    preValue = map.get(key);
                }

            }
            return temp;
        }
    }

}
