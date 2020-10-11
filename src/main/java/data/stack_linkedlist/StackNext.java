package data.stack_linkedlist;

import java.util.Optional;

/**
 * Read top of stack is left e.g.
 * top (c) -> b -> bottom (a) -> null
 *
 * @param <T>
 */
public class StackNext<T> {

    NodeNext<T> top;
    NodeNext<T> bottom;
    int length;
    // Push

    // Pop

    // lookup

    public StackNext() {
    }

    public NodeNext<T> push(T value) {
        final NodeNext<T> node = new NodeNext<>(value);


        if (isEmpty()) {
            System.out.printf("push value to empty stack %s\n", value);
            // init stack
            //
            // 1 T B
            top = node;
            bottom = node;

        } else {
            System.out.printf("push value to stack %s\n", value);
            // 3 T
            // 2
            // 1 B
            // new node\
            NodeNext<T> holdingPointer = top;
            top = node; // new top
            top.next = holdingPointer;
        }
        //
        length++;
        return node;
    }

    public Optional<T> pop() {
        if (isEmpty()) {
            return Optional.empty();
        }
        // get value from top
        T value = top.value;

        // remove from stack
        top = top.next;

        // decrement
        length--;

        return Optional.ofNullable(value);
    }

    public Optional<T> peek() {
        if (isEmpty()) {
            return null;
        }
        // get value from top
        T value = top.value;

        return Optional.ofNullable(value);
    }

    public boolean isEmpty() {
        return (length == 0);
    }

    public int getLength() {
        return length;
    }
}
