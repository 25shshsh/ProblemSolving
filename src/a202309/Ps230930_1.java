package a202309;

import java.util.stream.IntStream;

public class Ps230930_1 {

    public static void main(String[] args) {
        String s = "   fly me   to   the moon  "; // expected = 4
        int ptr1 = -1;
        int ptr2 = -1;
        String temp = "";

        for(int i = s.length()-1; i >= 0; i--) {
            if(ptr2 == -1 && !String.valueOf(s.charAt(i)).equals(" ")) {
                ptr2 = i+1;
            }

            if(ptr2 != -1 && String.valueOf(s.charAt(i)).equals(" ")) {
                ptr1 = i+1;
                s = s.substring(ptr1, ptr2);
                break;
            }
        }
        System.out.println(s);

    }

    class Solution {
        public int lengthOfLastWord(String s) {
            s = " " + s;
            int ptr1 = -1;
            int ptr2 = -1;

            for(int i = s.length()-1; i >= 0; i--) {
                if(ptr2 == -1 && !String.valueOf(s.charAt(i)).equals(" ")) {
                    ptr2 = i+1;
                }

                if(ptr2 != -1 && String.valueOf(s.charAt(i)).equals(" ")) {
                    ptr1 = i+1;
                    s = s.substring(ptr1, ptr2);
                    break;
                }
            }
            return s.length();
        }
    }

/*    class Solution {
        public int lengthOfLastWord(String s) {
            String temp = s.trim().replaceAll("\s+", " ");
            String[] arr = temp.split(" ");

            return arr[arr.length-1].length();
        }
    }*/

    static void printArr(String[] arr) {
        IntStream.rangeClosed(1, arr.length).forEach(i -> {
            System.out.print(arr[i - 1] + "/");
        });
        System.out.println();
    }

}
