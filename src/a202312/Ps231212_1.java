package a202312;

import java.util.*;

public class Ps231212_1 {
    public static void main(String[] args) {
        String s = "tree";
        Map<Character, Integer> map = new HashMap<>();
        int max = 0;

        for(int i = 0; i < s.length(); i++) {
            map.put(s.charAt(i), map.getOrDefault(s.charAt(i),0) + 1);
        }
        Queue<Map.Entry<Character, Integer>> queue = new PriorityQueue<>((e1, e2) -> e2.getValue() - e1.getValue());
        queue.addAll(map.entrySet());

        List<Map.Entry<Character, Integer>> list = new ArrayList<>(map.entrySet());
        list.sort(Comparator.comparing(Map.Entry::getValue,Comparator.reverseOrder()));
        System.out.println(list.get(0).getValue());


        while (!queue.isEmpty()) {
            System.out.println(queue.peek().getKey() +", "+ queue.poll().getValue());

        }

        /*Iterator<Integer> iterator = map.values().iterator();
        while(map.values().iterator().hasNext()) {
            max = Math.max(max, iterator.next());
        }*/




    }

    class Solution1 { // map >> PriorityQueue (value 내림차순)
        public String frequencySort(String s) {
            Map<Character, Integer> map = new HashMap<>();
            StringBuilder stringBuilder = new StringBuilder();

            for(int i = 0; i < s.length(); i++) {
                map.put(s.charAt(i), map.getOrDefault(s.charAt(i),0) + 1);
            }

            Queue<Map.Entry<Character, Integer>> queue =
                    new PriorityQueue<>((e1, e2) -> e2.getValue() - e1.getValue());
            queue.addAll(map.entrySet());

            while(!queue.isEmpty()) {
                stringBuilder.append(queue.peek().getKey().toString().repeat(queue.peek().getValue()));
                queue.poll();
            }

            return stringBuilder.toString();
        }
    }

    class Solution2 { // map >> list (value 내림차순)
        public String frequencySort(String s) {
            Map<Character, Integer> map = new HashMap<>();
            StringBuilder stringBuilder = new StringBuilder();

            for(int i = 0; i < s.length(); i++) {
                map.put(s.charAt(i), map.getOrDefault(s.charAt(i),0) + 1);
            }

            List<Map.Entry<Character, Integer>> list = new ArrayList<>(map.entrySet());
            list.sort(Comparator.comparing(Map.Entry::getValue,Comparator.reverseOrder()));

            for(int i = 0; i < list.size(); i++) {
                stringBuilder.append(list.get(i).getKey().toString().repeat(list.get(i).getValue()));
            }

            return stringBuilder.toString();
        }
    }


}
