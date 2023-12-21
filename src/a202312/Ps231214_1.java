package a202312;

import java.util.*;

public class Ps231214_1 {

    public static void main(String[] args) {
        String s = "aacaba";
        /*System.out.println('a'-97); // 0
        System.out.println('z'-97); // 25*/

        int[] arr = new int[26];
        int answer = 0;
        int left = 0;
        int right = 0;

        for(char ch : s.toCharArray()) arr[ch-97]++;
        System.out.println(Arrays.toString(arr));

        for(int i : arr) if(i > 0) right++;
        System.out.println(right);

        for(char ch : s.toCharArray()) {
            if(arr[ch-97] > 0) {
                left++;
                arr[ch-97] = -(arr[ch-97]-1);
                System.out.println(arr[ch-97]);
            } else if(arr[ch-97] < 0) {
                arr[ch-97]++;
            }

            if(arr[ch-97] == 0) right--;

            if(left == right) answer++;
            else if(left > right) break;
        }
        System.out.println(Arrays.toString(arr));
        System.out.println(answer);


    }

    class Solution {
        public int numSplits(String s) {
            int[] arr = new int[26];
            int answer = 0;
            int left = 0;
            int right = 0;

            for(char ch : s.toCharArray()) arr[ch-97]++; // 0. 배열을 활용

            for(int i : arr) if(i > 0) right++; // 1. 중복되지 않은 모든 알파벳 수를 right에 저장.

            for(char ch : s.toCharArray()) {
                if(arr[ch-97] > 0) { // 2. left에서 체크하였다는 뜻으로 음수변환
                    left++;
                    arr[ch-97] = -arr[ch-97] + 1;
                } else if(arr[ch-97] < 0) { // 3
                    arr[ch-97]++; // 음수에서 0이 될수록 right에서 현재 원소가 줄어드는 것
                }

                if(arr[ch-97] == 0) right--; // 4

                if(left == right) answer++; // 5
                else if(left > right) break;
            }

            return answer;
        }
    }


    class Solution2 {
        public int numSplits(String s) {
            Map<Character, Integer> map = new HashMap<>();
            Set<Character> set = new HashSet<>();
            int answer = 0;

            for(char c : s.toCharArray()) {
                map.put(c, map.getOrDefault(c, 0) + 1);
            }

            for(char c : s.toCharArray()) {
                if(map.containsKey(c)) { // 전체에서 첫 원소를 빼므로 right 시작
                    if(map.get(c) > 1)  map.put(c, map.get(c)-1);
                    else map.remove(c);
                }
                set.add(c); // 첫 원소를 추가하였으므로, left 시작
                if(set.size() == map.size()) answer++;
            }

            return answer;
        }
    }



}
