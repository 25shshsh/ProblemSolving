package a202310;

public class Ps231019_1 {

    public static void main(String[] args) {

    }

    class Solution {

        private int maxDepth = 0;

        public int diameterOfBinaryTree(TreeNode root) {
            helper(root);
            return maxDepth;
        }

        private int helper(TreeNode root) {

            if(root == null) {
                return 0;
            }

            int left = helper(root.left);
            int right = helper(root.right);

            maxDepth = Math.max(maxDepth, left + right); //2 (왼쪽 리프노드 ~ 현재위치 ~ 오른쪽 리프노드)의 길이

            return Math.max(left, right) + 1; //1 (현재위치 ~ 리프노드) 의 최대 길이
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
