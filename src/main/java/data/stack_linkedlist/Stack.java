package data.stack_linkedlist;

import java.util.Optional;

public class Stack<T> {

    Node<T> top;
    Node<T> bottom;
    int length;
    // Push

    // Pop

    // lookup

    public Stack() {
//        this.top =;
//        this.bottom;
//        length = 0;

    }

    public Node<T> push(T value) {
        final Node<T> node = new Node<>(value);


        if (isEmpty()) {
            System.out.printf("push value to empty stack %s\n",value);
            // init stack
            //
            // 1 T B
            top = node;
            bottom = node;

        } else {
            System.out.printf("push value to stack %s\n",value);
            // 3 T
            // 2
            // 1 B
            // new node\
            node.prev = top;
            top = node;
        }
        //
        length++;
        return node;
    }

    public Optional<T> pop() {
        if (isEmpty()) {
            return Optional.empty();
        }

        if (length == 1) {
            bottom = null;
        }
            // get value from top
        T value = top.value;


        // remove from stack
        top = top.prev;

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

}
