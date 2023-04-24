package cn.leetcode.dp.question322;

public class App {

    public static void main(String[] args) {

        int[] coin = {1, 2, 5};

        Solution1 solution1 = new Solution1();
        Solution2 solution2 = new Solution2();
        Solution3 solution3 = new Solution3();

        int res1 = solution1.coinChange(coin, 9);
        int res2 = solution2.coinChange(coin, 9);
        int res3 = solution3.coinChange(coin, 9);

        System.out.println(res1);
        System.out.println(res2);
        System.out.println(res3);
    }

}
