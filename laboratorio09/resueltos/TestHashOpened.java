package resueltos;

import resueltos.estructuras.hashabierto.*;

public class TestHashOpened {
    public static void main(String[] args) {
        HashOpened<String> hash = new HashOpened<>(5);

        hash.insert(new Register<String>(5, "Pepe"));
        hash.insert(new Register<String>(21, "Jesus"));
        hash.insert(new Register<String>(19, "Juan"));
        hash.insert(new Register<String>(16, "María"));
        hash.insert(new Register<String>(21, "DUPLICADO"));
            
        hash.showTable();
        System.out.println("Search: " + hash.search(5));
        System.out.println("Search: " + hash.search(21));
        hash.delete(21);
        hash.delete(100);
        hash.showTable();

    }
}
