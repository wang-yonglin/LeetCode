package cn.leetcode.question1;

import java.util.Arrays;

public class App {

    public static void main(String[] args) {

        int[] nums = {2, 7, 1, 1, 15};
        int target = 9;

        Solution1 solution1 = new Solution1();
        int[] result1 = solution1.twoSum(nums, target);
        System.out.println("执行结果1：" + Arrays.toString(result1));
    }

}
