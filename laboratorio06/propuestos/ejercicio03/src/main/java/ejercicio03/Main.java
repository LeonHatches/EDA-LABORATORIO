package ejercicio03;

public class Main {
    public static void main(String[] args) {
        BSTViewer<Integer> numeros = new BSTViewer<>();

        try {

            // Insert
            numeros.insert(8);
            numeros.insert(3);
            numeros.insert(10);
            numeros.insert(1);
            numeros.insert(6);
            numeros.insert(4);
            numeros.insert(7);
            numeros.insert(14);
            numeros.insert(13);
            numeros.insert(20);

            // Mostrar
            numeros.graphTree();

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}