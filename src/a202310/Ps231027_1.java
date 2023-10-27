package a202310;

public class Ps231027_1 {

    public static void main(String[] args) {

    }



    class Solution {

        public TreeNode reverseOddLevels(TreeNode root) {
            bothTree(root.left, root.right, 1);
            return root;
        }

        private void bothTree(TreeNode rootLeft, TreeNode rootRight, int depth) {
            if(rootLeft == null || rootRight == null) {
                return;
            }

            if (depth % 2 == 1) { // swap
                int temp = rootLeft.val;
                rootLeft.val = rootRight.val;;
                rootRight.val = temp;
            }

            // odd depth reverse
            bothTree(rootLeft.left, rootRight.right, depth+1);
            bothTree(rootLeft.right, rootRight.left, depth+1);
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




}
