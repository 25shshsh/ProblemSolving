package a202309;


import java.util.Arrays;
import java.util.Comparator;

public class Ps230924_1 {

    public static void main(String[] args) {
        String[] str = {"flower", "flow", "flight"};
        Arrays.sort(str);

        StringBuilder answer = new StringBuilder(); // append, delete, insert 등

        String firstStr = str[0];
        String lastStr = str[str.length - 1];

        for (int i = 0; i < Math.max(firstStr.length(), lastStr.length()); i++) {
            if (firstStr.charAt(i) != lastStr.charAt(i)) {
                System.out.println(answer);
                break;
            }
            answer.append(firstStr.charAt(i));
        }
        System.out.println(answer);
    }

    class Solution {
        // https://leetcode.com/problems/longest-common-prefix/

        public String longestCommonPrefix(String[] str) {
            Arrays.sort(str);

            StringBuilder answer = new StringBuilder(); // append, delete, insert 등

            String firstStr = str[0];
            String lastStr = str[str.length - 1];

            for (int i = 0; i < Math.min(firstStr.length(), lastStr.length()); i++) {
                if (firstStr.charAt(i) != lastStr.charAt(i)) {
                    return answer.toString();
                }
                answer.append(firstStr.charAt(i));
            }
            return answer.toString();
        }

    }

}



