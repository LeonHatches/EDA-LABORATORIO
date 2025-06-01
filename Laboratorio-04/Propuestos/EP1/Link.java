package EP1;
interface Link <E> {
    int size();
    void insert(int index, E data);
    void printList();
    void deleteByKey(E key);
    void deleteAtPosition(int position);
    void removeFirst();
    void removelast();
    void addFirst(E data);
    void addLast(E data);
}