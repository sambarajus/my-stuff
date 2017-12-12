package com.ssk.examples.tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class BinaryTreeGrid {

    public List<List<Integer>> printGrid(TreeNode root) {
        int rows = height(root);
        int cols = (int) Math.pow(2, rows) - 1;

        String[][] grid = new String[rows][cols];
        List<List<Integer>> treeNodes = new ArrayList<>();
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        int row = 1;
        while (!queue.isEmpty()) {
            List<Integer> levelNodes = new LinkedList<Integer>();
            int nodeSize = queue.size();
            for (int i = 0; i < nodeSize; i++) {
                TreeNode node = queue.peek();
                if (node.left != null)
                    queue.offer(node.left);
                if (node.right != null)
                    queue.offer(node.right);

                int colIndex = getCellIndex(row, rows, i, cols);
                TreeNode n = queue.poll();
                grid[row - 1][colIndex] = "" + n.val;

                levelNodes.add(n.val);
            }
            row++;
            treeNodes.add(levelNodes);
        }
        printGrid(grid);
        return treeNodes;
    }

    private void printGrid(String[][] grid) {
        for (String[] aGrid : grid) {
            for (String anAGrid : aGrid) {
                System.out.print(anAGrid != null ? anAGrid + " " : " ");
            }
            System.out.println();
        }
    }

    private boolean isLeaf(TreeNode treeNode) {
        return treeNode != null && treeNode.left == null && treeNode.right == null;
    }

    private int height(TreeNode root) {
        if (isLeaf(root))
            return 1;
        int leftHeight = height(root.left);
        int rightHeight = height(root.right);
        return leftHeight >= rightHeight ? leftHeight + 1 : rightHeight + 1;
    }

    private int getCellIndex(int row, int depth, int nodePosition, int columnsCount) {
        return ((int) Math.pow(2, depth - row) - 1 + (int) Math.ceil(nodePosition * columnsCount / Math.pow(2, row - 1)));
    }
}