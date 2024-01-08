package a202312;

public class Ps231226_1 {
    public static void main(String[] args) {

    }

    class Solution1 {
        public String firstPalindrome(String[] words) {

            for(String word : words) {
                int ptr1 = 0;
                int ptr2 = word.length()-1;

                while(true) {
                    if(word.charAt(ptr1) == word.charAt(ptr2)) {
                        if(ptr1+1 >= ptr2) return word;
                        ptr1++; ptr2--;
                    } else break;
                }
            }

            return new String();
        }
    }

    class Solution2 {
        public String firstPalindrome(String[] words) {

            for(String word : words) {
                StringBuilder stringBuilder = new StringBuilder(word);
                if(stringBuilder.toString().equals(stringBuilder.reverse().toString())) return word;
            }

            return new String();
        }
    }
}
