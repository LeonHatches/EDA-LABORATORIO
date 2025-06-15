package laboratorio06.propuestos.estructuras;

public class BST <T extends Comparable<T>> implements Tree<T> {
    private Node<T> root;

    public BST () {
        this.root = null;
    }

    @Override
    public void destroy () {
        root = null;
    }

    @Override
    public boolean isEmpty () {
        return root == null;
    }

    @Override
    public void insert (T data) throws ItemDuplicated {
        this.root = insert(data, root);
    }

    private Node<T> insert (T data, Node<T> actual) throws ItemDuplicated {
        
        Node<T> result = actual;
        if (actual == null)
            result = new Node<>(data);
        
        else {
            int cmp = data.compareTo(actual.getData());

            if (cmp == 0) throw new ItemDuplicated("Elemento '" + data + "' Duplicado.");
            if (cmp  > 0) result.setRight( insert(data, actual.getRight()) );
            else          result.setLeft ( insert(data, actual.getLeft ()) );
        }

        return result;
    }

    @Override
    public T search (T data) throws ItemNotFound {
        return search(data, root).getData();
    }

    private Node<T> search (T data, Node<T> actual) throws ItemNotFound {
        if (actual == null) throw new ItemNotFound("Elemento '" + data + "' No Encontrado.");
        else {
            int cmp = data.compareTo(actual.getData());
            if (cmp > 0) return search(data, actual.getRight());
            if (cmp < 0) return search(data, actual.getLeft());
            return actual;
        }
    }

    @Override
    public T min() throws ExceptionIsEmpty {
        if (isEmpty())
            throw new ExceptionIsEmpty("El BST está vacío.");
        
        return min(root).getData();
    }

    private Node<T> min(Node<T> actual) {
        if (actual.getLeft() == null) return actual;
        else                          return min(actual.getLeft());
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

