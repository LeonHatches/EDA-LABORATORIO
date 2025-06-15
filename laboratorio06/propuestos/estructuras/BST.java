package laboratorio06.propuestos.estructuras;

public class BST <T extends Comparable<T>> implements Tree<T> {
    private Node<T> root;

    public BST () {
        this.root = null;
    }

    @Override
    public void destroy() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'destroy'");
    }

    @Override
    public boolean isEmpty() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'isEmpty'");
    }

    @Override
    public void insert(T data) throws ItemDuplicated {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'insert'");
    }

    @Override
    public T search(T data) throws ItemNotFound {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'search'");
    }

    @Override
    public T min() throws ExceptionIsEmpty {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'min'");
    }

    @Override
    public T max() throws ExceptionIsEmpty {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'max'");
    }

    @Override
    public T predecesor(T data) throws ItemNotFound {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'predecesor'");
    }

    @Override
    public T sucesor(T data) throws ItemNotFound {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'sucesor'");
    }

    @Override
    public void preOrden() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'preOrden'");
    }

    @Override
    public void inOrden() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'inOrden'");
    }

    @Override
    public void postOrden() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'postOrden'");
    }
}

