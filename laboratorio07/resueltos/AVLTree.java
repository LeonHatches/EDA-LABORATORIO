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

    private boolean height;
    private NodeAVL<E> root;

    public void insert(E x) throws ItemDuplicated {
        this.height = false;
        this.root = insert(x, (NodeAVL<E>) this.root);
    }

    protected NodeAVL<E> insert(E x, NodeAVL<E> node) throws ItemDuplicated {
        NodeAVL<E> fat = node;

        if (node == null) {
            this.height = true;
            fat = new NodeAVL<E>(x);
        
        } else {
            int resC = node.getData().compareTo(x);

            if (resC == 0) throw new ItemDuplicated("Duplicado");
            if (resC  < 0) {
                fat.setRight( insert(x, (NodeAVL<E>) node.getRight()));
                if (this.height) {
                    switch (fat.bf) {
                        case -1:
                            fat.bf = 0;
                            this.height = false;
                            break;
                    
                        case 0:
                            fat.bf = 1;
                            break;
                        
                        case 1:
                            //fat = balanceToLeft(fat);
                            this.height = false;
                            break;
                    }
                }
            } else {
                //
            }
        }
        return fat;
    }
}
