package resueltos;

import resueltos.estructuras.hashcerrado.HashClosed;

public class TestHashClosed {
    public static void main(String[] args) {
        int [] arreglo = {100, 5, 14, 15, 22, 16, 17, 32, 13, 32, 100};
        HashClosed<Integer> hash = new HashClosed<>(11);

        for (int num : arreglo)
            hash.insert(num, num);
            
        hash.showTable();
        System.out.println("Search: " + hash.search(32));
        System.out.println("Search: " + hash.search(200));
        hash.delete(17);
        hash.delete(100);
        hash.showTable();

    }
}
