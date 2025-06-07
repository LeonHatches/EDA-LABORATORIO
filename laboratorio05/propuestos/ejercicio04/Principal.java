package laboratorio05.propuestos.ejercicio04;
import java.util.Scanner;

import laboratorio05.propuestos.ejercicio03.*;
import laboratorio05.propuestos.estructuras.ExceptionIsEmpty;

public class Principal {
    static Scanner sc = new Scanner (System.in);
    
    public static void main (String [] args) {
        int opcion = 0;

        // Cola Definida
        Queue<Integer> queue = new Queue<>(15);
        for (int i = 1 ; i < 11 ; i++)
            queue.encolar(i);

        do {
            menu();

            try {
                // Escoger una opción
                System.out.print ("Eliga una opción: ");
                opcion = sc.nextInt();

                switch (opcion) {
                    case 1:
                        System.out.print ("Ingrese número: ");
                        queue.encolar(sc.nextInt());
                        break;
                    
                    case 2:
                        queue.desencolar();
                        System.out.println("Desencolado.");
                        break;

                    case 3:
                        queue.destroyQueue();
                        System.out.println("Se vació.");
                        break;
                    
                    case 4:
                        String empty = (queue.isEmpty()) ? "Si":"No";
                        System.out.println(empty + " está vacía.");
                        break;

                    case 5:
                        String full = (queue.isFull()) ? "Si":"No";
                        System.out.println(full + " está llena.");
                        break;
                    
                    case 6:
                        System.out.println("Primero: " + queue.front());
                        break;

                    case 7:
                        System.out.println("Último: " + queue.back());
                        break;
                    
                    case 8:
                        System.out.print ("La cola: ");
                        queue.printQueue();
                        break;
                    
                    case 9:
                        System.out.println("Saliendo del programa...");
                        break;

                    default:
                        System.out.println("Seleccione una opción válida..."); break;
                }

            } catch (ExceptionIsEmpty e) {
			    System.out.println(e.getMessage());
		    } catch (Exception e) {
                System.out.println("Ha ocurrido un error...");
                sc.nextLine();
            }

        } while (opcion != 9);
    }

    public static void menu () {
        System.out.println(
            "\n\t| Menú del Programa |"
            + "\n1. Encolar un número (Máx. 15) (encolar)"
            + "\n2. Desencolar un número (desencolar)"
            + "\n3. Eliminar toda la Cola (destroyQueue)"
            + "\n4. Verificar si está vacía (isEmpty)"
            + "\n5. Verificar si está llena (isFull)"
            + "\n6. Ver el primer número (front)"
            + "\n7. Ver el último número (back)"
            + "\n8. Ver toda la Cola (printQueue)"
            + "\n9. Salir del Programa\n"
        );
    }
}
