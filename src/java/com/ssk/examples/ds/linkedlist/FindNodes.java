package com.ssk.examples.ds.linkedlist;

public class FindNodes {

    public ListNode findNode(ListNode head, int val){
        ListNode current = head;
        while(current!=null){
            if(current.val==val)
                return current;
            current =  current.next;
        }
        return null;
    }

    public ListNode findNthNode(ListNode head, int position){
        if(head==null)
            return head;

        ListNode current = head;
        int i = 1;
        while(current!=null){
            if(i==position)
                return current;
            current = current.next;
            i++;
        }
        return null;
    }
}
