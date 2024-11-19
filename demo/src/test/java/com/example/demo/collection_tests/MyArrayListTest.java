package com.example.demo.collection_tests;

import com.example.demo.Task9App;
import com.example.demo.collections.MyArrayList;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest(classes = Task9App.class)
class MyArrayListTest {

    @Test
    void testAddAndGet() {
        MyArrayList list = new MyArrayList();
        list.add("Item1");
        list.add("Item2");
        assertEquals("Item1", list.get(0));
        assertEquals("Item2", list.get(1));
    }

    @Test
    void testRemove() {
        MyArrayList list = new MyArrayList();
        list.add("Item1");
        list.add("Item2");
        list.remove(0);
        assertEquals(1, list.size());
        assertEquals("Item2", list.get(0));
    }

    @Test
    void testClear() {
        MyArrayList list = new MyArrayList();
        list.add("Item1");
        list.clear();
        assertEquals(0, list.size());
    }

    @Test
    void testSize() {
        MyArrayList list = new MyArrayList();
        list.add("Item1");
        list.add("Item2");
        assertEquals(2, list.size());
    }
}