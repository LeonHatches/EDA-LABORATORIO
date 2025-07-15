package propuestos.ejercicio01;

import java.util.LinkedList;

public class HashClosed<E> {
    private Register<E> [] table;
    private int capacity;
    private double count;

    @SuppressWarnings("unchecked")
    public HashClosed(int capacity) {
        
        this.capacity = capacity * 2;
        this.count = 0;
        table = new Register [this.capacity];
        
    }

    private boolean isFull () {
        return loadFactor() >= 0.5;
    }

    private double loadFactor () {
        return this.count / this.capacity;
    }

    private int hash(int key) {
        return key % table.length;
    }

    public void insert(Register<E> reg) {

        if (isFull()) {
            System.out.println("El Hash está lleno.");
            return;
        }

        int index = hash(reg.getKey());
        
        while ( (table[index] != null && !table[index].isDeleted())) {
            System.out.println("Se ha detectado una colisión, se busca nuevo lugar.");
            index++;
        }

        table[index] = reg;
        count++;
    }

    public void delete(int key) {
        int index = hash(key);

        for (Register<E> r : table[index]) {
            if (r.getKey() == key && !r.isDeleted()) {
                r.delete();
                System.out.println("Eliminado lógicamente: " + key);
                return;
            }
        }

        System.out.println("Clave no encontrada: " + key);
    }

    public Register<E> search(int key) {
        int index = hash(key);

        for (Register<E> r : table[index]) {
            if (r.getKey() == key && !r.isDeleted()) {
                return r;
            }
        }

        return null;
    }

    public void showTable() {
        System.out.println("\n--- Estado de la Tabla Hash (Abierto) ---");

        for(int i = 0 ; i < table.length ; i++) {
            System.out.print(i + " : ");

            if (table[i].isEmpty())
                System.out.println("[VACIO]");
            
            else {
                for(Register<E> r : table[i])
                    System.out.print(r + " -> ");
                
                System.out.println("NULL");
            }
        }
    }


}
