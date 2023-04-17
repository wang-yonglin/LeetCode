package cn.leetcode.list.question876;

public class App {

    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4};

        ListNode list = initListNode(arr);

        ListNode node = Solution1.middleNode(list);

        System.out.println(node.val);
    }


    private static ListNode initListNode(int [] arr) {

        ListNode dummy = new ListNode(-1);

        ListNode p = dummy;

        for (int i = 0; i < arr.length; i++) {
            p.next = new ListNode(arr[i]);
            p = p.next;
        }

        return dummy.next;
    }

}
