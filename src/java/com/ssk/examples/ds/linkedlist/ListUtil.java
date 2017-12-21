package com.ssk.examples.ds.linkedlist;

public class ListUtil {
    public ListNode createListNode(){
        ListNode one = new ListNode(1);
        ListNode two = new ListNode(2);
        ListNode three = new ListNode(3);
        ListNode four = new ListNode(4);
        ListNode five = new ListNode(5);
        ListNode six = new ListNode(6);

        one.next = two;
        two.next = three;
        three.next = four;
        four.next = five;
        five.next = six;

        return one;
    }
}
