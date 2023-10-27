package a202310;

public class Ps231015_1 {

    public static void main(String[] args) {
        int n = 1;

        while(true) {
            if(n == 1) {
                break;
            }
        }

    }


    class Solution {
        public int countNodes(TreeNode root) {
            return helper(root);
        }

        private int helper(TreeNode root) {

            if(root == null) {
                return 0;
            }

            int leftNode = helper(root.left);
            int rightNode = helper(root.right);


            return 1 + leftNode +rightNode;
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
