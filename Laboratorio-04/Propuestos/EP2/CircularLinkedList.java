package EP2;

public class CircularLinkedList<E> implements Link<E> {
    private Node<E> head;
    private int size;

    public CircularLinkedList () {
        this.head = null;
        this.size = 0;
    }
    
    public int size() {
        return size;
    }

    public void insert(int index, E data) {}
    
    public void printList() {
        Node<E> aux = head;

        for (int i = 0 ; i < size ; i++) {
            System.out.print(head.getData()+" ");
            aux = aux.getNext();
        }
        System.out.println();
    }

    public void deleteByKey(E key) {}
    public void deleteAtPosition(int index) {}
    public void removeFirst() {}
    public void removeLast() {}

    public void addFirst (E data) {

    }

    public void addLast (E data) {

    }
}
