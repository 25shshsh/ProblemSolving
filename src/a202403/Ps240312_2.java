package a202403;

import java.util.LinkedList;
import java.util.Queue;

public class Ps240312_2 {




    class Solution {
        public int deepestLeavesSum(TreeNode root) {
            Queue<TreeNode>queue = new LinkedList<>();
            int sum = 0;

            queue.add(root);

            while(!queue.isEmpty()) { // 1
                sum = 0;
                int n = queue.size();

                for (int i = 0; i < n; i++) { // 2
                    TreeNode currNode = queue.poll();
                    sum += currNode.val;

                    if (currNode.left != null) queue.add(currNode.left);
                    if (currNode.right != null) queue.add(currNode.right);
                }
            }

            return sum; // 3
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
