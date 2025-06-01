package EP2;
interface Link <E> {
    int size();
    void insert(int index, E data);
    void printList();
    void deleteByKey(E key);
    void deleteAtPosition(int index);
    void removeFirst();
    void removeLast();
    void addFirst(E data);
    void addLast(E data);
}
