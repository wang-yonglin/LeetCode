package cn.leetcode.arr.question344;

public class Solution1 {

    public static char[] reverseString(char[] arr) {

        int left = 0;
        int right = arr.length - 1;

        while (left < right) {

            char temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;

            left++;
            right--;
        }

        return arr;
    }

}
