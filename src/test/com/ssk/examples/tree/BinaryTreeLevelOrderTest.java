package com.ssk.examples.tree;

import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class BinaryTreeLevelOrderTest {

    BinaryTreeLevelOrder levelOrder = new BinaryTreeLevelOrder();
    @Test
    public void levelOrder() throws Exception {
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

        List<List<Integer>> l = levelOrder.levelOrder(root);
        l.forEach(c->{
            System.out.printf(c+"");
        });
    }

}