package cn.leetcode.list.question86;

public class App {

    public static void main(String[] args) {

        int[] arr = {1,4,3,2,5,2};

        ListNode listNode = initListNode(arr);

        ListNode list = Solution1.partition(listNode, 3);

        while (list != null) {
            System.out.print(list.val + " ");
            list = list.next;
        }
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
