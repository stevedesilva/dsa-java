package data.queue_linkedlist;

import org.junit.jupiter.api.Test;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;

class QueueTest {

    @Test
    void QueueWhenEmptyReturnTrue() {
        Queue<Integer> queue = new Queue<>();
        assertTrue(queue.isEmpty());
    }

    @Test
    void QueueWhenEnqueueAddItemOne() {
        // 1 -> 2 -> 3 -> null
        Queue<Integer> queue = new Queue<>();
        Node<Integer> node = queue.enqueue(1);
        assertEquals(1, node.value);
        assertEquals(1, queue.getFirst().value);
        assertEquals(1, queue.getLast().value);
        assertEquals(1, queue.getLength());
    }

    @Test
    void QueueWhenEnqueueAddItemTwo() {
        // 1 -> 2 -> 3 -> null
        Queue<Integer> queue = new Queue<>();
        Node<Integer> node = queue.enqueue(1);
        assertEquals(1, node.value);
        assertEquals(1, queue.getFirst().value);
        assertEquals(1, queue.getLast().value);
        assertEquals(1, queue.getLength());


        Node<Integer> node2 = queue.enqueue(2);
        assertEquals(2, node2.value);
        assertEquals(1, queue.getFirst().value);
        assertEquals(2, queue.getLast().value);
        assertEquals(2, queue.getLength());

    }

    @Test
    void QueueWhenEnqueueAddItemThree() {
        // 1 -> 2 -> 3 -> null
        Queue<Integer> queue = new Queue<>();
        Node<Integer> node = queue.enqueue(1);
        assertEquals(1, node.value);
        assertEquals(1, queue.getFirst().value);
        assertEquals(1, queue.getLast().value);
        assertEquals(1, queue.getLength());


        Node<Integer> node2 = queue.enqueue(2);
        assertEquals(2, node2.value);
        assertEquals(1, queue.getFirst().value);
        assertEquals(2, queue.getLast().value);
        assertEquals(2, queue.getLength());

        Node<Integer> node3 = queue.enqueue(3);
        assertEquals(3, node3.value);
        assertEquals(1, queue.getFirst().value);
        assertEquals(3, queue.getLast().value);
        assertEquals(3, queue.getLength());

    }


    @Test
    void QueueWhenEmptyPeekShouldReturnEmpty() {
        // 1 -> 2 -> 3 -> null
        Queue<Integer> queue = new Queue<>();


        assertFalse(queue.peek().isPresent());
        assertEquals(0, queue.getLength());
    }

    @Test
    void QueueWhenPeekShouldShowFirstItemValueWithOutRemovingItem() {
        // 1 -> 2 -> 3 -> null
        Queue<Integer> queue = new Queue<>();

        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);

        assertEquals(3, queue.getLength());

        assertTrue(queue.peek().isPresent());
        Integer firstVal = queue.peek().get();
        assertEquals(1, firstVal);
        assertEquals(3, queue.getLength());
    }

    @Test
    void QueueWhenEmptyPopShouldReturnEmpty() {
        // 1 -> 2 -> 3 -> null
        Queue<Integer> queue = new Queue<>();

        assertEquals(0, queue.getLength());
        assertFalse(queue.dequeue().isPresent());
    }

    @Test
    void DequeueShouldShowFirstItemValueRemovingItem() {
        // 1 -> 2 -> 3 -> null
        Queue<Integer> queue = new Queue<>();

        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);

        Optional<Integer> first = queue.dequeue();

        assertEquals(2, queue.getLength());
        assertTrue(first.isPresent());
        assertEquals(1, first.get());

        // test pointers
        assertEquals(2, queue.getFirst().value);
        assertEquals(3, queue.getLast().value);

    }

    @Test
    void WhenAllItemsAreDequeueQueueIsEmpty() {
        // 1 -> 2 -> 3 -> null
        Queue<Integer> queue = new Queue<>();

        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);

        queue.dequeue();
        queue.dequeue();
        queue.dequeue();

        assertEquals(0, queue.getLength());
        assertTrue(queue.isEmpty());


        // test pointers
        assertNull(queue.getFirst());
        assertNull(queue.getLast());

    }


}