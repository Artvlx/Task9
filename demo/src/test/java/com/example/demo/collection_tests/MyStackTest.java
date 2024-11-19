package com.example.demo.collection_tests;

import com.example.demo.Task9App;
import com.example.demo.collections.MyStack;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest(classes = Task9App.class)
class MyStackTest {

    @Test
    void testPushAndPop() {
        MyStack stack = new MyStack();
        stack.push("Item1");
        stack.push("Item2");
        assertEquals("Item2", stack.pop());
        assertEquals("Item1", stack.pop());
    }

    @Test
    void testPeek() {
        MyStack stack = new MyStack();
        stack.push("Item1");
        assertEquals("Item1", stack.peek());
    }

    @Test
    void testClear() {
        MyStack stack = new MyStack();
        stack.push("Item1");
        stack.clear();
        assertEquals(0, stack.size());
    }

    @Test
    void testSize() {
        MyStack stack = new MyStack();
        stack.push("Item1");
        stack.push("Item2");
        assertEquals(2, stack.size());
    }
}