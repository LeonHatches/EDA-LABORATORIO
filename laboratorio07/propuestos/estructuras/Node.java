package propuestos.estructuras;

public class Node<T> {
    private Node<T> left, right;
    private T data;
    protected int bf;

    public Node (T data, Node<T> left, Node<T> right) {
        this.data  = data;
        this.left  = left;
        this.right = right;
        this.bf = 0;
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

    public int getBf() {
        return this.bf;
    }

    public void setBf(int bf) {
        this.bf = bf;
    }
    
    public String toString () {
        return data.toString();
    }
}