package resueltos.estructuras.hashcerrado;

public class HashClosed<E> {
    private Register<E> [] table;
    private int capacity;
    private double count;

    @SuppressWarnings("unchecked")
    public HashClosed(int capacity) {
        
        this.capacity = capacity;
        this.count = 0;
        table = new Register [this.capacity];
        
    }

    private boolean isFull () {
        return loadFactor() == 1;
    }

    private double loadFactor () {
        return this.count / this.capacity;
    }

    private int hash(int key) {
        return key % this.capacity;
    }

    public boolean insert (int key, E value) {
        return insert(new Register<E>(key, value));
    }

    private boolean insert(Register<E> reg) {

        if (isFull()) {
            System.out.println("El Hash está lleno.");
            return false;
        }

        int index = hash(reg.getKey());
        
        while (table[index] != null && !table[index].isDeleted() && table[index].compareTo(reg) != 0) {
            
            System.out.println("Se ha detectado una colisión, se busca nuevo lugar.");
            index = hash(index + 1);
        }

        if (table[index] == null || table[index].isDeleted()) {
            table[index] = reg;
            count++;
            return true;
        }

        System.out.println("Clave duplicada: " + reg.getKey());
        return false;
    }

    public void delete(int key) {
        int index = hash(key);

        while (table[index] != null && table[index].getKey() != key) {
            index = hash(index + 1);
        }

        if (table[index] == null || table[index].isDeleted()) {
            System.out.println("Clave no encontrada: " + key);
            return;
        }

        System.out.println("Se elimina: " + table[index]);
        count--;

        if (table[ hash(index + 1) ] != null)
            table[index].delete();

        else
            table[index] = null;
    }

    public Register<E> search(int key) {
        int index = hash(key);

        while (table[index] != null && table[index].getKey() != key) {
            index = hash(index + 1);
        }

        if (table[index] != null && !table[index].isDeleted())
            return table[index];

        return null;
    }

    public void showTable() {
        System.out.println("\n--- Estado de la Tabla Hash (Closed) ---");

        for(int i = 0 ; i < table.length ; i++) {
            System.out.print(i + " | ");

            if (table[i] == null)
                System.out.println("[VACIO]");
            
            else
                System.out.println(table[i]);
        }
    }
}
