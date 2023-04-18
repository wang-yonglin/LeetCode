package cn.leetcode.list.question83;

public class Solution1 {

    public static ListNode deleteDuplicates(ListNode head) {

        if (head == null) {
            return null;
        }

        ListNode slow = head;
        ListNode fast = head;

        while (fast != null) {

            if (fast.val != slow.val) {
                slow.next = fast;
                slow = slow.next;
            }

            fast = fast.next;
        }

        slow.next = null;

        return head;
    }

}
