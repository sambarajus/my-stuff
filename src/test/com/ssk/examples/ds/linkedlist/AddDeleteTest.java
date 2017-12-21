package com.ssk.examples.ds.linkedlist;

import org.junit.Test;

import static org.junit.Assert.*;

public class AddDeleteTest {
    FindNodes findNodes = new FindNodes();
    AddDelete addDelete = new AddDelete();
    ListUtil listUtil = new ListUtil();

    @Test
    public void addNode() throws Exception {
        ListNode head = listUtil.createListNode();
        ListNode newHead = addDelete.addNode(head, new ListNode(7));

        ListNode tail = head;
        while(tail.next!=null)
            tail = tail.next;

        assertEquals(7, tail.val);
    }

    @Test
    public void addNodeAtPosition() throws Exception{
        ListNode head = listUtil.createListNode();
        ListNode newHead = addDelete.addNode(head, new ListNode(7), 3);
        assertEquals(7, findNodes.findNthNode(newHead, 3).val);

    }

    @Test
    public void removeHead() throws Exception{
        ListNode head = listUtil.createListNode();
        ListNode newHead = addDelete.removeHead(head);
        assertEquals(2,newHead.val);
    }

    @Test
    public void removeNodeAtPosition() throws Exception{
        ListNode head = listUtil.createListNode();
        ListNode newHead = addDelete.addNode(head, new ListNode(7), 3);
        assertEquals(7, findNodes.findNthNode(newHead, 3).val);
        ListNode nodeAfterRemoval = addDelete.removeNthNode(newHead, 3);
        assertEquals(3, findNodes.findNthNode(nodeAfterRemoval, 3).val);
    }

    @Test
    public void removeTail() throws Exception {
        ListNode head = listUtil.createListNode();
        ListNode newHead = addDelete.removeTail(head);
        ListNode fifthNode = findNodes.findNthNode(newHead, 5);
        assertNull(fifthNode.next);
    }

}