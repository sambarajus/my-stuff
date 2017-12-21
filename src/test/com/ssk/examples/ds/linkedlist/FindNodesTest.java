package com.ssk.examples.ds.linkedlist;

import org.junit.Test;

import static org.junit.Assert.*;

public class FindNodesTest {
    FindNodes findNodes = new FindNodes();
    ListUtil listUtil = new ListUtil();


    @Test
    public void findNode() throws Exception {
        ListNode head = listUtil.createListNode();
        assertEquals(5, findNodes.findNode(head, 5).val);
        assertEquals(4, findNodes.findNode(head, 4).val);
        assertEquals(3, findNodes.findNode(head, 3).val);
    }

    @Test
    public void findNthNode() throws Exception {
        ListNode head = listUtil.createListNode();
        assertEquals(5, findNodes.findNthNode(head, 5).val);
        assertEquals(4, findNodes.findNthNode(head, 4).val);
        assertEquals(3, findNodes.findNthNode(head, 3).val);
        assertNull(findNodes.findNthNode(head, 7));
    }

}