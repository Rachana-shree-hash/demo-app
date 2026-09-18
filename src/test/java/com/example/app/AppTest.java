package com.example.app;

import org.junit.Test;
import static org.junit.Assert.*;

public class AppTest {

    @Test
    public void testGreet() {
        assertEquals("Hello, Student!", App.greet("Student"));
    }
}