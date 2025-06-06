package laboratorio05.propuestos.ejercicio02;

import java.util.Scanner;
import laboratorio05.propuestos.ejercicio01.*;
import laboratorio05.propuestos.estructuras.ExceptionIsEmpty;

public class StackMenu {
    static Scanner sc = new Scanner (System.in);
    
    public static void main (String [] args) {
        int opcion;

        // Pila Definida
        Stack<Integer> stack = new Stack<>(10);
        for (int i = 10 ; i > 0 ; i--)
            stack.push(i);

        do {
            menu();

            // Escoger una opción
            System.out.println("");
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

            
        } while (opcion != 7);
    }

    public static void menu () {

    }
}
