package a202402;

import java.util.ArrayList;
import java.util.List;

public class Ps240206_1 {
    public static void main(String[] args) {
        int start = 8;
        int end = 14;

        int mid = start + (end - start) / 2;

        System.out.println(mid);
        
    }

    class Solution {
        List<Integer> list = new ArrayList<>();

        public TreeNode sortedListToBST(ListNode head) {
            if(head == null) return null;

            while(head != null) { // ListNode to ArrayList
                list.add(head.val);
                head = head.next;
            }

            return ascListToBST(0, list.size()-1);
        }

        private TreeNode ascListToBST(int start, int end) {
            if(start > end) return null; // basecase

            int mid = start + (end-start) / 2;
            TreeNode node = new TreeNode(list.get(mid));

            node.left = ascListToBST(start, mid-1);
            node.right = ascListToBST(mid+1, end);

            return node;
        }
    }



    int treeDepth (int n) {
        int depth = 1;
        while(true) {
            if(n < (int)(Math.pow(2, depth)-1)) return depth-1;
            depth++;
        }
    }





    public class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
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
