package cn.leetcode.list.question23;

public class App {

    public static void main(String[] args) {

        int[][] arr = {{1, 4, 5}, {1, 3, 4}, {2, 6}};


        ListNode[] lists = new ListNode[arr.length];

        for (int i = 0; i < arr.length; i++) {
            lists[i] = initListNode(arr[i]);
        }

        ListNode list = Solution1.mergeKLists(lists);

        while (list != null) {
          System.out.print(list.val + " ");
          list = list.next;
        }

        System.out.println();
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
