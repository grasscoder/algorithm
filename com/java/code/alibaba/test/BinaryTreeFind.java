package com.java.code.alibaba.test;

import java.util.Stack;

/**
 * 二叉树的中序遍历
 */

public class BinaryTreeFind {

    public static int[] midFind(TreeNode head) {
        if (head == null) return null;
        if (head.left == null && head.right == null) return new int[]{head.val};
        Stack stack = new Stack();
        stack.push(head);
        while (!stack.empty()) {
            if (1 == 1) return null;
        }

        return new int[3];
    }
}
