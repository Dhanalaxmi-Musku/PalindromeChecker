
public class Deque<T> {
    private Node<T> front;
    private Node<T> rear;
    private int size;

    public Deque() {
        front = null;
        rear = null;
        size = 0;
    }

    public void addFront(T item) {
        Node<T> newNode = new Node<>(item);
        if (isEmpty()) {
            front = rear = newNode;
        } else {
            newNode.next = front;
            front = newNode;
        }
        size++;
    }

    public void addRear(T item) {
        Node<T> newNode = new Node<>(item);
        if (isEmpty()) {
            front = rear = newNode;
        } else {
            rear.next = newNode;
            rear = newNode;
        }
        size++;
    }

    public T removeFront() {
        if (isEmpty()) return null;
        T data = front.data;
        front = front.next;
        if (front == null) rear = null;
        size--;
        return data;
    }

    public T removeRear() {
        if (isEmpty()) return null;
        if (front == rear) {
            T data = rear.data;
            front = rear = null;
            size--;
            return data;
        }
        Node<T> current = front;
        while (current.next != rear) {
            current = current.next;
        }
        T data = rear.data;
        rear = current;
        rear.next = null;
        size--;
        return data;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public int size() {
        return size;
    }
}
