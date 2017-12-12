package com.ssk.examples.tree;

import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class BinaryTreeZigZagTest {

    private BinaryTreeZigZag binaryTreeZigZag = new BinaryTreeZigZag();

    @Test
    public void zigzagLevelOrder() throws Exception {

        //3,9,20,null,null,15,7

        TreeNode root = new TreeNode(3);
        TreeNode nine = new TreeNode(9);
        TreeNode twenty = new TreeNode(20);
        TreeNode fifteen = new TreeNode(15);
        TreeNode seven = new TreeNode(7);


        root.left = nine;
        root.right = twenty;

        twenty.left = fifteen;
        twenty.right = seven;

        List<List<Integer>> treeNodes = binaryTreeZigZag.zigzagLevelOrder(root);

        treeNodes.forEach(l-> System.out.println(l));
    }

}