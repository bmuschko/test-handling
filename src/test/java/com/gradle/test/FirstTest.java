package com.gradle.test;

import org.junit.Test;
import static org.junit.Assert.*;

public class FirstTest {
    @Test
    public void testFirst1() {
        HelloWorld helloWorld = new HelloWorld();
        assertEquals(helloWorld.getMessage(), "Hello World!");
    }
    
    @Test
    public void testFirst2() {
        HelloWorld helloWorld = new HelloWorld();
        assertEquals(helloWorld.getMessage(), "Hello World!");
    }
}