package com.test.leetcode.linkedlist;

import java.util.HashMap;
import java.util.Map;

//146 LRU缓存
class LRUCache {
    class DLinkNode{
        int key;
        int value;
        DLinkNode prev;
        DLinkNode next;
        public DLinkNode(){};
        public DLinkNode(int _key, int _value){
            this.key = _key;
            this.value = _value;
        }
    }

    Map<Integer, DLinkNode> cache = new HashMap<Integer, DLinkNode>();
    int size;
    int capacity;
    DLinkNode head, tail;

    public LRUCache(int capacity) {
        this.size =0;
        this.capacity = capacity;
        this.head = new DLinkNode();
        this.tail = new DLinkNode();
        head.next = tail;
        tail.prev = head;
    }

    public int get(int key) {
        DLinkNode node = cache.get(key);
        if (node == null){
            return -1;
        }

        moveToHead(node);
        return node.value;
    }

    public void put(int key, int value) {
        DLinkNode node = cache.get(key);
        if (node == null){
            DLinkNode newNode = new DLinkNode(key,value);
            cache.put(key, newNode);
            addToHead(newNode);
            ++size;
            if (size > capacity){
                DLinkNode removeNode = removeFromTail();
                cache.remove(removeNode.key);
                --size;
            }
        }
        else{
            node.value = value;
            moveToHead(node);
        }

    }

    public void addToHead(DLinkNode node){
        node.prev = head;
        node.next = head.next;
        head.next.prev = node;
        head.next = node;
    }

    private DLinkNode removeFromTail(){
        DLinkNode tailNode = tail.prev;
        removeNode(tailNode);
        return tailNode;
    }

    private void moveToHead(DLinkNode node) {
        removeNode(node);
        addToHead(node);
    }

    private void removeNode(DLinkNode node) {
        node.prev.next = node.next;
        node.next.prev = node.prev;
    }
}
