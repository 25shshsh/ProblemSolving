package a202312;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class ps231218_1 {
    public static void main(String[] args) {
        Stack<Character> stack = new Stack<>();
        String s = "a-bC-dEf-ghIj";
        StringBuilder stringBuilder = new StringBuilder();


        for(char ch : s.toCharArray()) {
            if((ch >= 65 && ch <= 90) || (ch >= 97 && ch <= 122)) stringBuilder.insert(0,ch);
        }
        System.out.println(stringBuilder.toString());

        for(int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if(!(ch >= 65 && ch <= 90) && !(ch >= 97 && ch <= 122)) stringBuilder.insert(i,ch);
        }

        System.out.println(stringBuilder.toString());
    }

    class Solution {
        public String reverseOnlyLetters(String s) {
            char [] arr = s.toCharArray();
            int ptr1 = 0;
            int ptr2 = s.length()-1;

            while(ptr1 < ptr2) {

                if(Character.isLetter(arr[ptr1]) && Character.isLetter(arr[ptr2])) {
                    char temp = arr[ptr1];
                    arr[ptr1++] = arr[ptr2];
                    arr[ptr2--] = temp;
                }

                if(!Character.isLetter(arr[ptr1])) ptr1++;
                if(!Character.isLetter(arr[ptr2])) ptr2--;

            }

            return new String(arr);
        }
    }

    class Solution2 {
        public String reverseOnlyLetters(String s) {
            StringBuilder stringBuilder = new StringBuilder();
            int n = s.length();

            for(int i = n-1; i >= 0; i--) { // 1
                char ch = s.charAt(i);
                if(Character.isLetter(ch)) stringBuilder.append(ch);
            }


            for(int i = 0; i < n; i++) { // 2
                char ch = s.charAt(i);
                if(!Character.isLetter(ch)) stringBuilder.insert(i,ch);
            }

            return stringBuilder.toString();
        }
    }
}
