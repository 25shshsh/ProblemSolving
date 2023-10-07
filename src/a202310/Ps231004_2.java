package a202310;

public class Ps231004_2 {

    public static void main(String[] args) {

    }

    class Solution {

        public boolean isSymmetric(TreeNode root) {
            TreeNode p  = root.left;
            TreeNode q  = root.right;

            return helper(p,q);
        }
        private boolean helper(TreeNode p, TreeNode q) {

            if(p == null || q == null) {
                return p == q;
            }

            return p.val == q.val && helper(p.right,q.left) && helper(p.left, q.right);
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
