package com.ssk.examples.ds.linkedlist;

public class ReverseLinkedList {


    public ListNode reverse(ListNode head) {
        ListNode current = head;
        ListNode prev = null;
        while (current!=null){
            ListNode temp = current.next;
            current.next = prev;
            prev = current;
            current = temp;
        }
        return prev;
    }
}
