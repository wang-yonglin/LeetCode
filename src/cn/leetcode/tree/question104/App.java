package cn.leetcode.tree.question104;

import java.util.Deque;
import java.util.LinkedList;

public class App {

    public static void main(String[] args) {

        Integer[] arr = {3, 9, 20, null, null, 15, 7 };

        TreeNode tree = create(arr);

        Solution1 solution1 = new Solution1();
        int maxDepth = solution1.maxDepth(tree);

        System.out.println(maxDepth);
    }


    private static TreeNode create(Integer[] arr) {

        if (arr.length == 0) {
            return null;
        }

        TreeNode root = new TreeNode(arr[0]);

        Deque<TreeNode> deque = new LinkedList<>();
        deque.add(root);

        boolean creatLeft = true;

        for (int i = 1; i < arr.length; i++) {

            TreeNode node = deque.getFirst();

            if (creatLeft) {

                if (arr[i] != null) {
                    node.left = new TreeNode(arr[i]);
                    deque.offer(node.left);
                }

                creatLeft = false;

            } else {

                if (arr[i] != null) {
                    node.right = new TreeNode(arr[i]);
                    deque.offer(node.right);
                }

                // 移除队头元素
                deque.pollFirst();

                creatLeft = true;
            }
        }

        return root;
    }
}
