package com.example.demo.collection_tests;

import com.example.demo.Task9App;
import com.example.demo.collections.MyHashMap;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest(classes = Task9App.class)
class MyHashMapTest {

    @Test
    void testPutAndGet() {
        MyHashMap map = new MyHashMap();
        map.put("Key1", "Value1");
        map.put("Key2", "Value2");
        assertEquals("Value1", map.get("Key1"));
        assertEquals("Value2", map.get("Key2"));
    }

    @Test
    void testRemove() {
        MyHashMap map = new MyHashMap();
        map.put("Key1", "Value1");
        map.remove("Key1");
        assertNull(map.get("Key1"));
    }

    @Test
    void testClear() {
        MyHashMap map = new MyHashMap();
        map.put("Key1", "Value1");
        map.clear();
        assertEquals(0, map.size());
    }

    @Test
    void testSize() {
        MyHashMap map = new MyHashMap();
        map.put("Key1", "Value1");
        map.put("Key2", "Value2");
        assertEquals(2, map.size());
    }
}