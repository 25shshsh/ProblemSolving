package a202311;

public class Ps231109_1 {
    public static void main(String[] args) {

    }

    // https://leetcode.com/problems/flood-fill/
    class Solution {

        public int[][] floodFill(int[][] image, int sr, int sc, int color) {
            int value = image[sr][sc];

            if(color == value) return image; // 이거 없으면 루프에서 못 나온다. (특정 색을 같은 색으로 칠하려면 불가능하기때문)

            helper(image, sr, sc, color, image.length-1, image[0].length-1, value);
            return image;
        }

        private void helper(int[][] image, int sr, int sc, int color, int m, int n, int value) {

            if(sr < 0 || sr > m || sc < 0 || sc > n || image[sr][sc] != value) {
                return;
            }

            image[sr][sc] = color;

            helper(image, sr-1, sc, color, m, n, value);
            helper(image, sr+1, sc, color, m, n, value);
            helper(image, sr, sc-1, color, m, n, value);
            helper(image, sr, sc+1, color, m, n, value);
        }

    }
}
