package a202312;

public class Ps231213_1 {
    public static void main(String[] args) {

    }


    class Solution {
        public int minFlips(String target) {
            int cnt = 0;
            char currentChar = '0';

            for(char targetChar : target.toCharArray()) {
                if(currentChar != targetChar) {
                    currentChar = currentChar == '1'? '0' : '1';
                    cnt++;
                }
            }
            return cnt;
        }


        private void flipOperation (StringBuilder stringBuilder, int startIdx) {

            for(int i = startIdx; i < stringBuilder.length(); i++) {
                if(stringBuilder.charAt(i) == '0') stringBuilder.replace(i, i+1, "1");
                else stringBuilder.replace(i, i+1, "0");
            }
            //cnt++; // flip operation count.
        }

    }
}
