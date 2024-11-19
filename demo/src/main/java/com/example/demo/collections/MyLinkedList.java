package com.example.demo.collections;
public class MyLinkedList {
    private class Node {
        Object value;
        Node next;
        Node prev;
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
            newNode.prev = tail;
            tail = newNode;
        }
        size++;
    }
    public void remove(int index) {
        if (index < 0 || index >= size) throw new IndexOutOfBoundsException();
        Node current = getNode(index);
        if (current.prev != null) current.prev.next = current.next;
        if (current.next != null) current.next.prev = current.prev;
        if (current == head) head = current.next;
        if (current == tail) tail = current.prev;
        size--;
    }
    public void clear() {
        head = tail = null;
        size = 0;
    }
    public int size() {
        return size;
    }
    public Object get(int index) {
        return getNode(index).value;
    }
    private Node getNode(int index) {
        if (index < 0 || index >= size) throw new IndexOutOfBoundsException();
        Node current = head;
        for (int i = 0; i < index; i++) current = current.next;
        return current;
    }
}