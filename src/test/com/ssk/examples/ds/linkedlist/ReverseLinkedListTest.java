package com.ssk.examples.ds.linkedlist;

import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class ReverseLinkedListTest {
    ReverseLinkedList reverseLinkedList = new ReverseLinkedList();
    ListUtil listUtil = new ListUtil();

    @Test
    public void reverse() throws Exception {


        ListNode revNode = reverseLinkedList.reverse(listUtil.createListNode());

        ListNode current = revNode;
        int i = 6;

        while(current!=null){
            assertEquals(i, current.val);
            current = current.next;
            i--;
        }

    }

}