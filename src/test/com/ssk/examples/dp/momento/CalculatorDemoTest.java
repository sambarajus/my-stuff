package com.ssk.examples.dp.momento;

import org.junit.Test;

import static org.junit.Assert.*;

public class CalculatorDemoTest {
    CalculatorDemo demo = new CalculatorDemo();

    @Test
    public void performOperation() throws Exception {
        demo.performOperation(10, 20, "add");
        Calculator c = demo.undoOperation();
        assertEquals(10, c.getFirstValue());
        assertEquals(20, c.getSecondValue());
        assertEquals("add", c.getOperationType());
    }

    @Test
    public void performMultipleOperation() throws Exception {
        demo.performOperation(10, 20, "add");
        demo.performOperation(20, 30, "sub");
        demo.performOperation(30, 40, "sub");
        demo.performOperation(40, 50, "add");
        Calculator c4 = demo.undoOperation();
        assertEquals(40, c4.getFirstValue());
        assertEquals(50, c4.getSecondValue());
        assertEquals("add", c4.getOperationType());
        System.out.println(c4.toString());
        Calculator c3 = demo.undoOperation();
        assertEquals(30, c3.getFirstValue());
        assertEquals(40, c3.getSecondValue());
        assertEquals("sub", c3.getOperationType());
        System.out.println(c3.toString());
        Calculator c2 = demo.undoOperation();
        assertEquals(20, c2.getFirstValue());
        assertEquals(30, c2.getSecondValue());
        assertEquals("sub", c2.getOperationType());
        System.out.println(c2.toString());
        Calculator c1 = demo.undoOperation();
        assertEquals(10, c1.getFirstValue());
        assertEquals(20, c1.getSecondValue());
        assertEquals("add", c1.getOperationType());
        System.out.println(c1.toString());
    }

}