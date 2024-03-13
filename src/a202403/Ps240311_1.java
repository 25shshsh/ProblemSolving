package a202403;

import java.util.HashMap;
import java.util.Map;

public class Ps240311_1 {
    public static void main(String[] args) {

    }

    class Solution {
        public String customSortString(String order, String s) {
            StringBuilder answer = new StringBuilder();
            Map<Character, Integer> map = new HashMap<>();

            for(char ch : s.toCharArray()) { // 1
                map.put(ch, map.getOrDefault(ch, 0) + 1);
            }

            for(char ch : order.toCharArray()) { // 2
                if(map.containsKey(ch)) {
                    answer.append(String.valueOf(ch).repeat(Math.max(0, map.get(ch))));
                    map.remove(ch);
                }
            }

            for(char ch : map.keySet()) { // 3
                answer.append(String.valueOf(ch).repeat(Math.max(0, map.get(ch))));
            }

            return answer.toString();
        }
    }
}
