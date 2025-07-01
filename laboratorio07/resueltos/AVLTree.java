package laboratorio07.resueltos;

public class AVLTree<E extends Comparable<E>> extends BST<E> {

    class NodeAVL<T> extends Node<T> {
        protected int bf;

        public NodeAVL (T data) {
            super(data, null, null);
            this.bf = 0;
        }

        public String toString () {
            return getData().toString();
        }
    }
}
