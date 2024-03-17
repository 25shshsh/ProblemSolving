package 속성;

import java.util.Stack;

public class DFS {

    // 전위순회임 1 2 4 5 3 6 순
    class Solution {
        public TreeNode pruneTree(TreeNode root) {
            Stack<TreeNode> stack = new Stack<>();

            stack.add(root);

            while(!stack.isEmpty()) {
                TreeNode currNode = stack.pop();
                System.out.println(currNode.val);

                if(currNode.right != null) stack.push(currNode.right);
                if(currNode.left != null) stack.push(currNode.left);
            }

            return new TreeNode();
        }
    }


     public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode() {}
        TreeNode(int val) { this.val = val; }
        TreeNode(int val, TreeNode left, TreeNode right) {
           this.val = val;
           this.left = left;
           this.right = right;
        }
    }

}
