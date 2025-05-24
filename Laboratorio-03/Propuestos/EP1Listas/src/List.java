public class List <T> {
    private Node <T> root;
    private int count;

    public List () {
        this.root = null;
        this.count = 0;
    }

    public int size () {
        return count;
    }

    public boolean isEmpty () {
        return count == 0;
    }

    public void add (T e) {
        Node<T> nuevo = new Node <>(e);

        if (isEmpty()) {
            this.root = nuevo;
        
        } else {
            Node <T> aux = this.root;

            while (aux.getNext() != null)
                aux = aux.getNext();
            
            aux.setNext(nuevo);
        }

        ++this.count;
    }

    public void add (int index, T element) {
        Node <T> nuevo = new Node <>(element);

        if (index == 0) {
            nuevo.setNext(root);
            this.root = nuevo;
        
        } else {
            Node <T> aux = this.root;

            for (int i = 0 ; i < index-1 ; i++)
                aux = aux.getNext();
            
            nuevo.setNext(aux.getNext());
            aux.setNext(nuevo);
        }

        ++this.count;
    }

    public T get (int index) {
        Node <T> aux = this.root;

        for (int i = 0 ; i < index ; i++)
            aux = aux.getNext();
        
        return aux.getData();
    }

    public void clear () {
        this.root = null;
        this.count = 0;
    }
    
    public T remove (int index) {
        Node <T> remove = this.root;

        if (index == 0) {
            this.root = root.getNext();

        } else {
            Node <T> aux = this.root;

            for (int i = 0 ; i < index-1 ; i++)
                aux = aux.getNext();
            
            remove = aux.getNext();
            aux.setNext(aux.getNext().getNext());
        }
        
        --count;
        return remove.getData();
    }

    public boolean remove (T o) {
        int index = indexOf(o);

        if (index != -1) {
            remove(index);
            return true;
        }

        return false;
    }

    public int indexOf (T o) {
        Node <T> aux = this.root;
        int index = 0;

        while (aux != null && !aux.getData().equals(o)) {
            aux = aux.getNext();
            ++index;
        }
        
        if (aux != null) {
            return index;
        }

        return -1;
    }

    public boolean contains (T o) {
        if (indexOf(o) != -1)
            return true;
        
        return false;
    }
}
