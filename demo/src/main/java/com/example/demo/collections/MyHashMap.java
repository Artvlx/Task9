package com.example.demo.collections;
public class MyHashMap {
    private static class Node {
        Object key;
        Object value;
        Node next;
        Node(Object key, Object value) {
            this.key = key;
            this.value = value;
        }
    }
    private Node[] table;
    private int size;
    private static final int INITIAL_CAPACITY = 16;
    public MyHashMap() {
        table = new Node[INITIAL_CAPACITY];
    }
    public void put(Object key, Object value) {
        int index = getIndex(key);
        Node current = table[index];
        while (current != null) {
            if (current.key.equals(key)) {
                current.value = value;
                return;
            }
            current = current.next;
        }
        Node newNode = new Node(key, value);
        newNode.next = table[index];
        table[index] = newNode;
        size++;
    }
    public void remove(Object key) {
        int index = getIndex(key);
        Node current = table[index];
        Node prev = null;
        while (current != null) {
            if (current.key.equals(key)) {
                if (prev == null) {
                    table[index] = current.next;
                } else {
                    prev.next = current.next;
                }
                size--;
                return;
            }
            prev = current;
            current = current.next;
        }
    }
    public void clear() {
        table = new Node[INITIAL_CAPACITY];
        size = 0;
    }
    public int size() {
        return size;
    }
    public Object get(Object key) {
        int index = getIndex(key);
        Node current = table[index];
        while (current != null) {
            if (current.key.equals(key)) return current.value;
            current = current.next;
        }
        return null;
    }
    private int getIndex(Object key) {
        return key.hashCode() % table.length;
    }
}