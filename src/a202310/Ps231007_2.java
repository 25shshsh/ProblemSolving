package a202310;

public class Ps231007_2 {

    public static void main(String[] args) {

    }

    class Solution {
        public int minDepth(TreeNode root) {
            if(root == null) {
                return 0;
            }

            int leftDepth = minDepth(root.left) + 1;
            int rightDepth = minDepth(root.right) + 1;

            return leftDepth < 2 || rightDepth < 2 ? Math.max(leftDepth, rightDepth) : Math.min(leftDepth, rightDepth);
        }

        public int helper(TreeNode root) {
            if (root == null) {
                return 0;
            }
            int leftDepth = helper(root.left);
            int rightDepth = helper(root.left);

            return Math.min(leftDepth, rightDepth) + 1;
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
