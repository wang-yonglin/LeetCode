package cn.leetcode.list.question160;

public class App {

    public static void main(String[] args) {

        int[] arr1 = {1, 2, 3, 4};
        int[] arr2 = {4, 5, 6, 7};

        ListNode list1 = initListNode(arr1);
        ListNode list2 = initListNode(arr2);

        ListNode node = Solution1.getIntersectionNode(list1, list2);

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
