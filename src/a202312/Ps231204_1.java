package a202312;

public class Ps231204_1 {
    // 문자 97 ~ 122, 숫자48 ~57
    public static void main(String[] args) {
        String str = "abcd";
        StringBuilder s = new StringBuilder(str);

        s.insert(1,'1');
        s.insert(3,'2');
        s.insert(5,'3');
        //s.insert(7,'4');

        System.out.println(s.toString());


    }

    class Solution {
        public String reformat(String s) {
            StringBuilder letters = new StringBuilder();
            StringBuilder digits = new StringBuilder();

            if (s.length() == 1) return s; // 1. 예외

            // 2. 영소문자와 숫자를 각각 letters, digits에 담는다.
            for (int i = 0; i < s.length(); i++) {
                if ((int) s.charAt(i) >= 97) letters.append(s.charAt(i));
                else digits.append(s.charAt(i));
            }

            int cnt = letters.length() - digits.length(); // 3. 영소문자의 개수 - 숫자의 개수

            if (Math.abs(cnt) > 1) return ""; // 4. 차이가 2이상이면 Alphanumeric 불가

            if(cnt == 1 || cnt == 0) { // 5 접근방법 참고
                for(int i = 0; i < digits.length(); i++) {
                    letters.insert((i*2)+1, digits.charAt(i));
                }

                if(cnt == 1) {
                    letters.append(letters.charAt(1));
                    letters.append(letters.charAt(0));
                } else {
                    letters.append(letters.charAt(0));
                    letters.append(letters.charAt(1));
                }
                letters.replace(0,2,"");
            } else { // 6 cnt == -1일때, (접근방법 참고)
                for(int i = 0; i < digits.length(); i++) {
                    letters.insert(i*2, digits.charAt(i));
                }
                letters.append(letters.charAt(1));
                letters.append(letters.charAt(0));
                letters.replace(0,2,"");
            }

            return letters.toString();

        }
    }
}