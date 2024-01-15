package a202401;

public class Ps240109_1 {
    public static void main(String[] args) {
        String s = "132335";
        char ch = '3';
        System.out.println(s.indexOf(ch + ""));


    }

    class Solution {
        public String removeDigit(String number, char digit) {
            StringBuilder answer = new StringBuilder(number);
            int index = 0;
            int n = answer.length();;

            for(int i = 0; i < n; i++){
                if(number.charAt(i) == digit){
                    index = i;

                    if(i < n-1 && digit < number.charAt(i+1)) break;
                }
            }

            return answer.deleteCharAt(index).toString();
        }
    }

}

