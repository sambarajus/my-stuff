package com.ssk.examples.tree;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class BinaryTreeZigZag {
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> treeNodes = new ArrayList();
        if(root==null)
            return treeNodes;

        Stack<TreeNode> stack = new Stack();
        Stack<TreeNode> reverseStack = new Stack();
        boolean reverseDirection = false;
        stack.push(root);
        while(!stack.isEmpty() || !reverseStack.isEmpty()){
            int stackSize = reverseDirection ? reverseStack.size(): stack.size();
            List<Integer> levelNodes = new ArrayList();
            for(int i = 0;i< stackSize; i++){
                TreeNode node = reverseDirection ? reverseStack.pop(): stack.pop();

                if(!reverseDirection){
                    if(node.left!=null)
                        reverseStack.push(node.left);
                    if(node.right!=null)
                        reverseStack.push(node.right);
                }else{
                    if(node.right!=null)
                        stack.push(node.right);
                    if(node.left!=null)
                        stack.push(node.left);
                }

                levelNodes.add(node.val);
            }
            reverseDirection = !reverseDirection;
            treeNodes.add(levelNodes);
        }

        return treeNodes;
    }
}
