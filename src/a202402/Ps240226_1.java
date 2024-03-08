package a202402;

import java.util.Arrays;

public class Ps240226_1 {
    public static void main(String[] args) {
        int[][] isConnected = {{1,1,0},{1,1,0},{0,0,1}};
        //int[][] isConnected = {{1,0,0},{0,1,0},{0,0,1}};
        int n = isConnected.length;
        int[] arr = new int[3]; // arr[i]의 시작정점, 도착정점 모두 카운트

        for(int i = 0; i < n; i++) {
            for(int j = 0; j < n; j++) {
                if(isConnected[i][j] == 1) arr[j]++;
            }
        }

        System.out.println(Arrays.toString(arr));

    }

    class Solution {
        public int findCircleNum(int[][] isConnected) {
            int answer = 0;
            int n = isConnected.length;
            boolean[] visitedVertice = new boolean[n];

            for(int i = 0; i < n; i++){
                if(!visitedVertice[i]){ // 1
                    answer++;
                    dfs(i, visitedVertice, isConnected); // 2
                }
            }
            return answer;
        }

        private void dfs(int currNode, boolean[] visitedVertice, int[][] isConnected){
            visitedVertice[currNode] = true;

            for(int i = 0; i < isConnected.length; i++){
                if(!visitedVertice[i] && isConnected[currNode][i] == 1) {
                    dfs(i,visitedVertice,isConnected);
                }
            }
        }

    }


}
