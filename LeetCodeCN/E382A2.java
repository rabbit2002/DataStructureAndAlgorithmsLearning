import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class E382A2 {
    public static void main(String[] args) {
        Solution obj = new Solution(new ListNode(1, new ListNode(2, new ListNode(3))));
        System.out.println(obj.getRandom());
        System.out.println(obj.getRandom());
        System.out.println(obj.getRandom());
        System.out.println(obj.getRandom());
        System.out.println(obj.getRandom());
    }

    // 水塘抽样
    static class Solution {
        Random random = null;
        ListNode listNode = null;

        public Solution(ListNode head) {
            random = new Random();
            listNode = head;
        }

        public int getRandom() {
            int number = 1;
            int ans = 0;

            for (ListNode node = listNode; node != null; node = node.next) {
                int temp = random.nextInt(number);
                if (temp == 0) {
                    ans = node.val;
                }
                number++;
            }
            return ans;
        }
    }

    static class ListNode {
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


