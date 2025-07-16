package propuestos.ejercicio04;
import propuestos.ejercicio02.HashOpened;
import java.util.Scanner;

public class Test {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        HashOpened<Integer> hash = new HashOpened<>(7);
        int opcion = 0;   
        
        System.out.println("\n\t| TABLA HASH ABIERTA (INTEGER - 7 ELEMENTOS) |");
        do {
            menu();
            
            try {

                System.out.print ("Seleccione su opción: ");
                opcion = sc.nextInt();

                switch (opcion) {
                    case 1:
                        System.out.print ("Ingrese número: ");
                        int dato = sc.nextInt();
                        hash.insert(dato, dato);
                        break;

                    case 2:
                        System.out.print ("Ingrese número: ");
                        int dele = sc.nextInt();
                        hash.delete(dele);
                        break;

                    case 3:
                        hash.showTable();
                        break;

                    case 4:
                        System.out.print ("Ingrese número: ");
                        int sear = sc.nextInt();
                        
                        System.out.println("| ¿Elemento encontrado? | " + hash.search(sear));
                        break;
                    
                    case 5:
                        System.out.println("Saliendo del programa...");
                        break;

                    default:
                        System.out.println("Ingrse una opción váida.");
                        break;
                }
            
            } catch (Exception e) {
                System.out.println("Ha ocurrido un error...");
                sc.nextLine();
            }

        } while (opcion != 5);

        sc.close();
    }

    public static void menu () {
        System.out.println("\n\t| MENU DE OPCIONES |");
        System.out.println("1. Insertar elemento");
        System.out.println("2. Eliminar elemento");
        System.out.println("3. Mostrar Tabla");
        System.out.println("4. Buscar elemento");
        System.out.println("5. Salir del Programa\n");
    }
}
