package a202402;

import java.util.LinkedList;
import java.util.Queue;

public class Ps240228_1 {

    public static void main(String[] args) {

    }


    class Solution {
        public int findBottomLeftValue(TreeNode root) {
            return bfs(root); // 1
        }

        int bfs (TreeNode Node) {
            Queue<TreeNode> queue = new LinkedList<>();
            TreeNode currNode = new TreeNode();

            queue.add(Node);

            while(!queue.isEmpty()) {
                currNode = queue.poll();

                if(currNode.right != null) queue.add(currNode.right); // 2
                if(currNode.left != null) queue.add(currNode.left);
            }

            return currNode.val;
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
