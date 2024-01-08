package a202401;

import javax.swing.tree.TreeNode;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Ps240104_1 {

    public static void main(String[] args) {

    }

    class Solution {

        public List<Integer> getAllElements(TreeNode root1, TreeNode root2) {
            ArrayList<Integer> list = new ArrayList<>();
            helper(root1, list);
            helper(root2, list);
            Collections.sort(list);
            return list;
        }

        public void helper(TreeNode root, ArrayList<Integer> list){
            if(root == null) return;

            list.add(root.val);
            helper(root.left,list);
            helper(root.right,list);
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
