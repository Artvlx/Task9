package com.example.demo;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertNotNull;

@SpringBootTest(classes = Task9App.class)
class ApplicationContextTest {

    @Autowired
    private Task9App task9App;

    @Test
    void contextLoads() {
        assertNotNull(task9App);
    }
}
