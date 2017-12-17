package com.ssk.examples.tree;

public class MaxDepthOfBinaryTree {
    public int maxDepth(TreeNode root) {

        int leftDepth = 0;
        int rightDepth = 0;
        if(root==null)
            return 0;
        if(root.left!=null)
            leftDepth = maxDepth(root.left);
        if(root.right!=null)
            rightDepth = maxDepth(root.right);
        return leftDepth>=rightDepth ? leftDepth+1 : rightDepth+1;
    }
}
