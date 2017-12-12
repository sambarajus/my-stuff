package com.ssk.examples.tree;

import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class BinaryTreeGridTest {
    private BinaryTreeGrid treeGrid = new BinaryTreeGrid();
    @Test
    public void printTree() throws Exception {
        TreeNode root = new TreeNode(1);
        TreeNode two = new TreeNode(2);
        TreeNode three = new TreeNode(3);
        TreeNode four = new TreeNode(4);
        TreeNode five = new TreeNode(5);
        TreeNode six = new TreeNode(6);
        TreeNode seven = new TreeNode(7);

        root.left = two;
        root.right = three;

        two.left = four;
        two.right = five;

        three.left = six;
        three.right = seven;
        List<List<Integer>> ls = treeGrid.printGrid(root);
        ls.forEach(l-> System.out.println(l));
    }

}