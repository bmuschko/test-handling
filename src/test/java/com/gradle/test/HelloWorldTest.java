package com.gradle.test;

import org.junit.Test;
import static org.junit.Assert.*;

public class HelloWorldTest {
    @Test
    public void testGetMessage() {
        HelloWorld helloWorld = new HelloWorld();
        assertEquals(helloWorld.getMessage(), "Hello World!");
    }
    
    @Test
    public void testExit() {
        System.exit(1);
        fail("This should NEVER be printed!");        
    }
}