package EP1;
public class DoublyLinkedList <E> implements Link<E> {
    
    private Node<E> first;
    private Node<E> last;
    private int     size;

    public DoublyLinkedList () {
        first = null;
        last  = null;
        size  = 0;
    }

    public int size () {
        return size;
    }

    public void insert (int index, E data) {}
    public void printList () {}
    public void deleteByKey (E key) {}
    public void deleteAtPosition (int index) {}
    
    public void removeFirst () {
        if (size != 0) {
            --size;

            if (first == last) {
                first = last = null;
            
            } else {
                first = first.getNext();
                first.setPrev(null);
            }
        }
    }

    public void removeLast () {
        if (size != 0) {
            --size;

            if (first == last) {
                first = last = null;
            
            } else {
                last = last.getPrev();
                last.setNext(null);
            }
        }
    }
    
    public void addFirst (E data) {
        Node<E> node = new Node<>(data); 

        if (size == 0) {
            first = last = node;
        
        } else {
            node.setNext(first);
            first.setPrev(node);
            first = node;
        }
    }

    public void addLast (E data) {
        Node<E> node = new Node<>(data); 

        if (size == 0) {
            first = last = node;
        
        } else {
            node.setPrev(last);
            last.setNext(node);
            last = node;
        }
    }
}
