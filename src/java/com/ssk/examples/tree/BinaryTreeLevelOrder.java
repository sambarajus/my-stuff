package com.ssk.examples.tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class BinaryTreeLevelOrder {
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> nodeList = new ArrayList();
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        while (!queue.isEmpty()) {
            int levelNum = queue.size();
            List<Integer> levelNodes = new LinkedList();
            for (int i = 0; i < levelNum; i++) {
                if (queue.peek().left != null) queue.offer(queue.peek().left);
                if (queue.peek().right != null) queue.offer(queue.peek().right);
                levelNodes.add(queue.poll().val);
            }
            nodeList.add(levelNodes);
        }
        return nodeList;
    }

    /*void topView(Node root) {
        Queue<Node> queue = new LinkedList();
        queue.offer(root);
        while(!queue.isEmpty()){
            int queueSize = queue.size();
            for(int i = 0;i<queueSize; i++){
                Node node = queue.poll();
                if(node!=null){
                    if(node.left!=null) queue.offer(node.left);
                    if(node.right!=null) queue.offer(node.right);
                    if(i==queueSize-1){
                        System.out.print(node.data+" ");
                    }
                }
            }
        }
    }*/

    /*void topView(Node root) {
        if(root.left != null) {
            goLeft(root.left);
        }
        System.out.print(root.data + " ");
        if(root.right != null) {
            goRight(root.right);
        }
    }

    void goLeft(Node node) {
        if(node.left != null) {
            goLeft(node.left);
        }
        System.out.print(node.data + " ");
    }

    void goRight(Node node) {
        System.out.print(node.data + " ");

        if(node.right != null) {
            goRight(node.right);
        }
    }*/
}

