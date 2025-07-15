package propuestos.ejercicio01;

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

    public void insert (int key, E value) {
        insert(new Register<E>(key, value));
    }

    private void insert(Register<E> reg) {

        if (isFull()) {
            System.out.println("El Hash está lleno.");
            return;
        }

        int index = hash(reg.getKey());
        
        while (table[index] != null && !table[index].isDeleted() && table[index].compareTo(reg) != 0) {
            System.out.println("Se ha detectado una colisión, se busca nuevo lugar.");
            index++;
        }

        if (table[index].compareTo(reg) == 0) {
            System.out.println("Clave duplicada: " + reg.getKey());
            return;
        }

        table[index] = reg;
        count++;
    }

    public void delete(int key) {
        int index = hash(key);

        while (table[index] != null && table[index].getKey() != key) {
            index++;
        }

        if (table[index] == null) {
            System.out.println("Clave no encontrada: " + key);
            return;
        }

        System.out.println("Se elimina: " + table[index]);

        if (table[index + 1] != null)
            table[index].delete();

        else
            table[index] = null;
    }

    public Register<E> search(int key) {
        int index = hash(key);

        while (table[index] != null && table[index].getKey() != key) {
            index++;
        }

        if (table[index].getKey() == key)
            return table[index];

        return null;
    }

    // public void showTable() {
    //     System.out.println("\n--- Estado de la Tabla Hash (Abierto) ---");

    //     for(int i = 0 ; i < table.length ; i++) {
    //         System.out.print(i + " : ");

    //         if (table[i].isEmpty())
    //             System.out.println("[VACIO]");
            
    //         else {
    //             for(Register<E> r : table[i])
    //                 System.out.print(r + " -> ");
                
    //             System.out.println("NULL");
    //         }
    //     }
    // }
}
