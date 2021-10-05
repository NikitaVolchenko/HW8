public class Queue<T> {

    private Node head;
    private Node tail;

    public Queue() {
    }

    public Queue(Node head, Node tail) {
        this.head = head;
        this.tail = tail;
    }

    public void push(T value) {
        Node newNode = new Node(value);

        if (head == null) {
            head = newNode;
        } else {
            tail.setNext(newNode);
        }
        tail = newNode;
    }

    public T pop() {
        if (head != null) {

            T x = (T) head.getValue();
            head = head.getNext();

            if (head == null) {
                tail = null;
            }
            return x;
        }
        return null;
    }

    public Node getHead() {
        return head;
    }

    public Node getTail() {
        return tail;
    }

    public T peek() {

        if (head != null) {
            return (T) head.getValue();
        }
        return null;
    }

    public boolean isEmpty() {
        return head == null;
    }

}
