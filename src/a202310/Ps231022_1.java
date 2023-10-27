package a202310;

public class Ps231022_1 {

    public static void main(String[] args) {

    }



    class Solution {
        public TreeNode buildTree(int[] inorder, int[] postorder) {

            return buildTree(inorder,0, inorder.length-1, postorder, 0 , postorder.length-1);
        }

        private TreeNode buildTree(int[] inorder, int inStart, int inEnd, int[] postorder, int postStart, int postEnd) {

            if (inStart > inEnd || postStart > postEnd) return null; // Base case

            int rootVal = postorder[postEnd]; // 1
            TreeNode rootNode = new TreeNode(rootVal);

            int rootIdxAtInorder = 0; // 2
            for(int i = 0 ; i <= inEnd; i++) {
                if(rootVal == inorder[i]) {
                    rootIdxAtInorder = i;
                    break;
                }
            }

            // 3
            int leftSize = rootIdxAtInorder - inStart;
            int rightSize = inEnd - rootIdxAtInorder;

            rootNode.left = buildTree(inorder, inStart, rootIdxAtInorder - 1,
                    postorder, postStart, postStart + leftSize -1); // 3-1

            rootNode.right = buildTree(inorder, rootIdxAtInorder + 1, inEnd,
                    postorder, postEnd - rightSize, postEnd - 1); // 3-2


            return rootNode;
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
