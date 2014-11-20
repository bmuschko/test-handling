package com.gradle.test;

import org.junit.Test;
import static org.junit.Assert.*;

public class OtherTest {
    @Test
    public void testOther1() {
        HelloWorld helloWorld = new HelloWorld();
        assertEquals(helloWorld.getMessage(), "Hello World!");
    }
    
    @Test
    public void testOther2() {
        HelloWorld helloWorld = new HelloWorld();
        assertEquals(helloWorld.getMessage(), "Hello World!");
    }
}