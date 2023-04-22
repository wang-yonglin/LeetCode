package cn.leetcode.tree.question104;

public class Solution2 {

    public static int maxDepth(TreeNode root) {

        if (root == null) {
            return 0;
        }

        int leftMaxDepth = maxDepth(root.left);
        int rightMaxDepth =maxDepth(root.right);

        int maxDepth = Math.max(leftMaxDepth, rightMaxDepth) + 1;

        return maxDepth;
    }
}
