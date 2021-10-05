public class List<T> {

    private Node head;
    private int count;

    public void add(T value) {
        Node newNode = new Node(value);
        if (head == null) {
            head = newNode;
        } else {
            Node currentNode = head;
            while (currentNode.getNext() != null) {
                currentNode = currentNode.getNext();
            }
            currentNode.setNext(newNode);
        }
        count++;
    }

    public void print() {
        Node currentNode = head;
        while (currentNode != null) {
            System.out.println(currentNode.getValue());
            currentNode = currentNode.getNext();
        }
    }

    public void reverse() {
        Node prevNode = null;
        Node currNode = head;
        while (currNode != null) {

            Node next = currNode.getNext();
            currNode.setNext(prevNode);
            prevNode = currNode;
            currNode = next;
        }
        head = prevNode;
    }

    public Node getHead() {
        return head;
    }

    public T getINode(int i) {
        Node currentNode = head;
        for (int j = 0; j < count; j++) {
            if (i == j) {
                return (T) currentNode.getValue();
            }
            currentNode = currentNode.getNext();
        }
        return null;
    }
}
