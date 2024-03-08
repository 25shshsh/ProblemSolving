package a202402;

import java.util.LinkedList;
import java.util.Queue;

public class Ps240229_1 {
    public static void main(String[] args) {

    }

    class Solution {
        public boolean isEvenOddTree(TreeNode root) {
            Queue<TreeNode> queue = new LinkedList<>();
            int depth = 0;

            queue.add(root);

            while (!queue.isEmpty()) {
                int size = queue.size();
                Integer prevValue = null;

                for (int i = 0; i < size; i++) {
                    TreeNode currNode = queue.poll();

                    if (depth % 2 == 0) { // 2
                        if (currNode.val % 2 == 0
                                || (prevValue != null && currNode.val <= prevValue)) return false;
                    } else {
                        if (currNode.val % 2 != 0
                                || (prevValue != null && currNode.val >= prevValue)) return false;
                    }
                    prevValue = currNode.val; // BFS로 순차적으로 선택되는 노드

                    if (currNode.left != null) queue.add(currNode.left); // 3
                    if (currNode.right != null) queue.add(currNode.right);
                }
                depth++;
            }

            return true;
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
