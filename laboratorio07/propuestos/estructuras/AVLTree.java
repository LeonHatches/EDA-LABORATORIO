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

        private Node<E> balanceToLeft (Node<E> node) {
        Node<E> hijo = (Node<E>) node.getRight();

        switch (hijo.bf) {
            case 1:
                node.bf = 0;
                hijo.bf = 0;
                node = rotacionSimpleIzquierda(node);
                break;
        
            case -1:
                Node<E> nieto = (Node<E>) hijo.getLeft();
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
                        node.bf = -1;
                        hijo.bf = 0;
                        break;
                }
                nieto.bf = 0;
                node.setRight(rotacionSimpleDerecha(hijo));
                node = rotacionSimpleIzquierda(node);
                break;
        }
        return node;
    }

     private Node<E> balanceToRight (Node<E> node) {
        Node<E> hijo = (Node<E>) node.getLeft();

        switch (hijo.bf) {
            case -1:
                node.bf = 0;
                hijo.bf = 0;
                node = rotacionSimpleDerecha(node);
                break;
        
            case 1:
                Node<E> nieto = (Node<E>) hijo.getRight();
                switch (nieto.bf) {
                    case -1:
                        node.bf = 1;
                        hijo.bf = 0;  
                        break;
                
                    case 0:
                        node.bf = 0;
                        hijo.bf = 0;
                        break;
                    
                    case 1:
                        node.bf = 0;
                        hijo.bf = -1;
                        break;
                }
                nieto.bf = 0;
                node.setLeft(rotacionSimpleIzquierda(hijo));
                node = rotacionSimpleDerecha(node);
                break;
        }
        return node;
     }
}