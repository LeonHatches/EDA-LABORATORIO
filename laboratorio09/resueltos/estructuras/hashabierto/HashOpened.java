package resueltos.estructuras.hashabierto;

import java.util.LinkedList;

public class HashOpened<E> {
    private LinkedList<Register<E>> [] table;

    @SuppressWarnings("unchecked")
    public HashOpened(int capacity) {
        table = new LinkedList[capacity];

        for(int i = 0 ; i < capacity ; i++)
            table[i] = new LinkedList<>();
    }

    
}
