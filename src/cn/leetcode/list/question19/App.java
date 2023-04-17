package cn.leetcode.list.question19;

public class App {

    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 5};

        ListNode list = initListNode(arr);


        ListNode target = Solution1.removeNthFromEnd(list, 2);

        while (target != null) {
          System.out.print(target.val + " ");
            target = target.next;
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
