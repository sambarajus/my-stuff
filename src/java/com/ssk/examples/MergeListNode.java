package com.ssk.examples;

/**
 * Created by 212561830 on 11/12/17.
 */
public class MergeListNode {

//    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
//
//        ListNode resultNode = null;
//        ListNode tailNode = null;
//        if(l1!=null && l2!=null){
//            ListNode l1CurrentNode = l1;
//            ListNode l2CurrentNode = l2;
//            while(l1CurrentNode!=null ||  l2CurrentNode!=null){
//                if(l1CurrentNode==null){
//                    ListNode node = new ListNode(l2CurrentNode.val);
//                    tailNode = addNode(tailNode, node);
//                    l2CurrentNode = l2CurrentNode.next;
//                }else if(l2CurrentNode==null){
//                    ListNode node = new ListNode(l1CurrentNode.val);
//                    tailNode = addNode(tailNode, node);
//                    l1CurrentNode = l1CurrentNode.next;
//                }else if(l1CurrentNode.val<l2CurrentNode.val){
//                    ListNode node = new ListNode(l1CurrentNode.val);
//                    if(resultNode==null){
//                        resultNode = node;
//                        tailNode = node;
//                    }else{
//                        tailNode = addNode(tailNode, node);
//                    }
//                    l1CurrentNode = l1CurrentNode.next;
//                }else{
//                    ListNode node = new ListNode(l2CurrentNode.val);
//                    if(resultNode==null){
//                        resultNode = node;
//                        tailNode = node;
//                    }else{
//                        tailNode = addNode(tailNode, node);
//                    }
//                    l2CurrentNode = l2CurrentNode.next;
//                }
//            }
//
//        }else if(l1!=null){
//            return l1;
//        }else {
//            return l2;
//        }
//        return resultNode;
//    }

    private ListNode addNode(ListNode tailNode, ListNode newNode){
        tailNode.next = newNode;
        ListNode tempNode = tailNode;
        tailNode = tempNode.next;
        return tailNode;
    }

    public ListNode mergeKLists(ListNode[] lists) {
        if (lists == null || lists.length == 0)
            return null;
        return mergeKLists(lists, 0, lists.length - 1);
    }
    private ListNode mergeKLists(ListNode[] lists, int start, int end) {
        if (start == end) {
            return lists[start];
        } else if (start < end){
            int mid = (end - start) / 2 + start;
            ListNode left = mergeKLists(lists, start, mid);
            ListNode right = mergeKLists(lists, mid + 1, end);
            return mergeTwoLists(left, right);
        } else {
            return null;
        }
    }


    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if (l1 == null)
            return l2;
        if (l2 == null)
            return l1;

        ListNode mergeNode;
        if (l1.val<l2.val) {
            mergeNode = l1;
            mergeNode.next = mergeTwoLists(l1.next, l2);
        } else {
            mergeNode = l2;
            mergeNode.next = mergeTwoLists(l1, l2.next);
        }
        return mergeNode;
    }
}