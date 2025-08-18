package excercises.chapter_11;

import java.util.ArrayList;

public class MyStack<E> extends ArrayList<E> {
    public MyStack() {
        super();
    }

    public E peek() {
        return get(size() - 1);
    }

    public E pop() {
        return remove(size() - 1);
    }

    public void push(E o) {
        add(o);
    }
}
