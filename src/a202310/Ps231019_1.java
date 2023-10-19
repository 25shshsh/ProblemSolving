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

            maxDepth = Math.max(maxDepth, left + right);

            return Math.max(left, right) + 1;
            // [1,2,null,null,3]에서 현재 root가 2라면, 2의 오른쪽자식노드 3과 2, 2개를 리턴.
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
