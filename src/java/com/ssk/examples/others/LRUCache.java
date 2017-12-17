package com.ssk.examples.others;

import java.util.HashMap;

public class LRUCache {private int maxSize = 0;
    public int size = 0;
    private Node head;
    private Node tail;
    private HashMap<Integer, Node> map = new HashMap<Integer, Node>();

    public LRUCache(int capacity) {
        this.maxSize = capacity;
    }

    public int get(int key) {
        if (map.containsKey(key)) {
            Node n = map.get(key);
            remove(n);
            setHead(n);
            return n.value;
        }
        return -1;
    }

    public void set(int key, int value) {
        if (map.containsKey(key)) {
            Node old = map.get(key);
            old.value = value;
            remove(old);
            setHead(old);
        } else {
            Node created = new Node(key, value);
            if (map.size() >= maxSize) {
                map.remove(tail.key);
                remove(tail);
                setHead(created);

            } else {
                setHead(created);
            }

            map.put(key, created);
        }
    }

    private void remove(Node n) {
        if (n.previous != null) {
            n.previous.next = n.next;
        } else {
            head = n.next;
        }
        if (n.next != null) {
            n.next.previous = n.previous;
        } else {
            tail = n.previous;
        }
    }

    public void setHead(Node n) {
        n.next = head;
        n.previous = null;
        if (head != null)
            head.previous = n;
        head = n;
        if (tail == null)
            tail = head;
    }
    public class Node{
        public int key;
        public int value;
        public Node next;
        public Node previous;
        public Node(int key, int value) {
            this.key = key;
            this.value = value;
        }
    }
}
