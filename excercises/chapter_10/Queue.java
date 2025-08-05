package excercises.chapter_10;

public class Queue {
    private Integer[] elements;
    private int size;

    public Queue() {
        this(8);
    }

    public Queue(int size) {
        this.size = size;
        elements = new Integer[size];
    }

    public void enqueue(int v) {
        if(elements[elements.length - 1] != null) {
            Integer[] temp = elements.clone();
            size *= 2;
            elements = new Integer[size];

            for(int i = 0; i < temp.length; i++) {
                elements[i] = temp[i];
            }
        }

        for(int i = 0; i < elements.length; i++) {
            if(elements[i] == null) {
                elements[i] = v;
                break;
            }
        }
    }

    public int dequeue() {
        if(elements[0] == null) {
            System.out.println("Queue is empty");
            return -1;
        }

        int temp = elements[0];
        for(int i = 0; i < elements.length - 1; i++) {
            elements[i] = elements[i + 1];
        }

        return temp;
    }

    public boolean empty() {
        return elements[0] == null;
    }

    public int getSize() {
        return size;
    }

    public Integer[] getElements() {
        return elements;
    }
}
