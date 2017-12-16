package com.ssk.examples.tree;

import org.junit.Ignore;
import org.junit.Test;

import static org.junit.Assert.*;

@Ignore
public class BinaryTreeSerializeTest {
    private BinaryTreeSerialize serialize = new BinaryTreeSerialize();
    //3,9,20,null,null,15,7


    @Test
    public void serialize() throws Exception {

        TreeNode root = new TreeNode(3);
        TreeNode nine = new TreeNode(9);
        TreeNode twenty = new TreeNode(20);
        TreeNode fifteen = new TreeNode(15);
        TreeNode seven = new TreeNode(7);

        root.left = nine;
        root.right = twenty;

        twenty.left = fifteen;
        twenty.right = seven;

        System.out.println(serialize.serialize(root));
    }

    @Test
    public void deserialize() throws Exception {
        long start = System.currentTimeMillis();
        TreeNode node = serialize.deserialize("[5,2,3,null,null,2,4,3,1]");
        System.out.println(System.currentTimeMillis()-start);

        assertEquals("[5,2,3,null,null,2,4,3,1]", serialize.serialize(node));
    }

}