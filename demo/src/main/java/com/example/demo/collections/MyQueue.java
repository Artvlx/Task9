package com.example.demo.collections;
public class MyQueue {
    private class Node {
        Object value;
        Node next;
        Node(Object value) {
            this.value = value;
        }
    }
    private Node head;
    private Node tail;
    private int size;
    public void add(Object value) {
        Node newNode = new Node(value);
        if (tail == null) {
            head = tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }
        size++;
    }
    public void clear() {
        head = tail = null;
        size = 0;
    }
    public int size() {
        return size;
    }
    public Object peek() {
        if (head == null) throw new IllegalStateException("Queue is empty");
        return head.value;
    }
    public Object poll() {
        if (head == null) throw new IllegalStateException("Queue is empty");
        Object value = head.value;
        head = head.next;
        if (head == null) tail = null;
        size--;
        return value;
    }
}