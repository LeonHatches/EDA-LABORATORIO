package laboratorio05.propuestos.ejercicio04;
import java.util.Scanner;

import laboratorio05.propuestos.ejercicio03.*;
import laboratorio05.propuestos.estructuras.ExceptionIsEmpty;

public class Principal {
    static Scanner sc = new Scanner (System.in);
    
    public static void main (String [] args) {
        int opcion = 0;

        // Cola Definida
        Queue<Integer> stack = new Queue<>(15);
        for (int i = 1 ; i < 11 ; i++)
            stack.encolar(i);

        do {
            menu();

            try {
                // Escoger una opción
                System.out.print ("Eliga una opción: ");
                opcion = sc.nextInt();

                switch (opcion) {
                    case 1:
                        break;
                    
                    case 2:
                        break;

                    case 3:
                        break;
                    
                    case 4:
                        break;

                    case 5:
                        break;
                    
                    case 6:
                        break;

                    case 7:
                        break;
                    
                    case 8:
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

        } while (opcion != 8);
    }

    public static void menu () {
        
    }
}
