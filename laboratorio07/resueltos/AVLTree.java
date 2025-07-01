package resueltos;
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
                            fat = balanceToLeft(fat);
                            this.height = false;
                            break;
                    }
                }
            } else {
                fat.setLeft( insert(x,(NodeAVL<E>) node.getLeft()));
                if (this.height) {
                    switch (fat.bf) {
                        case -1:
                            fat = balanceToRight(fat);
                            this.height = false;
                            break;
                    
                        case 0:
                            fat.bf = -1;
                            break;
                        
                        case 1:
                            fat.bf = 0;
                            this.height = false;
                            break;
                    }
                }
            }
        }
        return fat;
    }

    private NodeAVL<E> balanceToLeft (NodeAVL<E> node) {
        NodeAVL<E> hijo = (NodeAVL<E>) node.getRight();

        switch (hijo.bf) {
            case 1:
                node.bf = 0;
                hijo.bf = 0;
                node = rotateSL(node);
                break;
        
            case -1:
                NodeAVL<E> nieto = (NodeAVL<E>) hijo.getLeft();
                switch (nieto.bf) {
                    case -1:
                        node.bf = 0;
                        hijo.bf = 1;
                        break;
                
                    case 0:
                        node.bf = 0;
                        hijo.bf = 0;
                        break;
                    
                    case 1:
                        node.bf = 1;
                        hijo.bf = 0;
                        break;
                }
                nieto.bf = 0;
                node.setRight(rotateSR(hijo));
                node = rotateSL(node);
                break;
        }
        return node;
    }

     private NodeAVL<E> balanceToRight (NodeAVL<E> node) {
        NodeAVL<E> hijo = (NodeAVL<E>) node.getLeft();

        switch (hijo.bf) {
            case -1:
                node.bf = 0;
                hijo.bf = 0;
                node = rotateSR(node);
                break;
        
            case 1:
                NodeAVL<E> nieto = (NodeAVL<E>) hijo.getRight();
                switch (nieto.bf) {
                    case -1:
                        node.bf = 0;
                        hijo.bf = -1;  
                        break;
                
                    case 0:
                        node.bf = 0;
                        hijo.bf = 0;
                        break;
                    
                    case 1:
                        node.bf = 1;
                        hijo.bf = 0;
                        break;
                }
                nieto.bf = 0;
                node.setLeft(rotateSL(hijo));
                node = rotateSR(node);
                break;
        }
        return node;
     }

    private NodeAVL<E> rotateSL(NodeAVL<E> node) {
        NodeAVL<E> p = (NodeAVL<E>) node.getRight();
        node.setRight(p.getLeft());
        p.setLeft(node);
        node = p;
        return node;
    }

    private NodeAVL<E> rotateSR (NodeAVL<E> node) {
        NodeAVL<E> p = (NodeAVL<E>) node.getLeft();
        node.setLeft(p.getRight());
        p.setRight(node);
        node = p;
        return node;
    }
}
