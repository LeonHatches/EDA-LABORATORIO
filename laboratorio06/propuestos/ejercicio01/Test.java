package laboratorio06.propuestos.ejercicio01;

import laboratorio06.propuestos.estructuras.*;

public class Test {
    public static void main(String[] args) {
        BST<Integer> numeros = new BST<>();

        try {

            System.out.println("| Prueba de métodos del BST |");
            
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

            // Recorridos, Máximos y Mínimos
            System.out.println("| PreOrden  |: " + numeros.preOrden());
            System.out.println("| InOrden   |: " + numeros.inOrden() + " | Min |: " + numeros.min());
            System.out.println("| PostOrden |: " + numeros.postOrden() + " | Max |: " + numeros.max());

            // Predecesor y Sucesor
            System.out.println("| Elemento  |: " + 8 + " | Predecesor |: " + numeros.predecesor(8));
            System.out.println("| Elemento  |: " + 8 + " | Sucesor    |: " + numeros.sucesor(8));

            // Remove
            numeros.remove(8);
            System.out.println("| Eliminado |: " + 8 + " | InOrden |: " + numeros.inOrden());

            // Search
            System.out.println("| Buscado   |: " + 10 + " | Elemento |: " + numeros.search(10)); 

            // Destroy e isEmpty
            numeros.destroy();
            String resultado = (numeros.isEmpty()) ? "Sí" : "No";
            System.out.println("| Destroy   | ¿Vacío? |: " + resultado);

        } catch (ExceptionIsEmpty e) {
            System.out.println(e.getMessage());
        } catch (ItemDuplicated e) {
            System.out.println(e.getMessage());
        } catch (ItemNotFound e) {
            System.out.println(e.getMessage());
        }
    }
}
