import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);
    
    public static void main(String[] args) {
        Operador op;
        int opcion = 0;
        
        System.out.println("\t\tCalculadora\n");
        do {
            op = ingresar();

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
                    break;

                default:
                    System.out.println("Opción invalida - Intente de nuevo.\n");
                    break;
            }

        } while (opcion != 8);
    }

    public static Operador <? extends Number> ingresar() {
        System.out.print ("Ingrese el tipo de dato | 1-Enteros | 2-Reales | : ");
        
        return new Operador<Integer>(0, 0);
    }

    public static Operador<Integer> ingresarEnteros () {
        return new Operador<Integer>(0, 0);
    }

    public static Operador<Double> ingresarReales () {
        return new Operador<Double>(0.0, 0.0);
    }
}
