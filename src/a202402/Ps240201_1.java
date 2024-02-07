package a202402;

import java.util.LinkedList;
import java.util.Queue;

public class Ps240201_1 {
    public static void main(String[] args) {
        int cnt = 0;
        int depth = 2;

        if(cnt == 0) {
            cnt = (int) Math.pow(2,++depth);
        }
        System.out.println(cnt);
    }



    class Solution {
        public Node connect(Node root) {
            if(root == null) return null;
            bfs(root);

            return root; // 4
        }

        public void bfs(Node root) {
            if (root == null) return;

            Queue<Node> queue = new LinkedList<>();
            queue.add(root);

            int depth = 0; // 1
            int cnt = (int) Math.pow(2,depth);


            while (!queue.isEmpty()) {
                Node current = queue.poll(); // 2
                cnt--;

                if(cnt == 0) { // 3-1
                    current.next = null;
                    cnt = (int) Math.pow(2, ++depth);
                } else { // 3-2
                    current.next = queue.peek();
                }

                if(current.left != null) queue.add(current.left); // 2
                if(current.right!= null) queue.add(current.right);
            }
        }
    }

    class Node {
        public int val;
        public Node left;
        public Node right;
        public Node next;

        public Node() {}

        public Node(int _val) {
            val = _val;
        }
        public Node(int _val, Node _left, Node _right, Node _next) {
            val = _val;
            left = _left;
            right = _right;
            next = _next;
        }
    }



}
