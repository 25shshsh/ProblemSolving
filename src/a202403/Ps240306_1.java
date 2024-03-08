package a202403;

public class Ps240306_1 {
    public static void main(String[] args) {

    }

    // 1. 거북이는 한 칸 이동, 토끼는 두 칸 이동 -> 리스트에 사이클이 있다면 둘이 언젠가는 만남.
    // 2. 만났다면 거북이만 시작점으로 이동 후 둘이 한 칸씩만 이동
    // 3. 다시 둘이 만나게 되는 곳이 사이클의 시작점이 된다.



    public class Solution {
        public boolean hasCycle(ListNode head) {
            ListNode slow = head;
            ListNode fast = head;

            while(true) { // 1
                if(fast == null
                        || fast.next == null
                        || fast.next.next == null) return false;

                slow = slow.next;
                fast = fast.next.next;

                if(slow == fast) return true;
            }
        }
    }

    class ListNode {
        int val;
        ListNode next;
        ListNode(int x) {
            val = x;
            next = null;
        }
    }
}
