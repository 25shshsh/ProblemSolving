package a202402;

import java.util.*;

public class Ps240224_1 {
    //https://leetcode.com/problems/minimum-number-of-vertices-to-reach-all-nodes/
    class Solution {
        public List<Integer> findSmallestSetOfVertices(int n, List<List<Integer>> edges) {
            List<Integer> answer = new ArrayList<>();
            int[] arr = new int[n]; // 정점의 크기만큼 배열 생성

            for(List<Integer> edge: edges) { // 도착지점이 있는 정점만 카운팅하여 배열에 저장
                arr[edge.get(1)]++;
            }

            for(int i = 0; i < n; i++) { // 카운팅 되지 않은 배열의 idx(정점)는 우리가 찾는 노드이다.
                if(arr[i] == 0) answer.add(i); // 우리가 찾는 노드를 list에 담고
            }

            return answer; // 리턴
        }
    }
}
