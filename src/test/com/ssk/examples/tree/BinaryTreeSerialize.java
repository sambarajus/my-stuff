package com.ssk.examples.tree;

import apple.laf.JRSUIUtils;

import java.util.*;

public class BinaryTreeSerialize {

    public String serialize(TreeNode root) {
        if (root == null)
            return "[]";

        StringBuilder sb = new StringBuilder("[");
        Queue<TreeNode> q = new LinkedList();
        int height = height(root);
        q.offer(root);
        int level = 1;
        while (!q.isEmpty()) {
            int size = q.size();
            for (int i = 0; i < size; i++) {
                TreeNode n = q.poll();
                sb.append(n != null ? n.val : "null");
                if (n != null) {
                    if (n.left != null)
                        q.offer(n.left);
                    else if (level < height)
                        q.offer(null);
                    if (n.right != null)
                        q.offer(n.right);
                    else if (level < height)
                        q.offer(null);
                }
                if (!q.isEmpty())
                    sb.append(",");
            }
            level++;
        }
        sb.append("]");
        return sb.toString();
    }

    public TreeNode deserialize(String str) {

        str = str.replace("[", "");
        str = str.replace("]", "");
        if (str.length() == 0)
            return null;

        String[] nodes = str.split(",");
        List<TreeNode> nodeList = new ArrayList<>();
        for (int i = 0; i < nodes.length; i++) {
            TreeNode node;
            if ("null".equals(nodes[i]))
                nodeList.add(i, null);
            else
                nodeList.add(i, new TreeNode(Integer.parseInt(nodes[i])));
        }
        int childCount = 1;
        int idx = 1;
        TreeNode root = new TreeNode(Integer.parseInt(nodes[0]));
        Queue<TreeNode> q = new LinkedList();
        q.offer(nodeList.get(0));
        while(!q.isEmpty() && idx<nodeList.size()){
            childCount = childCount*2;
            int s = q.size();
            for (int i = 0; i <s ; i++) {
                TreeNode node = q.poll();
                if(node!=null){
                    node.left = nodeList.get(idx++);
                    node.right = nodeList.get(idx++);
                    q.offer(node.left);
                    q.offer(node.right);
                }else{
                    idx = idx+2;
                }
            }

        }
//        for (int i = 0; 2 * i + 1 < nodes.length; i++) {
//            if (nodeList.get(i) != null) {
//                nodeList.get(i).left = nodeList.get(2 * i + 1);
//                nodeList.get(i).right = nodeList.get(2 * i + 2);
//            }
//        }
        return nodeList.get(0);
    }

    private int height(TreeNode root) {

        if (root != null) {
            if (root.left == null && root.right == null) {
                return 1;
            } else {
                int leftHeight = height(root.left);
                int rightHeight = height(root.right);
                return leftHeight >= rightHeight ? leftHeight + 1 : rightHeight + 1;
            }
        } else {
            return 0;
        }
    }

}
