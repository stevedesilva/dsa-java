package data.list;

public class Node<T> {
    T value; // T is called type parameter
    Node next;

    public Node(T value) {
        this.value = value;
        this.next = null;
    }

    @Override
    public String toString() {
        return "Node{" +
                "value=" + value +
                ", next=" + next +
                '}';
    }


}
