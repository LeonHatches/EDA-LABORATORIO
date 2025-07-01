package propuestos.estructuras;

public class NodeAVL<T> {
    private NodeAVL<T> left, right;
    private T data;
    protected int bf;

    public NodeAVL (T data, NodeAVL<T> left, NodeAVL<T> right) {
        this.data  = data;
        this.left  = left;
        this.right = right;
        this.bf = 0;
    }

    public NodeAVL (T data) {
        this(data, null, null);
    }
    public NodeAVL<T> getLeft() {
        return left;
    }
    public void setLeft(NodeAVL<T> left) {
        this.left = left;
    }
    public NodeAVL<T> getRight() {
        return right;
    }
    public void setRight(NodeAVL<T> right) {
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