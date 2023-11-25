package a202311;

public class Ps231125_실패 {
    public static void main(String[] args) {

    }
    // https://leetcode.com/problems/balance-a-binary-search-tree/
    class Solution {
        public TreeNode balanceBST(TreeNode root) {
            int leftDepth = findBalance(root.left) + 1;
            int rightDepth = findBalance(root.right) + 1;
            int balance = Math.abs(leftDepth - rightDepth);
            boolean leftDepthLarger = leftDepth > rightDepth;

            while(balance > 1) {
                TreeNode temp = new TreeNode();
                TreeNode temp2 = new TreeNode();

                if(leftDepthLarger) { // ll rotation
                    if(root.left.right != null) {
                        temp = root.left;
                        root.left = root.left.right;
                        temp.right = root;

                        temp2 = root;
                        root = temp;
                        temp = temp2;
                    } else {
                        temp = root.left;
                        root.left = null;
                        temp.right = root;
                        root = temp;
                    }
                } else { // rr rotation
                    if(root.right.left != null) {
                        temp = root.right;
                        root.right = root.right.left;
                        temp.left = root;

                        temp2 = root;
                        root = temp;
                        temp = temp2;
                    } else {
                        temp = root.right;
                        root.right = null;
                        temp.left = root;
                        root = temp;
                    }
                }

                balance--;
            }

            return root;
        }

        private int findBalance(TreeNode node) {
            if(node == null) {
                return -1;
            }
            return Math.abs(findBalance(node.left) - findBalance(node.right));
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
