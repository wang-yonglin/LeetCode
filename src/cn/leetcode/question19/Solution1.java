package cn.leetcode.question19;

public class Solution1 {


    public static ListNode removeNthFromEnd(ListNode head, int n) {

        ListNode dummy = new ListNode(-1);
        dummy.next = head;

        ListNode node = findFromEnd(head, n + 1);

        node.next = node.next.next;

        return dummy.next;
    }


    private static ListNode findFromEnd(ListNode head, int k) {

        ListNode p1 = head;

        for (int i = 0; i < k-1; i++) {
            p1 = p1.next;
        }

        ListNode p2 = head;

        while (p1.next != null) {
            p1 = p1.next;
            p2 = p2.next;
        }

        return p2;
    }

}
