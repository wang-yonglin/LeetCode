package cn.leetcode.backtrack.question51;


import java.util.List;

public class App {

    public static void main(String[] args) {

        Solution1 solution1 = new Solution1();
        List<List<String>> res1 = solution1.solveNQueens(5);
        System.out.println(res1.toString());
    }

}
