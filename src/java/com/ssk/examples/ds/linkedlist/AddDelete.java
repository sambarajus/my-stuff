package com.ssk.examples.ds.linkedlist;

public class AddDelete {

    public ListNode addNode(ListNode head, ListNode node){

        ListNode current = head;
        while(current.next!=null){
            current = current.next;
        }
        current.next = node;
        return head;
    }

    /**
     * O(N) complexity
     * @param head
     * @param node
     * @param position
     * @return
     */
    public ListNode addNode(ListNode head, ListNode node, int position){
        if(head==null && position<2)
            return node;

        if(head==null && position>1)
            return null;
        int i = 1;
        ListNode current = head;
        while(current.next!=null){
            if(i==position-1){
                node.next = current.next;
                current.next = node;
                return head;
            }
            current = current.next;
            i++;
        }
        current.next = node;
        return head;
    }

    public ListNode removeHead(ListNode head){
        if(head==null)
            return null;
        return head.next;
    }

    public ListNode removeNthNode(ListNode head, int position) {
        ListNode current = head;
        ListNode prev = null;
        int i = 1;
        while(current!=null){
            if(i==position)
            {
                prev.next = current.next;
            }
            prev = current;
            current = current.next;
            i++;
        }
        return head;
    }

    public ListNode removeTail(ListNode head){
        if(head==null)
            return head;

        ListNode current = head;
        while (current.next.next!=null){
            current = current.next;
        }
        current.next = null;
        return head;
    }
}
