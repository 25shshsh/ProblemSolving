package a202309;

import java.util.Stack;

public class Ps230925_1 {
    // https://leetcode.com/problems/valid-parentheses/
    public static void main(String[] args) {

        // 괄호가 닫혀야할 때, 그동안 쌓였던 괄호와 같은 쌍으로 합쳐져야한다.
        // ex) [{( 후 닫혀야 할때 )}] 순으로 합쳐야한다.
        // 역순으로 쌍을 맞추려면 스택을 사용하면 될 듯
        // 소 중 대괄호를 아스키코드로 변환하면 40 41 123 125 91 93
        String str = "({}){}";
        Stack<Character> stack = new Stack<>();
        char temp;

        for (int i = 0; i < str.length(); i++) {

            if (stack.isEmpty()) {
                stack.push(str.charAt(i));
                continue;
            }

            temp = str.charAt(i);

            if ((int) stack.peek() + 1 == (int) temp || (int) stack.peek() + 2 == temp) {
                stack.pop();
            } else if ((int) temp == 40 || (int) temp == 123 || (int) temp == 91) {
                stack.push(temp);
            } else {
                // false
            }

        }
        // stack.isEmpty() 라면 true 아니면 false;

    }


    class Solution {
        public boolean isValid(String str) {
            char temp;
            Stack<Character> stack = new Stack<>(); // 쌓아온 왼쪽 괄호를 최신순으로 오른쪽 괄호와 함께 제거하기 위해

            for (int i = 0; i < str.length(); i++) {

                if (stack.isEmpty()) { // 스택이 비어있는 경우 채움
                    stack.push(str.charAt(i));
                    continue;
                }

                temp = str.charAt(i);

                // 이 문제에서는 괄호3쌍만 등장하기 때문에 아스키코드를 편하게 사용함.
                if ((int) stack.peek() + 1 == (int) temp || (int) stack.peek() + 2 == temp) {
                    stack.pop();
                } else if ((int) temp == 40 || (int) temp == 123 || (int) temp == 91) {
                    stack.push(temp);
                } else {
                    return false;
                }

            }
            
            // 스택에 요소가 하나라도 남아있다면, (괄호를 쌍으로 제거하지 못했음 or 괄호입력이 홀수로 들어왔음) 이기떄문에
            // stack.isEmpty()를 리턴
            return stack.isEmpty();

        }
    }


}
