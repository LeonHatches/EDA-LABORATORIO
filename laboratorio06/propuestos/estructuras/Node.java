package laboratorio06.propuestos.estructuras;

public class Node<T> {
    private Node<T> left, right;
    private T data;

    public Node (T data, Node<T> left, Node<T> right) {
        this.data  = data;
        this.left  = left;
        this.right = right;
    }

    public Node (T data) {
        this(data, null, null);
    }

    public Node<T> getLeft() {
        return left;
    }
    public void setLeft(Node<T> left) {
        this.left = left;
    }
    public Node<T> getRight() {
        return right;
    }
    public void setRight(Node<T> right) {
        this.right = right;
    }
    public T getData() {
        return data;
    }
    public void setData(T data) {
        this.data = data;
    }
}