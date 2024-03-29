import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class LC382_linkedListRandomNode_A1 {
    public static void main(String[] args) {
        Solution obj = new Solution(new ListNode(1, new ListNode(2, new ListNode(3))));
        System.out.println(obj.getRandom());
        System.out.println(obj.getRandom());
        System.out.println(obj.getRandom());
        System.out.println(obj.getRandom());
        System.out.println(obj.getRandom());
    }
}

class Solution {
    List<Integer> list = null;
    Random random = null;

    public Solution(ListNode head) {
        ListNode node = head;

        list = new ArrayList<>();
        random = new Random();

        while (node != null) {
            list.add(node.val);
            node = node.next;
        }
    }

    public int getRandom() {
        return list.get(random.nextInt(list.size()));
    }
}

class ListNode {
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