package propuestos.ejercicio03;
import propuestos.ejercicio01.HashClosed;
import java.util.Scanner;

public class Test {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcion = 0;   
        
        System.out.println("\n\t| TABLA HASH CERRADA (STRINGS) |");
        do {
            menu();
            System.out.print ("Ingrese opción: ");

        } while (opcion != 4);
    }

    public static void menu () {
        System.out.println("1. Insertar elemento");
        System.out.println("2. Eliminar elemento");
        System.out.println("3. Mostrar Tabla");
        System.out.println("4. Salir del Programa");
    }
}
