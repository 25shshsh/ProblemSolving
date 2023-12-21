package a202312;

import java.util.*;


public class ps231217_1 {
    // n = 4, ["1/2","1/3","1/4","2/3","3/4"]
    public static void main(String[] args) {
        Map<Float, String> map = new HashMap<>(); //{"1/2": 0.5}
        int n = 4;


        for(int i = 2; i <= n; i++) {
            for(int j = 1; j < i; j++) {
                System.out.print(j+"/"+i+", ");
                map.put((float) j/i, map.getOrDefault((float) j/i, j+"/"+i) );
            }
        }

        for(Map.Entry<Float, String> entry : map.entrySet()) {
            String str = entry.getValue();
            System.out.println(str);
        }


    }

    class Solution {
        public List<String> simplifiedFractions(int n) {
            List<String> answer = new ArrayList<>();

            for(int i = 2; i <= n; i++) {
                for(int j = 1; j < i; j++) {
                    //System.out.println(j+"/"+i); // 1. 후보군
                    if(gcd(i, j) == 1) answer.add(j+"/"+i); // 2
                }
            }
            return answer;
        }

        private int gcd (int a, int b) { // 2 최대공약수를 구하는 메서드
            while(b != 0) {
                int temp = b;
                b = a%b;
                a = temp;
            }
            return a;
        }
    }



}
