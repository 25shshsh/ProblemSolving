package a202401;

public class Ps240127_1 {
    public static void main(String[] args) {

    }

    class Solution {
        public ListNode mergeInBetween(ListNode list1, int a, int b, ListNode list2) {
            ListNode startNode = null; // 1
            ListNode endNode = list1;

            for(int i = 0; i <= b; i++) { // 2
                if(i == a-1) startNode = endNode;
                endNode = endNode.next;
            }
            startNode.next = list2; // 3

            while(list2.next != null) { // 4
                list2 = list2.next;
            }
            list2.next = endNode; // 5

            return list1;
        }
    }

    public class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }
}
