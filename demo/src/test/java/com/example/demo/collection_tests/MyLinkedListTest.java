package com.example.demo.collection_tests;

import com.example.demo.Task9App;
import com.example.demo.collections.MyLinkedList;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest(classes = Task9App.class)
class MyLinkedListTest {

    @Test
    void testAddAndGet() {
        MyLinkedList list = new MyLinkedList();
        list.add("Node1");
        list.add("Node2");
        assertEquals("Node1", list.get(0));
        assertEquals("Node2", list.get(1));
    }

    @Test
    void testRemove() {
        MyLinkedList list = new MyLinkedList();
        list.add("Node1");
        list.add("Node2");
        list.remove(0);
        assertEquals(1, list.size());
        assertEquals("Node2", list.get(0));
    }

    @Test
    void testClear() {
        MyLinkedList list = new MyLinkedList();
        list.add("Node1");
        list.clear();
        assertEquals(0, list.size());
    }

    @Test
    void testSize() {
        MyLinkedList list = new MyLinkedList();
        list.add("Node1");
        list.add("Node2");
        assertEquals(2, list.size());
    }
}