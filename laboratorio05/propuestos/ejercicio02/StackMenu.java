package laboratorio05.propuestos.ejercicio02;

import java.util.Scanner;
import laboratorio05.propuestos.ejercicio01.*;
import laboratorio05.propuestos.estructuras.ExceptionIsEmpty;

public class StackMenu {
    static Scanner sc = new Scanner (System.in);
    
    public static void main (String [] args) {
        int opcion;

        // Pila Definida
        Stack<Integer> stack = new Stack<>(20);
        for (int i = 10 ; i > 0 ; i--)
            stack.push(i);

        do {
            menu();

            // Escoger una opción
            System.out.print ("Eliga una opción: ");
            opcion = sc.nextInt();

            try {

                switch (opcion) {
                    case 1:
                        break;
                
                    default:
                        System.out.println("Seleccione una opción válida...");;
                }

            } catch (ExceptionIsEmpty e) {
			    System.out.println(e.getMessage());
		    }

            
        } while (opcion != 8);
    }

    public static void menu () {
        System.out.println(
            "\n\t\t\t| Menú del Programa |"
            + "\n1. Apilar un número (Máx. 20) (Push)"
            + "\n2. Eliminar un tope (pop)"
            + "\n4. Ver el tope (top)"
            + "\n5. Verificar si está vacía (isEmpty)"
            + "\n6. Verificar si está llena (isFull)"
            + "\n7. Ver toda la Pila (printStack)"
            + "\n8. Salir del Programa\n"
        );
    }
}
