public class Stack<T> {

    private Node top;

    public Stack(Node top) {
        this.top = top;
    }

    public void push(T value) {
        Node newNode = new Node(value);
        newNode.setValue(value);
        newNode.setNext(top);
        top = newNode;
    }

    public T pop() {
        if (!isEmpty()) {
            Node newNode = top;
            top = top.getNext();
            return (T) newNode.getValue();
        }
        return null;
    }

    public T top() {

        return (T) top.getValue();
    }

    public boolean isEmpty() {
        return top == null;
    }

}
