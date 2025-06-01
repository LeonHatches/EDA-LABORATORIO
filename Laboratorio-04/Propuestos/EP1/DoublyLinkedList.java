package EP1;
public class DoublyLinkedList <E> implements Link<E> {
    
    private Node<E> first;
    private Node<E> last;
    private int     size;

    public DoublyLinkedList () {
        first = null;
        last  = null;
        size = 0;
    }

    public int size () {
        return size;
    }

    public void insert (int index, E data) {

    }

    public void printList () {}
    public void deleteByKey (E key) {}
    public void deleteAtPosition (int position) {}
    
    public void removeFirst () {
        if (size != 0)
            first = first.getNext();
    }

    public void removelast () {
        if (size != 0)
            last = last.getPrev();
    }
    
    public void addFirst (E data) {
        Node<E> node = new Node<>(data); 

        if (size == 0) {
            first = node;
            last  = node;
        
        } else {
            node.setNext(first.getNext());
            first = node;
        }
    }

    public void addLast (E data) {
        Node<E> node = new Node<>(data); 

        if (size == 0) {
            first = node;
            last  = node;
        
        } else {
            last.setNext(node);
        }
    }
}
