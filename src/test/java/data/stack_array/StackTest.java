package data.stack_array;


import data.stack_linkedlist.NodeNext;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StackTest {
    @Test
    void peekShouldNotRemoveItemsFromStackWhenEmpty() {

        Stack<Integer> stack = new Stack<>();

        assertEquals(0, stack.getLength());

        assertFalse(stack.pop().isPresent());
        assertEquals(0, stack.getLength());

    }



    @Test
    void isEmptyReturnsTrue() {
        Stack<Integer> stack = new Stack<>();
        assertTrue(stack.isEmpty());

    }

    @Test
    void push() {
        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        assertEquals(3, stack.getLength());

    }

    @Test
    void pop() {
        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        assertEquals(3, stack.getLength());

        assertEquals(3, stack.pop().get());
        assertEquals(2, stack.pop().get());
        assertEquals(1, stack.pop().get());

        assertEquals(0, stack.getLength());

    }

    @Test
    void popString() {
        Stack<String> stack = new Stack<>();
        stack.push("a");
        stack.push("b");
        stack.push("c");
        assertEquals(3, stack.getLength());

        assertEquals("c", stack.pop().get());
        assertEquals("b", stack.pop().get());
        assertEquals("a", stack.pop().get());

        assertEquals(0, stack.getLength());

    }
}