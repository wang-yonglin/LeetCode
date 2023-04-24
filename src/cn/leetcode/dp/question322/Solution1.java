package cn.leetcode.dp.question322;

public class Solution1 {

    public int coinChange(int[] coins, int amount) {
        return dp(coins, amount);
    }

    private int dp(int[] coins, int amount) {

        if (amount < 0) {
            return -1;
        }

        if (amount == 0) {
            return 0;
        }

        int res = Integer.MAX_VALUE;

        for (int coin : coins) {

            int subProblem = dp(coins, amount - coin);

            if (subProblem == -1) {
                continue;
            }

            res = Math.min(res, subProblem + 1);
        }

        return res == Integer.MAX_VALUE ? -1 : res;
    }

}
