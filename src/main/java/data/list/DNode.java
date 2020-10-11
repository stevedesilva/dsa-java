package data.list;

public class DNode<T> {
    T value;
    DNode<T> next;
    DNode<T> prev;

    public DNode(T value, DNode<T> prev) {
        this.value = value;
        this.prev = prev;
        this.next = null;
    }


    @Override
    public String toString() {
        return "DNode{" +
                "value=" + value +
                ", next=" + next +
                ", prev=" + prev +
                '}';
    }


}
