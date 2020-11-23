//输入：(2 -> 4 -> 3) + (5 -> 6 -> 4)
//输出：7 -> 0 -> 8
//原因：342 + 465 = 807

public class Question2_AddTwoNumbers {

    public static void main(String[] args) {
        Question2_AddTwoNumbers main = new Question2_AddTwoNumbers();
        ListNode l1 = new ListNode(2);
        ListNode l2 = new ListNode(4);
        ListNode l3 = new ListNode(3);
        l1.next = l2;
        l2.next = l3;
        l3.next = null;
        ListNode l4 = new ListNode(5);
        ListNode l5 = new ListNode(6);
        ListNode l6 = new ListNode(4);
        l4.next = l5;
        l5.next = l6;
        l6.next = null;
        ListNode result = main.addTwoNumbers(l1, l4);
        while (result != null) {
            System.out.println(result.val);
            result = result.next;
        }
    }

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode head = null;
        ListNode operator = null;
        boolean isUp = false;
        while (l1 != null || l2 != null) {
            ListNode temp = new ListNode(0);
            if (head == null) {
                operator = temp;
                head = operator;
            }
            operator.next = temp;
            int l1Val = l1.val;
            int l2Val = l2.val;
            int sum = 0;
            if (isUp) {
                sum = l1Val + l2Val + 1;
                isUp = false;
            } else {
                sum = l1Val + l2Val;
            }
            if (sum >= 10) {
                isUp = true;
                sum = sum % 10;
            }
            operator.val = sum;
            //            ListNode temp = new ListNode(0);
            l1 = l1.next;
            l2 = l2.next;
        }
        operator.next = null;
        return head;
    }

    public static class ListNode {
        int val;
        ListNode next;

        ListNode(int x) { val = x; }
    }
}



