package a202312;

public class Ps231222_1 {

    public static void main(String[] args) {

    }

    class Solution {
        public ListNode swapNodes(ListNode head, int k) {
            int cnt = 1;
            ListNode node1 = null;
            ListNode node2 = head;
            ListNode currentNode = head;

            while (currentNode != null) {
                if (cnt == k) node1 = currentNode;
                if (cnt - k > 0) node2 = node2.next;

                currentNode = currentNode.next;
                cnt++;
            }

            int temp = node1.val;
            node1.val = node2.val;
            node2.val = temp;

            return head;
        }

        public class ListNode {
            int val;
            ListNode next;

            ListNode() {
            }

            ListNode(int val) {
                this.val = val;
            }

            ListNode(int val, ListNode next) {
                this.val = val;
                this.next = next;
            }
        }

    }


}
