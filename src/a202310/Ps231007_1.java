package a202310;

public class Ps231007_1 {

    public static void main(String[] args) {

    }


    class Solution {

        private int maxDepth = 1;

        public boolean isBalanced(TreeNode root) {

            if(root == null) {
                return true;
            }

            int leftDepth = getMaxDepth(root.left,1);
            maxDepth = 1;

            int rightDepth = getMaxDepth(root.right,1);
            maxDepth = 1;

            return Math.abs(leftDepth - rightDepth) <= 1 && isBalanced(root.left) && isBalanced(root.right);
        }

        private int getMaxDepth(TreeNode root, int depth) {
            if (root != null) {
                getMaxDepth(root.left, depth + 1);
                getMaxDepth(root.right, depth + 1);
            } else {
                depth--; // if root == null 이라면 백트래킹
            }
            return maxDepth = Math.max(maxDepth, depth);
        }
    }

    class Solution2 {

        public boolean isBalanced(TreeNode root) {
            if(root == null) { // example3) root = {}일 경우에는 true
                return true;
            }

            int leftDepth = getTreeDepth(root.left) + 1; // 루트포함, 왼쪽 자식노드의 모든 서브트리의 깊이 최댓값
            int rightDepth = getTreeDepth(root.right) + 1; // 루트포함, 오른쪽 자식노드의 모든 서브트리의 깊이 최댓값

            return Math.abs(leftDepth - rightDepth) <= 1 && isBalanced(root.left) && isBalanced(root.right);
        }

        private int getTreeDepth(TreeNode root) { // root에서 root.left 혹은 root.right의 depth 최댓값 (root 포함)
            if (root == null) { //basecase
                return 0; // 종료조건 : 재귀는 종료되고 0을 리턴한다. 함수는 종료되고 이전함수로 돌아가서, left,right에 0을 넣고 최댓값과 비교하겠지.
            }

            int leftDepth = getTreeDepth(root.left);
            int rightDepth = getTreeDepth(root.right);

            return Math.max(leftDepth, rightDepth) + 1;
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
