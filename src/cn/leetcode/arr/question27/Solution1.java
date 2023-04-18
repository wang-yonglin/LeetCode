package cn.leetcode.arr.question27;

public class Solution1 {

    public static int removeElement(int[] arr, int value) {

        int slow = 0;
        int fast = 0;

        while (fast <  arr.length) {

            if (arr[fast] != value) {
                arr[slow] = value;
                ++ slow;
            }

            ++ fast;
        }

        return slow;
    }

}
