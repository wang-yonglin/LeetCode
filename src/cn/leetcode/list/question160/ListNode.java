package cn.leetcode.list.question160;

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


    @Override
    public boolean equals(Object o) {

        return val == ((ListNode) o).val;
    }

    @Override
    public int hashCode() {
        return 17 * 31 + val;
    }
}
