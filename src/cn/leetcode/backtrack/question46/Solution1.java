package cn.leetcode.backtrack.question46;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Solution1 {

    private List<List<Integer>> res = new ArrayList<>();


    public List<List<Integer>> permute(int[] nums) {

        LinkedList<Integer> track = new LinkedList<>();

        boolean[] used = new boolean[nums.length];

        backtrack(nums, track, used);

        return res;
    }


    private void backtrack(int[] nums, LinkedList<Integer> track, boolean[] used) {

        if (track.size() == nums.length) {
            res.add(new LinkedList<>(track));
            return;
        }

        for (int i = 0; i < nums.length; i++) {

            if (used[i]) {
                continue;
            }

            // 做选择  -->  前序
            track.add(nums[i]);
            used[i] = true;

            // 下一次决策树
            backtrack(nums, track, used);

            // 撤销选择  -->  后序
            track.removeLast();
            used[i] = false;
        }
    }


}
