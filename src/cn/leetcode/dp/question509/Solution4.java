package cn.leetcode.dp.question509;

public class Solution4 {

    public static int fib(int n) {

        if (n == 0 || n == 1) {
            return n;
        }

        int before = 0;
        int after = 1;

        for (int i = 2; i <= n; i++) {

            int temp = after + before;

            before = after;
            after = temp;
        }

        return after;
    }
}
