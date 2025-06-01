package EP1;

public class Test {
    public static void main (String [] args) {
        DoublyLinkedList<Integer> list = new DoublyLinkedList<>();

        for (int i = 1 ; i < 11 ; i++)
            list.addLast(i);
        
        list.printList();
    }
}
