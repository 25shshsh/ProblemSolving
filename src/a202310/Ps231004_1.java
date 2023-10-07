package a202310;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Ps231004_1 {
    public static void main(String[] args) {

    }


    class Solution {

        public boolean isSameTree(TreeNode p, TreeNode q) {
            return isSameNode(p,q);
        }

        private boolean isSameNode(TreeNode p, TreeNode q) {
            if(p == null || q == null) {  // basecase
                return p==q; // 만약 p와 q 둘 다 null 이라면 true, 아니라면 false 리턴
                             // 그리고 이 경우 p,q의 리프노드를 탐색하지 않고 리턴 후 종료한다.
            }
            return p.val == q.val && isSameNode(p.left, q.left) && isSameNode(p.right, q.right);
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


