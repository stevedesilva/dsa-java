package data.list;

public class DoublyLinkedList<T> {

    private int length;
    private DNode head;
    private DNode tail;

    public DoublyLinkedList(DNode head) {
        this.head = head;
        this.tail = head;
        length++;
    }

    @Override
    public String toString() {
        return "DoublyLinkedList{" +
                "length=" + length +
                ", head=" + head +
                ", tail=" + tail +
                '}';
    }

    public int getLength() {
        return this.length;
    }

    public DNode getHead() {
        return head;
    }

    public DNode getTail() {
        return tail;
    }

    // H(A) <- B <- T(C) <- null
    public void append(T value) {
        DNode<T> newNode = new DNode<>(value, this.tail);
        // point current tail to new node
        this.tail.next = newNode;

        // tail becomes new node
        this.tail = newNode;
        this.length++;
    }

    public void prepend(T value) {
        // create new head
        DNode<T> node = new DNode<>(value,null);
        // node equals current head
        node.next = head;
        // update prev node in current head
        head.prev = node;

        // make new node head
        head = node;
        length++;
    }

    public void remove(int index) {
        // 1 -> 2 -> 3->null
        if (index < 0 || index >= length) {
            System.out.println("out of bounds");
            return;
        }
        if (index == 0) {
            System.out.println("Remove first node");
            // 1 -> 2 -> 3 -> null
            head = head.next;
            head.prev = null; // new head points no null prev
            length--;
            return;
        }


        DNode<T> current = head;
        int counter = 0;
        while (current != null) {
            if (counter == index) {
                DNode<T> previous = current.prev;
                if (index == length - 1) {
                    System.out.println("Remove last node");
                    previous.next = null;
                    tail = previous; // set new tail
                } else {
                    // set item to next item in the list
                    previous.next = current.next;
                }
                length--;
                return;
            }
            counter++;
            current = current.next;
        }
    }

    public void insert(int index, T value) {
        // 1 -> 4 -> 5 = 1 -> 3 -> 4 -> 5

        if (index >= length) {
            // append
            this.append(value);
            return;
        }

        if (index <= 1) {
            this.prepend(value);
            return;
        }

        DNode<T> current = head;

        // find node at index
        int counter = 0;
        while (current != null) {
            if (counter == index) {

                // create node update to point to previous current, and node pointed to by previous current
                DNode<T> node = new DNode<>(value,current.prev);
                node.next = current;

                // update previous node to point to current
                current.prev.next = node;

                // update current to point to node
                current.prev = node;


                length++;
            }
            current = current.next;
            counter++;
        }
    }


}
