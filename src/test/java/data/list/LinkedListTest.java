package data.list;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class LinkedListTest {

    @Test
    public void CreateNodeWithInteger() {
        Node<Integer> head = new Node<>(10);
        LinkedList linkedList = new LinkedList(head);
        System.out.println(linkedList);
        assertNotNull(linkedList);
        assertEquals(1, linkedList.getLength());


    }

    @Test
    public void AppendIntegerValueToNode() {
        Node<Integer> head = new Node<>(10);
        LinkedList<Integer> linkedList = new LinkedList<>(head);
        System.out.println(linkedList);

        linkedList.append(20);
        linkedList.append(30);
        assertNotNull(linkedList);
        assertEquals(3, linkedList.getLength());

        assertEquals(10, linkedList.getHead().value);
        assertEquals(20, linkedList.getHead().next.value);
        assertEquals(30, linkedList.getTail().value);

    }

    @Test
    public void PrependIntegerValueToNode() {
        // 1 <- 5 <- 10 <- null
        Node<Integer> head = new Node<>(10);
        LinkedList<Integer> linkedList = new LinkedList<>(head);
        System.out.println(linkedList);
//        System.out.println(linkedList.printList());

        linkedList.prepend(5);
        linkedList.prepend(1);

        assertNotNull(linkedList);
        assertEquals(3, linkedList.getLength());

        assertEquals(1, linkedList.getHead().value);
        assertEquals(5, linkedList.getHead().next.value);
        assertEquals(10, linkedList.getTail().value);

    }


    @Test
    public void InsertIntegerValueAtIndex() {
        // 1 <- 5 <- 10 <- null
        Node<Integer> head = new Node<>(1);
        LinkedList<Integer> linkedList = new LinkedList<>(head);
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
        assertEquals(10, linkedList.getTail().value);

    }

    @Test
    public void AppendIfIndexGreaterThanLength() {
        // 1 <- 5 <- 10 <- null
        Node<Integer> head = new Node<>(1);
        LinkedList<Integer> linkedList = new LinkedList<>(head);
        System.out.println(linkedList);
        linkedList.append(5);
        linkedList.append(10);

        // insert 7 at index 3
        linkedList.insert(10, 7);


        assertNotNull(linkedList);
        assertEquals(4, linkedList.getLength());

        assertEquals(1, linkedList.getHead().value);
        assertEquals(5, linkedList.getHead().next.value);
        assertEquals(7, linkedList.getTail().value);


    }

    @Test
    public void PrependIfIndexFirstElement() {
        // 1 <- 5 <- 10 <- null
        Node<Integer> head = new Node<>(1);
        LinkedList<Integer> linkedList = new LinkedList<>(head);
        System.out.println(Arrays.toString(linkedList.printList()));
        linkedList.append(5);
        linkedList.append(10);

        // insert 7 at index 3
        linkedList.insert(1, 7);


        assertNotNull(linkedList);
        assertNotNull(linkedList);

        assertEquals(7, linkedList.getHead().value);
        assertEquals(1, linkedList.getHead().next.value);
        assertEquals(5, linkedList.getHead().next.next.value);
        assertEquals(10, linkedList.getTail().value);


    }

    @Test
    public void DeleteIndexMiddleElement() {
        // 1 <- 5 <- 10 <- null
        Node<Integer> head = new Node<>(1);
        LinkedList<Integer> linkedList = new LinkedList<>(head);
//        System.out.println(Arrays.toString(linkedList.printList()));
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
    public void DeleteIndexOutoffbounds() {
        // 1 <- 5 <- 10 <- null
        Node<Integer> head = new Node<>(1);
        LinkedList<Integer> linkedList = new LinkedList<>(head);
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
        Node<Integer> head = new Node<>(1);
        LinkedList<Integer> linkedList = new LinkedList<>(head);
        linkedList.append(5);
        linkedList.append(10);

        linkedList.remove(0);


        assertEquals(2, linkedList.getLength());
        assertEquals(5, linkedList.getHead().value);
        assertEquals(10, linkedList.getTail().value);

    }

    @Test
    public void DeleteLastItem() {
        // 1 <- 5 <- 10 <- null
        LinkedList<Integer> linkedList = new LinkedList<>(new Node<Integer>(1));
        linkedList.append(5);
        linkedList.append(10);

        linkedList.remove(2);


        assertEquals(2, linkedList.getLength());
        assertEquals(1, linkedList.getHead().value);
        assertEquals(5, linkedList.getTail().value);

    }


    @Test
    public void ReverseList() {
        // 1 -> 2 ->  3 -> 4 -> 5 -> null
        Node<Integer> head = new Node<>(1);
        LinkedList<Integer> linkedList = new LinkedList<>(head);
//        System.out.println(Arrays.toString(linkedList.printList()));
        linkedList.append(2);
        linkedList.append(3);
        linkedList.append(4);
        linkedList.append(5);

        LinkedList<Integer> rlinkedList = linkedList.reverse();

        assertNotNull(rlinkedList);
        assertEquals(5,rlinkedList.getLength());

        assertEquals(5, rlinkedList.getHead().value);
        assertEquals(4, rlinkedList.getHead().next.value);
        assertEquals(3, rlinkedList.getHead().next.next.value);
        assertEquals(2, rlinkedList.getHead().next.next.next.value);
        assertEquals(1, rlinkedList.getTail().value);
        assertNull(rlinkedList.getTail().next);


    }

    @Test
    public void ReverseListSingleElement() {
        // 1 -> 2 ->  3 -> 4 -> 5 -> null
        Node<Integer> head = new Node<>(1);
        LinkedList<Integer> linkedList = new LinkedList<>(head);


        LinkedList<Integer> rlinkedList = linkedList.reverse();

        assertNotNull(rlinkedList);
        assertEquals(1,rlinkedList.getLength());

        assertEquals(1, rlinkedList.getHead().value);
        assertEquals(1, rlinkedList.getTail().value);
        assertNull(rlinkedList.getTail().next);


    }

    @Test
    public void ReverseList2Element() {
        // 1 -> 2 -> null === 2 -> 1 -> null
        Node<Integer> head = new Node<>(1);
        LinkedList<Integer> linkedList = new LinkedList<>(head);
        linkedList.append(2);

        LinkedList<Integer> rlinkedList = linkedList.reverse();


        assertNotNull(rlinkedList);
        assertEquals(2,rlinkedList.getLength());




        assertEquals(2, rlinkedList.getHead().value);
        assertEquals(1, rlinkedList.getTail().value);
        assertNull(rlinkedList.getTail().next);


    }


}