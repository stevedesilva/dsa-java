package data.list;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DoublyLinkedListTest {


    @Test
    public void CreateDNodeWithInteger() {
        DNode<Integer> head = new DNode<>(10, null);
        DoublyLinkedList<Integer> linkedList = new DoublyLinkedList(head);
        System.out.println(linkedList);
        assertNotNull(linkedList);
        assertEquals(1, linkedList.getLength());
        assertNull(linkedList.getHead().next);
        assertNull(linkedList.getHead().prev);
        assertNull(linkedList.getTail().next);
        assertNull(linkedList.getTail().prev);
    }


    @Test
    public void AppendIntegerValueToDNode() {
        DNode<Integer> head = new DNode<>(10, null);
        DoublyLinkedList<Integer> linkedList = new DoublyLinkedList<>(head);
        System.out.println(linkedList);

        linkedList.append(20);
        linkedList.append(30);
        assertNotNull(linkedList);
        assertEquals(3, linkedList.getLength());

        assertEquals(10, linkedList.getHead().value);
        assertNull(linkedList.getHead().prev);

        assertEquals(20, linkedList.getHead().next.value);
        assertEquals(10, linkedList.getHead().next.prev.value);

        assertEquals(30, linkedList.getTail().value);
        assertEquals(20, linkedList.getTail().prev.value);

    }

    @Test
    public void PrependIntegerValueToNode() {
        DNode<Integer> head = new DNode<>(10, null);
        DoublyLinkedList<Integer> linkedList = new DoublyLinkedList<>(head);
        System.out.println(linkedList);

        linkedList.prepend(5);
        linkedList.prepend(1);

        assertNotNull(linkedList);
        assertEquals(3, linkedList.getLength());

        assertEquals(1, linkedList.getHead().value);
        assertNull(linkedList.getHead().prev);
        assertEquals(5, linkedList.getHead().next.value);
        assertEquals(1, linkedList.getHead().next.prev.value);

        assertEquals(10, linkedList.getTail().value);
        assertEquals(5, linkedList.getTail().prev.value);

    }

    @Test
    public void DeleteIndexOutoffbounds() {
        // 1 <- 5 <- 10 <- null
        DNode<Integer> head = new DNode<>(1, null);
        DoublyLinkedList<Integer> linkedList = new DoublyLinkedList<>(head);
//        System.out.println(Arrays.toString(linkedList.printList()));
        linkedList.append(5);
        linkedList.append(10);

        // insert 7 at index 3
        linkedList.remove(100);


        assertEquals(3, linkedList.getLength());
        assertEquals(1, linkedList.getHead().value);
        assertEquals(10, linkedList.getTail().value);


        linkedList.remove(-1);

        assertEquals(3, linkedList.getLength());
        assertEquals(1, linkedList.getHead().value);
        assertEquals(10, linkedList.getTail().value);
    }

    @Test
    public void DeleteFirstItem() {
        // 1 <- 5 <- 10 <- null
        DNode<Integer> head = new DNode<>(1, null);
        DoublyLinkedList<Integer> linkedList = new DoublyLinkedList<>(head);
        linkedList.append(5);
        linkedList.append(10);

        linkedList.remove(0);


        assertEquals(2, linkedList.getLength());
        assertNull(linkedList.getHead().prev);

        assertEquals(5, linkedList.getHead().value);
        assertEquals(10, linkedList.getHead().next.value);
        assertEquals(10, linkedList.getTail().value);

    }

    @Test
    public void DeleteIndexMiddleElement() {
        // 1 <- 5 <- 10 <- null
        DNode<Integer> head = new DNode<>(1, null);
        DoublyLinkedList<Integer> linkedList = new DoublyLinkedList<>(head);

        linkedList.append(5);
        linkedList.append(10);

        // insert 7 at index 3
        linkedList.remove(1);


        assertNotNull(linkedList);

        assertEquals(2, linkedList.getLength());
        assertEquals(1, linkedList.getHead().value);
        assertEquals(10, linkedList.getTail().value);


    }


    @Test
    public void DeleteLastItem() {
        // 1 <- 5 <- 10 <- null
        DNode<Integer> head = new DNode<>(1, null);
        DoublyLinkedList<Integer> linkedList = new DoublyLinkedList<>(head);
        linkedList.append(5);
        linkedList.append(10);

        linkedList.remove(2);


        assertEquals(2, linkedList.getLength());
        assertEquals(1, linkedList.getHead().value);
        assertEquals(5, linkedList.getTail().value);

    }

    @Test
    public void InsertIntegerValueAtIndex() {
        // 1 -> 5 -> 7 -> 10 -> null
        DNode<Integer> head = new DNode<>(1, null);
        DoublyLinkedList<Integer> linkedList = new DoublyLinkedList<>(head);
        System.out.println(linkedList);
        linkedList.append(5);
        linkedList.append(10);

        // insert 7 at index 3
        linkedList.insert(2, 7);


        assertNotNull(linkedList);
        assertEquals(4, linkedList.getLength());

        assertEquals(1, linkedList.getHead().value);
        assertEquals(5, linkedList.getHead().next.value);
        assertEquals(7, linkedList.getHead().next.next.value);
        assertEquals(5, linkedList.getHead().next.next.prev.value);
        assertEquals(10, linkedList.getTail().value);

    }

}