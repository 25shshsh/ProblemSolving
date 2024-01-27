package a202401;

import java.util.*;

public class Ps240123_1 {
    public static void main(String[] args) {
        String s = "ABFCACDB";
        StringBuilder stringBuilder = new StringBuilder(s);


        while(true) {
            Stack<Character> stack = new Stack<>();
            boolean flag = false;

            for(char ch : stringBuilder.toString().toCharArray()) {
                if(stack.isEmpty()) {
                    stack.push(ch);
                    continue;
                }

                if((stack.peek() == 'A' && ch == 'B')
                        || (stack.peek() == 'C' && ch == 'D') ) {
                    stack.pop();
                    flag = true;
                    continue;
                }

                stack.push(ch);
            }

            if(!flag) break;

            stringBuilder.setLength(0);

            while(!stack.isEmpty()) {
                stringBuilder.insert(0,stack.pop());
            }
        }







    }

    class Solution {
        public int minLength(String s) {
            StringBuilder stringBuilder = new StringBuilder(s); // 1

            while(true) {
                boolean flag = false; // 2

                for(int i = 1; i < stringBuilder.length(); i++) {

                    if((stringBuilder.charAt(i-1) == 'A' && stringBuilder.charAt(i) == 'B')
                            || (stringBuilder.charAt(i-1) == 'C' && stringBuilder.charAt(i) == 'D')) {

                        stringBuilder.delete(i-1, i+1); // 3
                        i = Math.max(i-2, 1);

                        flag = true; // 4
                    }

                }

                if(!flag) return stringBuilder.length(); // 5
            }

        }
    }


}
