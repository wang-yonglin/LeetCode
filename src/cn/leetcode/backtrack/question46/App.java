package cn.leetcode.backtrack.question46;

import java.util.Arrays;
import java.util.List;

public class App {

    public static void main(String[] args) {

        int[] arr = {1, 2, 3};

        Solution1 solution1 = new Solution1();
        List<List<Integer>> res1 = solution1.permute(arr);
        System.out.println(res1.toString());
    }

}
