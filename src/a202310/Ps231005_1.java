package a202310;

public class Ps231005_1 {

    public static void main(String[] args) {

    }

    class Solution {

        private int maxDepth = 0;

        public int maxDepth(TreeNode root) {
            maxDepth(root,1);
            return maxDepth;
        }

        private void maxDepth(TreeNode root, int depth) {
            if(root != null) {
                maxDepth(root.left, depth+1);
                maxDepth(root.right, depth+1);
            } else {
                depth--;
            }
            maxDepth = Math.max(maxDepth, depth); // at leaf node
        }
    }



/*    class Solution {


        public int maxDepth(TreeNode root) {
            Queue<Integer> queue = new PriorityQueue<>(Collections.reverseOrder());
            maxDepth(root,1,queue);
            return queue.peek();
        }

        private void maxDepth(TreeNode root, int depth, Queue<Integer> queue) {
            if(root != null) {
                depth++;
                maxDepth(root.left);
                depth++;
                maxDepth(root.right);
            } else {
                depth--;
            }
            queue.add(depth);
        }
    }*/

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
