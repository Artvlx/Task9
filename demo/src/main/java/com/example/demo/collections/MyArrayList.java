package com.example.demo.collections;
import java.util.Arrays;
public class MyArrayList {
    private Object[] elements;
    private int size;
    public MyArrayList() {
        elements = new Object[10];
        size = 0;
    }
    public void add(Object value) {
        ensureCapacity();
        elements[size++] = value;
    }
    public void remove(int index) {
        if (index < 0 || index >= size) throw new IndexOutOfBoundsException();
        System.arraycopy(elements, index + 1, elements, index, size - index - 1);
        elements[--size] = null;
    }
    public void clear() {
        elements = new Object[10];
        size = 0;
    }
    public int size() {
        return size;
    }
    public Object get(int index) {
        if (index < 0 || index >= size) throw new IndexOutOfBoundsException();
        return elements[index];
    }
    private void ensureCapacity() {
        if (size == elements.length) {
            elements = Arrays.copyOf(elements, elements.length * 2);
        }
    }
}