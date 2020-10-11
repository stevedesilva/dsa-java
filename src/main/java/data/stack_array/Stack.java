package data.stack_array;

import javax.swing.text.html.Option;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Stack<T> {

    private List<T> stack = new ArrayList<>();

    public Stack() {
    }



    public Optional<T> pop() {
        if (isEmpty()){
            return Optional.empty();
        }
        T value = stack.remove(stack.size()-1);
        return Optional.ofNullable(value);
    }

    public void push(T value) {
        stack.add(value);
    }

    public boolean isEmpty() {
        return (stack.isEmpty());
    }

    public int getLength() {
        return stack.size();
    }

    public Optional<T> peek(){
        if (isEmpty()){
            return Optional.empty();
        }
        return Optional.ofNullable(stack.get(getLength()-1));
    }

}
