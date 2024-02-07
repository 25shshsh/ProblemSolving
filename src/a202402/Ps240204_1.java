package a202402;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Ps240204_1 {
    public static void main(String[] args) {
        
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

    class Solution {
        Queue<Integer> queue = new LinkedList<>();

        public void flatten(TreeNode root) {
            nodeToQueue(root); // 2

            if(queue.peek() != null) root.val = queue.poll(); // 3

            while(!queue.isEmpty()) { // 4
                root.right = new TreeNode(queue.poll());
                root.left = null;
                root = root.right;
            }
        }

        void nodeToQueue(TreeNode root) { // 2
            if(root == null) return;

            queue.add(root.val);

            nodeToQueue(root.left);
            nodeToQueue(root.right);
        }
    }
}
