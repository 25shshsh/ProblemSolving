package a202310;

public class Ps231011_1 {

    public static void main(String[] args) {

    }

    // points = [[0,0],[0,1],[1,0],[0,2],[2,0]]

    class Solution {
        public double largestTriangleArea(int[][] points) {
            double x1 = points[0][0];
            double x2 = points[0][0];
            double y1 = points[0][1];
            double y2 = points[0][1];

            for(int i = 0; i < points.length; i++) {
                x1 = Math.max(x1, points[i][0]);
                x2 = Math.min(x2, points[i][0]);
                y1 = Math.max(y1, points[i][1]);
                y2 = Math.min(y2, points[i][1]);


            }
            return ( Math.abs(x1+x2) * Math.abs(y1+y2) ) / 2;
        }
    }

}
