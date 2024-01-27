package a202401;

public class Ps240125_1 {
    public static void main(String[] args) {

    }


    class Solution {
        public ListNode mergeNodes(ListNode head) {
            ListNode headNode = new ListNode(); // 0
            ListNode answer = headNode;
            int temp = 0;

            head = head.next; // 1

            while(head != null) {
                if(head.val == 0) { // 2-1
                    headNode.val = temp;
                    temp = 0;

                    if(head.next != null) { // 2-2, 2-3
                        headNode.next = new ListNode();
                        headNode = headNode.next;
                    }
                } else {
                    temp += head.val;
                }

                head = head.next;
            }
            return answer;
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
