package a202310;

import java.sql.Array;
import java.util.*;

public class Ps231028_1 {

    public static void main(String[] args) {

    }



    /**
     * Definition for a binary tree node.
     * public class TreeNode {
     *     int val;
     *     TreeNode left;
     *     TreeNode right;
     *     TreeNode() {}
     *     TreeNode(int val) { this.val = val; }
     *     TreeNode(int val, TreeNode left, TreeNode right) {
     *         this.val = val;
     *         this.left = left;
     *         this.right = right;
     *     }
     * }
     */
    class Solution {

        Map<Integer, List<TreeNode>> map = new HashMap<>(); // static

        public List<TreeNode> allPossibleFBT(int n) {
            if(n % 2 == 0) return new ArrayList<>(); // basecase

            if(!map.containsKey(n)) { // recursion 현재 n이 저장되어있다면 return map.get(n)
                List<TreeNode> list = new ArrayList<>();

                if(n == 1) list.add(new TreeNode(0)); // memoization
                else {
                    for(int i = 2; i <= n; i+=2) { // (1, 5), (3, 3), (5, 1)
                        List<TreeNode> left = allPossibleFBT(i-1); // recursion ↓
                        List<TreeNode> right = allPossibleFBT(n-i); // recursion ↓

                        // 우선순위는 right 탐색 후 left 순으로 순회
                        for(TreeNode lf: left) {
                            for(TreeNode rgt : right) {
                                list.add(new TreeNode(0,lf, rgt));
                            }
                        }
                    }
                }
                // 저장되어있지 않다면 map에 저장. (memoization)
                map.put(n, list);
            }

            // map.containsKey(n)
            return map.get(n);
        }
    }


    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode() {
        }

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }
}
