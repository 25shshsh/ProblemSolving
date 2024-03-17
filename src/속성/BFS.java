package 속성;

import java.util.LinkedList;
import java.util.Queue;

public class BFS {

    class Solution {
        public int sumOfLeftLeaves(TreeNode root) {
            int sum = -root.val;
            Queue<TreeNode> queue = new LinkedList<>();
            queue.add(root);

            while(!queue.isEmpty()) {
                TreeNode currentNode;
                int n = queue.size();
                int leftLeafValue = 0;

                for(int i = 0; i < n; i++) {
                    currentNode = queue.poll();
                    if(currentNode.right != null) queue.add(currentNode.right);
                    if(currentNode.left != null) queue.add(currentNode.left);
                    leftLeafValue = currentNode.val;
                }

                sum += leftLeafValue;
            }

            return sum;
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