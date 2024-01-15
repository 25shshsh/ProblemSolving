package a202401;

public class Ps240112_1 {
    public static void main(String[] args) {

    }

    class Solution {
        public boolean canPlaceFlowers(int[] flowerbed, int n) {
            int cnt = 0;
            int ptr = 1;
            int length = flowerbed.length;

            if(length == 1) { // 화단의 길이가 1일때.
                if(flowerbed[0] == 0) cnt++;
                return cnt >= n;
            }
            else if(length == 2) { // 화단의 길이가 2일때.
                if(flowerbed[0] == 0 && flowerbed[1] == 0) cnt++;
                return cnt >= n;
            }
            else if(length >= 3) { // 화단의 길이가 3이상일때
                if(flowerbed[0] == 0 && flowerbed[1] == 0) { // 2-1
                    flowerbed[0]++;
                    cnt++;
                }

                while(ptr+1 < length) { // 2-2
                    if(flowerbed[ptr-1] == 0 && flowerbed[ptr] == 0 && flowerbed[ptr+1] == 0) {
                        flowerbed[ptr]++;
                        cnt++;
                    }
                    ptr++;
                }

                if(flowerbed[length-2] == 0 && flowerbed[length-1] == 0) { // 2-3
                    flowerbed[length-1]++;
                    cnt++;
                }
            }

            return cnt >= n;
        }
    }


}
