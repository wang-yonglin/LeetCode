package cn.leetcode.list.question21;

public class App {

    public static void main(String[] args) {

        int[] arr1 = {1, 2, 4};
        int[] arr2 = {1, 3, 4};

        ListNode list1 = initListNode(arr1);
        ListNode list2 = initListNode(arr2);

        ListNode list = Solution1.mergeTwoLists(list1, list2);

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
