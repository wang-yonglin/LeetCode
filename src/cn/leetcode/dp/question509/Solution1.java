package cn.leetcode.dp.question509;

public class Solution1 {

    public static int fib(int n) {

        if (n == 1 || n == 2) {
            return 1;
        }

        return fib(n - 1) + fib(n - 2);
    }

}
