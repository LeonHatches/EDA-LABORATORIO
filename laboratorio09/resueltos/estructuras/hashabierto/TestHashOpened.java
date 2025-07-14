package resueltos.estructuras.hashabierto;

public class TestHashOpened {
    public static void main(String[] args) {
        
        HashOpened<String> tabla = new HashOpened<>(8);
        String [] valores = {"Pepe", "Jesus", "Juan", "Maria", "DUPLICADO"};
        int [] claves = {5, 21, 19, 16, 21};
        
        for (int i = 0 ; i < 5 ; i++) {
            tabla.insert(new Register<String>(claves[i], valores[i]));
            tabla.showTable();
            System.out.println("\n");
        }

        System.out.println(tabla.search(5));
        System.out.println(tabla.search(21));

        tabla.delete(21);
        tabla.delete(100);

        tabla.showTable();
    }
}
