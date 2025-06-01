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

    public int size() {return 0;}
    public void insert(E data) {}
    public void printList() {}
    public void deleteByKey(E key) {}
    public void deleteAtPosition(int position) {}
    public void removeFirst() {}
    public void removelast() {}
    public void addFirst() {}
    public void addLast() {}
}
