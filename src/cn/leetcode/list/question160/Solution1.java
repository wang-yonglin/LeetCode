package cn.leetcode.list.question160;


public class Solution1 {


    public static ListNode getIntersectionNode(ListNode list1, ListNode list2) {

        ListNode p1 = list1;
        ListNode p2 = list2;

        while (p1 != p2) {

            if (p1 == null) {
                p1 = list2;
            } else {
                p1 = p1.next;
            }

            if (p2 == null) {
                p2 = list1;
            } else {
                p2 = p2.next;
            }
        }

        return p1;
    }

}
