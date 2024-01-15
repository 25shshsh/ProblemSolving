package a202401;

public class Ps240113_1 {
    public static void main(String[] args) {
        System.out.println((char)(1+48)); //49
        int i = 0;
        StringBuilder answer = new StringBuilder("123");

        answer.insert(3,"5");
        System.out.println(answer.toString());

    }

    class Solution {
        public String smallestNumber(String pattern) {
            StringBuilder answer = new StringBuilder("1");
            int ptr = 0;
            int digit = 2; // 'I'나 'D'에 따라 추가되는 문자열 (순차적으로 추가)
            boolean flag;

            for(int i = 0; i < pattern.length(); i++) {
                if(pattern.charAt(i) == 'D') flag =true; // 1
                else flag = false;

                // 2
                if(flag) answer.insert(ptr, digit); // 3
                else {
                    answer.append(digit); // 4
                    ptr = i+1;
                }
                digit++;
            }

            return answer.toString();
        }
    }

}
