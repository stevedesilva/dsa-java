package data.stack_linkedlist;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


class StackNextTest {

    @Test
    void push() {
        StackNext<Integer> stack = new StackNext<>();

        NodeNext<Integer> a = stack.push(1);
        assertEquals(1,a.value);
        assertNull(a.next);

        NodeNext<Integer> b = stack.push(2);
        assertEquals(2,b.value);
        assertEquals(1,b.next.value);


        NodeNext<Integer> c = stack.push(3);
        assertEquals(3,c.value);
        assertEquals(2,c.next.value);

        assertEquals(3,stack.getLength());

    }

    @Test
    void popRemovesItemFromTheStack() {
        StackNext<Integer> stack = new StackNext<>();

        stack.push(1);
        stack.push(2);
        stack.push(3);
        assertEquals(3,stack.length);

        assertEquals(3,stack.pop().get());
        assertEquals(2,stack.length);

        assertEquals(2,stack.pop().get());
        assertEquals(1,stack.length);

        assertEquals(1,stack.pop().get());
        assertEquals(0,stack.length);
        assertTrue(stack.isEmpty());


    }

    @Test
    void peekShouldNotRemoveItemsFromStack() {
        Stack<Integer> stack = new Stack<>();

        stack.push(1);
        stack.push(2);
        stack.push(3);
        assertEquals(3,stack.length);

        assertEquals(3,stack.peek().get());
        assertEquals(3,stack.length);

        assertEquals(3,stack.peek().get());
        assertEquals(3,stack.length);

    }

    @Test
    void peekShouldNotRemoveItemsFromStackWhenEmpty() {
        Stack<Integer> stack = new Stack<>();


        assertEquals(0,stack.length);

        assertFalse(stack.pop().isPresent());
        assertEquals(0,stack.length);

    }

    @Test
    void isEmptyReturnsTrue() {
        Stack<Integer> stack = new Stack<>();
        assertTrue(stack.isEmpty());

    }
}