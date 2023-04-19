package cn.leetcode.arr.question167;

import java.util.Arrays;

public class App {

    public static void main(String[] args) {

        int[] arr = {1, 1, 2, 2, 3, 3};

        int[] result = Solution1.twoSum(arr, 3);

        System.out.println(Arrays.toString(result));
    }

}
