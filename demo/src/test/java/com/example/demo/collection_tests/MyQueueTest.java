package com.example.demo.collection_tests;

import com.example.demo.Task9App;
import com.example.demo.collections.MyQueue;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest(classes = Task9App.class)
class MyQueueTest {

    @Test
    void testAddAndPoll() {
        MyQueue queue = new MyQueue();
        queue.add("Element1");
        queue.add("Element2");
        assertEquals("Element1", queue.poll());
        assertEquals("Element2", queue.poll());
    }

    @Test
    void testPeek() {
        MyQueue queue = new MyQueue();
        queue.add("Element1");
        assertEquals("Element1", queue.peek());
    }

    @Test
    void testClear() {
        MyQueue queue = new MyQueue();
        queue.add("Element1");
        queue.clear();
        assertEquals(0, queue.size());
    }

    @Test
    void testSize() {
        MyQueue queue = new MyQueue();
        queue.add("Element1");
        queue.add("Element2");
        assertEquals(2, queue.size());
    }
}