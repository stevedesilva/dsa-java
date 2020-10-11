package data.list;


import java.lang.invoke.VarHandle;
import java.util.ArrayList;
import java.util.List;

public class LinkedList<T> {

    private Node<T> head;
    private Node<T> tail;
    private int length;

    public LinkedList(Node<T> head) {
        this.head = head;
        this.tail = head;
        this.length = 1;
    }

    @Override
    public String toString() {
        return "LinkedList{" +
                "head=" + head +
                ", tail=" + tail +
                ", length=" + length +
                '}';
    }

    public int getLength() {
        return this.length;
    }

    // H(A) <- B <- T(C) <- null
    public void append(T value) {
        Node<T> newNode = new Node<>(value);
        // point current tail to new node
        this.tail.next = newNode;
        // tail becomes new node
        this.tail = newNode;
        this.length++;
    }

    public void prepend(T value) {
        // create new head
        Node<T> node = new Node<>(value);
        // node equals current head
        node.next = head;
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
            length--;
            return;
        }


        Node<T> current = head;
        int counter = 0;
        while (current != null) {
            if (counter == index - 1) {
                Node<T> toRemove = current.next;
                if (index == length - 1) {
                    System.out.println("Remove last node");
                    current.next = null;
                    tail = current; // set new tail
                } else {
                    // set item to next item in the list
                    current.next = toRemove.next;
                }
                length--;
                return;
            }
            counter++;
            current = current.next;
        }
    }

    public Node<T> getHead() {
        return head;
    }

    public Node<T> getTail() {
        return tail;
    }

//    public void insert(int index, int value) {
//        if (index < 0 || index > length) {
//            System.err.println("Index Out Of Bounds For Length " + length);
//        } else if (index == 0) {
//            prepend(value);
//        } else if (index == length) {
//            append(value);
//        } else {
//            Node current = head;
//            for (int i = 0; i < index - 1; i++) {
//                current = current.next;
//            }
//            Node newNode = new Node(value);
//            newNode.next = current.next;
//            current.next = newNode;
//            length++;
//        }
//    }

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

        Node<T> current = head;

        // find node at index
        int counter = 0;
        while (current != null) {
            if (counter == index - 1) {
                Node next = current.next;
                // create node
                Node<T> node = new Node<>(value);
                current.next = node;

                node.next = next;
                length++;
            }
            current = current.next;
            counter++;
        }
    }

//    public void insert(int index, T value) {
//        // 1 -> 4 -> 5 = 1 -> 3 -> 4 -> 5
//
//        if (index >= length) {
//            // append
//            this.append(value);
//            return;
//        }
//
//        if (index <= 1) {
//            this.prepend(value);
//            return;
//        }
//
//        Node<T> current = head;
//        Node<T> prev = head;
//        // find node at index
//        int counter = 0;
//        while(current != null) {
//            if (counter == index) {
//                // create node
//                Node<T> node = new Node<>(value);
//                prev.next = node;
//                node.next = current;
//                length++;
//            }
//            prev = current;
//            current = current.next;
//            counter++;
//        }
//    }


//    public void insert(int index, T value) {
//        // 1 -> 4 -> 5 = 1 -> 3 -> 4 -> 5
//
//        if (index >= length) {
//            // append
//            this.append(value);
//            return;
//        }
//
//        if (index <= 1) {
//            this.prepend(value);
//            return;
//        }
//
//        Node<T> current = head;
//        Node<T> prev = head;
//        // find node at index
//        int counter = 0;
//        while(current != null) {
//            if (counter == index) {
//                // create node
//                Node<T> node = new Node<>(value);
//                prev.next = node;
//                node.next = current;
//                length++;
//            }
//            prev = current;
//            current = current.next;
//            counter++;
//        }
//    }

//    public List<T> printList() {
//        List<T> result = new ArrayList<>();
//        Node<T> current = this.head;
//        while (current != null) {
//            // add to array
//            T value = current.value;
//            result.add(value);
//            System.out.println(value);
//            current = current.next;
//        }
//
//        return result;
//    }

//    public int[] printList() {
//
//    }

    public int[] printList() {
        int[] myList = new int[length];
        Node current = this.head;
        int i = 0;
        while (current != null) {
            myList[i] = (Integer) current.value;
            current = current.next;
            i++;
        }
        return myList;
    }

//    public LinkedList<T> reverse() {
//        Node<T> head = this.head;
//        Node<T> newHead = new Node<>(head.value);
//        LinkedList<T> list = new LinkedList<>(newHead);
//
//        Node<T> current = head;
//        while (current.next != null) { // while there is more to process
//            current = current.next;
//            // add to head
//            list.prepend(current.value);
//        }
////        // disconnect tail from old list
////        list.tail.next = null;
//
//        return list;
//    }

    /**
     * We prepend as we traverse the list
     * reverseOnSpace
     *
     * @return
     */
    public LinkedList<T> reverse() {
        Node<T> head = this.head;

        Node<T> newHead = new Node<>(head.value); //
        LinkedList<T> newlist = new LinkedList<>(newHead);

        Node<T> current = head;
        while (current.next != null) { // while there is more to process
            current = current.next;
            // add to head
            Node<T> node = new Node<>(current.value);
            node.next = newlist.head;
            newlist.head = node;
            newlist.length++;

        }

        return newlist;
    }
//    // 1 -> 2 ->  t3 -> 4 -> 5 -> null
//    public LinkedList<T> reverse() {
//
//        // if only one item return
//        if (this.head.next == null) {
//            return this;
//        }
//        // get first node after head
//        Node<T> first = head.next;
//        this.tail = head;
//
//        Node<T> second = first.next;
//        while(second != null) {
//            var temp = second.next; // ref to 3rd element
//            second.next = first;
//            first = second;
//            second = temp;
//        }
//
//        this.head.next = null;
//        this.head = first;
//
//
//        return this;
//    }


}
