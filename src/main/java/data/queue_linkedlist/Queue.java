package data.queue_linkedlist;

import javax.swing.text.html.Option;
import java.util.Optional;

public class Queue<T> {
    private int length;
    private Node<T> first;
    private Node<T> last;


    public boolean isEmpty() {
        return (length == 0);
    }

    public Node<T> enqueue(T value) {
        Node<T> node = new Node<>(value);

        if (isEmpty()) {
            first = node;
            last = node;
        }
        // point last item to node
        last.next = node;
        // move last pointer
        last = node;
        // increment length
        length++;
        return node;
    }

    public Optional<T> peek() {
        if (isEmpty()) {
            return Optional.empty();
        }

        return Optional.ofNullable(first.value);

    }

    public Optional<T> dequeue() {
        if (isEmpty()) {
            return Optional.empty();
        }

        Node<T> node = first;
        // make the next item first
        first = node.next;

        if (length == 1) {
            // set last to null since node will be removed
            last = null;
        }

        // decrement
        length--;
        return Optional.ofNullable(node.value);

    }

    public int getLength() {
        return length;
    }

    public Node<T> getFirst() {
        return first;
    }

    public Node<T> getLast() {
        return last;
    }
}
