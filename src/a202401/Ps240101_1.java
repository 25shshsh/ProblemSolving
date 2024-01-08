package a202401;

import java.util.*;

public class Ps240101_1 {
    public static void main(String[] args) {
        System.out.println((int)'A'); // 65
        System.out.println((int)'E'); // 69
        System.out.println((int)'I'); // 73
        System.out.println((int)'O'); // 79
        System.out.println((int)'U'); // 85
        System.out.println((int)'a'); // 97
        System.out.println((int)'e'); // 101
        System.out.println((int)'i'); // 105
        System.out.println((int)'o'); // 111
        System.out.println((int)'u'); // 117

        char[] arr = {'A','e','I','u'};
        Arrays.sort(arr);
        System.out.println(arr);

        List<Character> list = new ArrayList<>();
        list.add('A');
        list.add('e');
        list.add('I');
        list.add('u');

        Collections.sort(list);
        System.out.println(list);

    }

    class Solution {
        public String sortVowels(String s) {
            StringBuilder vowels = new StringBuilder();
            StringBuilder consonants = new StringBuilder();
            StringBuilder answer = new StringBuilder();

            for(char ch :  s.toCharArray()) { // 2-1.
                if(isVowels(ch)) vowels.append(ch);
                else consonants.append(ch);
            }

            char[] arrVowels = vowels.toString().toCharArray(); // 2-2.
            Arrays.sort(arrVowels);

            int ptr1 = 0;
            int ptr2 = 0;

            for(char ch : s.toCharArray()) { // 2-3.
                if(isVowels(ch)) answer.append(arrVowels[ptr1++]);
                else answer.append(consonants.charAt(ptr2++));
            }

            return answer.toString();
        }


        private boolean isVowels(char ch) { // 1.
            return "AEIOUaeiou".indexOf(ch) != -1;
        }
    }
}
