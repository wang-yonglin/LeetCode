package cn.leetcode.question23;

import java.util.PriorityQueue;

public class Solution1 {


    public static ListNode mergeKLists(ListNode[] list) {

        if (list.length == 0) {
            return null;
        }

        ListNode dummy = new ListNode(-1);
        ListNode p = dummy;

        PriorityQueue<ListNode> pq = new PriorityQueue<>(list.length, (a, b) -> a.val - b.val);

        for (ListNode head : list) {
            if (head != null) {
                pq.add(head);
            }
        }

        while (!pq.isEmpty()) {

            ListNode node = pq.poll();

            p.next = node;
            p = p.next;

            if (node.next != null) {
                pq.add(node.next);
            }
        }

        return dummy.next;
    }

}
