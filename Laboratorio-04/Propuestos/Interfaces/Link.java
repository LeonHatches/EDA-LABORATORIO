interface Link <E> {
    int size();
    void insert(E data);
    void printList();
    void deleteByKey(E key);
    void deleteAtPosition(int position);
    void removeFirst();
    void removelast();
    void addFirst();
    void addLast();
}