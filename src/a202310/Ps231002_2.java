package a202310;

public class Ps231002_2 {

    public static void main(String[] args) {
        // head = [1,1,2,3,3] output = [1,2,3]
    }

    class Solution {
        public ListNode deleteDuplicates(ListNode head) {
            ListNode temp = head;

            while(temp.next != null) {

                try {
                    if(temp.val == temp.next.val) {
                        temp.next = temp.next.next; // 연결고리를 temp.next를 빼놓고 다시 연결
                    }
                    temp = temp.next; // 다음 값 순차탐색을 위해 현재 위치를 +1
                } catch (NullPointerException e) {
                    break;
                }

            }

            return head;
        }
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
