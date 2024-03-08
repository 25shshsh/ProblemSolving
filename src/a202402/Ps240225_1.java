package a202402;

import java.util.*;

public class Ps240225_1 {
    public static void main(String[] args) {

    }
    // https://gamedevlog.tistory.com/15 그래프 개념
    // 방을 열 수 없다 = 방문할 수 없다. 비연결 방향그래프를 찾자.
    // https://leetcode.com/problems/keys-and-rooms/

    class Solution {
        boolean[] visitedVertice;

        public boolean canVisitAllRooms(List<List<Integer>> rooms) {
            int n = rooms.size();
            visitedVertice = new boolean[n]; // 1

            dfs(rooms, 0); // 2

            for (boolean visitedVertex : visitedVertice) { // 3
                if (!visitedVertex) return false;
            }

            return true;
        }

        void dfs(List<List<Integer>> rooms, int room) {
            visitedVertice[room] = true;

            for (int key : rooms.get(room)) {
                if (!visitedVertice[key]) {
                    dfs(rooms, key);
                }
            }
        }
    }

    class Solution2 {
        boolean[] visitedVertice;

        public boolean canVisitAllRooms(List<List<Integer>> rooms) {
            int n = rooms.size();
            visitedVertice = new boolean[n];

            visitedVertice[0] = true;
            for(int i = 0; i < n; i++) { // i번째 노드의 진출차수가 방문하지않은 노드를 방문한다.
                for(int key : rooms.get(i)) {
                    if(visitedVertice[i] && !visitedVertice[key]) visitedVertice[key] = true;
                }
            }

            for(boolean visitedVertex : visitedVertice) {
                if(!visitedVertex) return false;
            }

            return true;
        }
    }




}
