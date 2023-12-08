package a202312;

public class Ps231206_1 {

    public static void main(String[] args) {

        // subNum의 앞자리가 0이 아니여야하고, << "04"이 아닌 4인 경우 유효하다.
        // num % subNum == 0 이여야 한다.
        // cnt는 num의 길이 - k +1이다.

        int num = 430043;
        int k = 2;

        int answer = 0;
        int copyNum = num;
        int temp = (int)Math.pow(10, k);
        int cnt = (int)Math.log10(num) + 2 - k;

        while(cnt > 0) {
            int subNum = copyNum % temp;

            if(subNum != 0) {
                System.out.println(num+"%"+subNum);
            }

            copyNum /= 10;
            cnt--;
        }


    }

    class Solution {
        public int divisorSubstrings(int num, int k) {
            int answer = 0;
            int copyNum = num;
            int temp = (int)Math.pow(10, k);
            int cnt = (int)Math.log10(num) + 2 - k; // 1. 접근방법1 종료조건

            while(cnt > 0) {
                int subNum = copyNum % temp; // 2. subNum들을 구하기위해 copyNum이 희생된다.
                if(subNum != 0) answer += num%subNum == 0? 1 : 0; // 3. k-beauty 개수 세기
                copyNum /= 10;
                cnt--;
            }

            return answer;
        }
    }
}
