import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);
    
    public static void main(String[] args) {
        Operador<? extends Number> op;
        int opcion = 0;
        
        System.out.println("\t\tCalculadora\n");
        do {
            op = ingresar();

            switch (opcion) {
                case 1:
                    mostrar("suma", suma(op.getValor1(), op.getValor2()));
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
                    System.out.println("Calculadora Apagada.");
                    break;

                default:
                    System.out.println("Opción invalida - Intente de nuevo.\n");
                    break;
            }

        } while (opcion != 8);
        
        sc.close();
    }

    // INGRESO DE DATOS

    public static Operador <? extends Number> ingresar() {
        int opcion;

        do {
            System.out.print ("Ingrese el tipo de dato | 1-Enteros | 2-Reales | : ");
            opcion = sc.nextInt();
        } while (opcion < 1 || opcion > 2);

        if (opcion == 1)
            return ingresarEnteros();
        else
            return ingresarReales();
    }

    public static Operador<Integer> ingresarEnteros () {
        System.out.print ("Ingrese 1er valor: ");
        int valor1 = sc.nextInt();

        System.out.print ("Ingrese 2do valor: ");
        int valor2 = sc.nextInt();

        return new Operador<Integer>(valor1, valor2);
    }

    public static Operador<Double> ingresarReales () {
        System.out.print ("Ingrese 1er valor: ");
        double valor1 = sc.nextDouble();

        System.out.print ("Ingrese 2do valor: ");
        double valor2 = sc.nextDouble();

        return new Operador<Double>(valor1, valor2);
    }

    // MOSTRAR DATOS

    public static void mostrar (String operacion, Number resultado) {
        if (resultado.doubleValue() == resultado.intValue())
            System.out.printf("El resultado de la %s es: %d%n", operacion, resultado.intValue());
        else
            System.out.printf("El resultado de la %s es: %.3f%n", operacion, resultado.doubleValue());
    }


    // OPERACIONES MATEMATICAS GENERICAS

    static <T extends Number> double suma(T valor1, T valor2) {
        return (valor1.doubleValue() + valor2.doubleValue());
    }
}
