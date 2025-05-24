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
}
