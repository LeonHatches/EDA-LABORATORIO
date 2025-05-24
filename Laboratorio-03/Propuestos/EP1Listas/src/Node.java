public class Node <T> {
    private T data;
    private Node <T> nextNode;

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
}