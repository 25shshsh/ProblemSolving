package a202403;

import 속성.BFS;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Ps240317_1 {
    public static void main(String[] args) {

    }

    class Solution {
        public int sum = 0;

        public int sumOfLeftLeaves(TreeNode root) {
            helper(root, false);
            return sum;
        }

        void helper(TreeNode root, boolean isLeftNode) {
            if(root == null) return;

            if(isLeftNode && root.left == null && root.right == null) {
                sum += root.val;
            }

            helper(root.left,true);
            helper(root.right, false);
        }
    }


    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode() {}
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
