package data.tree.binarytree;

public class Node<T extends Comparable<T>> implements Comparable<Node<T>>{
    T value;
    Node<T> left;
    Node<T> right;

    public Node(T value) {
        this.value = value;
    }


    @Override
    public int compareTo(Node<T> o) {
        return value.compareTo(o.value);
    }
}
