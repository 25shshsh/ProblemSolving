package a202401;

public class Ps240106_1 {
    public static void main(String[] args) {

    }

    class Solution {
        public int balancedStringSplit(String s) {
            int cnt = 0;
            int answer = 0;

            for(char ch : s.toCharArray()){
                if(ch  == 'R') cnt++; // 1
                else cnt--;

                if(cnt == 0) answer++; // 2
            }

            return answer;
        }
    }


}
