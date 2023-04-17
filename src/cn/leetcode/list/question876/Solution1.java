package cn.leetcode.list.question876;


public class Solution1 {


    public static ListNode middleNode(ListNode head) {

        ListNode fast = head;
        ListNode slow = head;

        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
        }

        return slow;
    }

}
