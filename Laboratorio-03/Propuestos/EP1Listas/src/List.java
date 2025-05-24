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

        count++;
    }
}
