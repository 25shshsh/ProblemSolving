package a202310;

public class Ps231006_1 {

    public static void main(String[] args) {

    }


    class Solution {

        public TreeNode sortedArrayToBST(int[] nums) {
            int start = 0;
            int end = nums.length - 1;
            return sortedArrayToBST(nums, start, end);
        }

        private TreeNode sortedArrayToBST(int[] nums, int start, int end) {

            if (start > end) {
                return null;
            }
            int middle = (start + end) / 2;
            TreeNode treeNode = new TreeNode(nums[middle]);

            // treenode.left = new TreeNode(nums[middle]);
            // sortedArrayToBST() = TreeNode에 middle인덱스를 넣은 노드를 어디에 연결시킬 것인가?
            treeNode.left = sortedArrayToBST(nums, start, middle - 1);
            treeNode.right = sortedArrayToBST(nums, middle + 1, end);

            return treeNode;

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
