package laboratorio05.propuestos.ejercicio02;

import java.util.Scanner;
import laboratorio05.propuestos.ejercicio01.*;
import laboratorio05.propuestos.estructuras.ExceptionIsEmpty;

public class StackMenu {
    static Scanner sc = new Scanner (System.in);
    
    public static void main (String [] args) {
        int opcion;

        // Pila Definida
        Stack<Integer> stack = new Stack<>(15);
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
                        System.out.print ("Ingrese número: ");
                        stack.push(sc.nextInt());
                        break;
                    
                    case 2:
                        stack.pop();
                        System.out.println("Tope Eliminado.");
                        break;

                    case 3:
                        System.out.println("Tope: " + stack.top());
                        break;
                    
                    case 4:
                        stack.destroystak();
                        System.out.println("Se limpió la Pila");
                        break;

                    case 5:
                        String empty = (stack.isEmpty()) ? "Si":"No";
                        System.out.println(empty + " está vacía.");
                        break;
                    
                    case 6:
                        String full = (stack.isFull()) ? "Si":"No";
                        System.out.println(full + " está llena.");
                        break;

                    case 7:
                        System.out.print ("La pila: ");
                        stack.printStack();
                        break;
                    
                    case 8:
                        System.out.println("Saliendo del programa...");
                        break;

                    default:
                        System.out.println("Seleccione una opción válida..."); break;
                }

            } catch (ExceptionIsEmpty e) {
			    System.out.println(e.getMessage());
		    }

            
        } while (opcion != 8);
    }

    public static void menu () {
        System.out.println(
            "\n\t\t| Menú del Programa |"
            + "\n1. Apilar un número (Máx. 20) (Push)"
            + "\n2. Eliminar un tope (pop)"
            + "\n3. Ver el tope (top)"
            + "\n4. Eliminar toda la Pila (destroyStack)"
            + "\n5. Verificar si está vacía (isEmpty)"
            + "\n6. Verificar si está llena (isFull)"
            + "\n7. Ver toda la Pila (printStack)"
            + "\n8. Salir del Programa\n"
        );
    }
}
