package EP2;

public class CircularLinkedList<E> implements Link<E> {
    private Node<E> head;
    private int size;

    public CircularLinkedList () {
        this.head = null;
        this.size = 0;
    }
    
    public int size() {return 0;}
    public void insert(int index, E data) {}
    public void printList() {}
    public void deleteByKey(E key) {}
    public void deleteAtPosition(int index) {}
    public void removeFirst() {}
    public void removeLast() {}
    public void addFirst(E data) {}
    public void addLast(E data) {}
}
