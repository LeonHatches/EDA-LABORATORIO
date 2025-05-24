public class Node <T> {
    private T data;
    private Node <T> nextNode;

    public Node (T data, Node <T> nextNode) {
        this.data = data;
        this.nextNode = nextNode;
    }

    public Node (T data) {
        this(data, null);
    }

    public void setData (T data) {
        this.data = data;
    }

    public void setNext (Node<T> nextNode) {
        this.nextNode = nextNode;
    }

    public T getData () {
        return data;
    }

    public Node<T> getNext () {
        return nextNode;
    }

    public String toString () {
        return data.toString();
    }
}