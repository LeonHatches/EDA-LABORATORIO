package propuestos.estructuras;

public class AVLTree<E extends Comparable<E>> extends BST<E> {
    private boolean height;

    public AVLTree () {
        super();
        this.height = true;
    }

    @Override
    public void destroy () {
        this.root = null;
        this.height = true;
    }

    private Node<E> rotacionSimpleIzquierda (Node<E> node) {
        Node<E> p = (Node<E>) node.getRight();
        node.setRight(p.getLeft());
        p.setLeft(node);
        node = p;
        return node;
    }

    private Node<E> rotacionSimpleDerecha (Node<E> node) {
        Node<E> p = (Node<E>) node.getLeft();
        node.setLeft(p.getRight());
        p.setRight(node);
        node = p;
        return node;
    }
}