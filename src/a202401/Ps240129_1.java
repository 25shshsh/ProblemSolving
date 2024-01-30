package a202401;

public class Ps240129_1 {
    public static void main(String[] args) {
        System.out.println(3/5);
        System.out.println(3%5);
    }

    class Solution {
        public ListNode[] splitListToParts(ListNode head, int k) {
            ListNode[] answer = new ListNode[k];
            ListNode tempNode = head;
            int n = 1;

            if(head == null) return new ListNode[k]; // 1

            while(tempNode.next != null) { // 2
                tempNode = tempNode.next;
                n++;
            }

            int avgNodeCount = n/k; // 3
            int sumNodeCount = n%k;

            for(int i = 0; i < k; i++) {
                ListNode tempHead = new ListNode();
                tempNode = tempHead;

                for(int j = 0; j < avgNodeCount; j++) { // 4
                    if(head != null) {
                        tempNode.next = new ListNode(head.val);
                        tempNode = tempNode.next;
                    }
                    head = head.next;
                }

                if(sumNodeCount > 0) { // 5
                    if(head != null) {
                        tempNode.next = new ListNode(head.val);
                        tempNode = tempNode.next;
                    }
                    head = head.next;
                    sumNodeCount--;
                }
                answer[i] = tempHead.next; // 6
            }

            return answer;
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
