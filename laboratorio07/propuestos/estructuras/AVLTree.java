package propuestos.estructuras;

public class AVLTree<E extends Comparable<E>> extends BST<E> {
    protected boolean height;

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


    public void insert (E x) throws ItemDuplicated {
        this.height = false;
        this.root = insert(x, this.root);
    }

    protected Node<E> insert (E x, Node<E> node) throws ItemDuplicated {
        Node<E> fat = node;

        if (node == null) {
            this.height = true;
            fat = new Node<E>(x);
        
        } else {
            int resC = node.getData().compareTo(x);

            if (resC == 0) throw new ItemDuplicated("Duplicado");
            if (resC  < 0) {
                fat.setRight( insert(x, node.getRight()) );
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
                fat.setLeft( insert(x, node.getLeft()) );
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
}