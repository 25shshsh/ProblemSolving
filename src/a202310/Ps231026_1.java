package a202310;

import java.util.*;

public class Ps231026_1 {

    public static void main(String[] args) {


    }

    class Solution {

        private int sum = 0;

        public TreeNode bstToGst(TreeNode root) {
            if (root == null) { // 0 Base case
                return null;
            }
            bstToGst(root.right); // 1

            sum += root.val; // 2
            root.val = sum;

            bstToGst(root.left); // 3

            return root;
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
