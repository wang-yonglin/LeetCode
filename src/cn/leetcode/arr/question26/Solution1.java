package cn.leetcode.arr.question26;

public class Solution1 {

    public static int removeDuplicates(int[] arr) {

        if (arr.length == 0) {
            return 0;
        }

        int slow = 0;
        int fast = 1;

        do {

            if (arr[fast] != arr[slow]) {

                arr[slow + 1] = arr[fast];

                ++slow;
            }

            ++fast;

        } while (fast < arr.length);

        return slow;
    }

}
