import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);
    
    public static void main(String[] args) {
        Operador<? extends Number> op;
        int opcion = 0;
        
        System.out.println("\n\t\t\tCalculadora");
        do {
            op     = ingresar();
            opcion = mostrarMenu();

            switch (opcion) {
                case 1:
                    mostrar("suma", suma(op.getValor1(), op.getValor2()));
                    break;
                
                case 2:
                    mostrar("resta", resta(op.getValor1(), op.getValor2()));
                    break;            
                
                case 3:
                    mostrar("multiplicación", producto(op.getValor1(), op.getValor2()));
                    break;

                case 4:
                    mostrar("división", division(op.getValor1(), op.getValor2()));
                    break;

                case 5:
                    mostrar("potencia", potencia(op.getValor1(), op.getValor2()));
                    break;

                case 6:
                    mostrar("raíz cuadrada", raizCua(op.getValor1()));
                    break;

                case 7:
                    mostrar("raíz cúbica", raizCub(op.getValor1()));
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
            System.out.print ("\nIngrese el tipo de dato | 1-Enteros | 2-Reales | : ");
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
            System.out.printf("\nEl resultado de la %s es: %d%n", operacion, resultado.intValue());
        else
            System.out.printf("\nEl resultado de la %s es: %.4f%n", operacion, resultado.doubleValue());
    }

    public static int mostrarMenu () {
        System.out.println(
                "\n\t\tMenu de Operaciones\n"
            +"1. Suma\n"
            +"2. Resta\n"
            +"3. Multiplicación\n"
            +"4. División\n"
            +"5. Potencia (1er ^ 2do)\n"
            +"6. Raíz Cuadrada (raiz del 1er valor)\n"
            +"7. Raíz Cúbica (raiz del 1er valor)\n"
            +"8. Salir del Programa\n"
        );
        System.out.print("Ingrese una opcion: ");
        return sc.nextInt();
    }


    // OPERACIONES MATEMATICAS GENERICAS

    static <T extends Number> double suma(T valor1, T valor2) {
        return (valor1.doubleValue() + valor2.doubleValue());
    }

    static <T extends Number> double resta(T valor1, T valor2) {
        return (valor1.doubleValue() - valor2.doubleValue());
    }

    static <T extends Number> double producto(T valor1, T valor2) {
        return (valor1.doubleValue() * valor2.doubleValue());
    }

    static <T extends Number> double division(T valor1, T valor2) {
        
        if (valor2.doubleValue() == 0) {
            System.out.print("\n| ERROR | No se puede dividir entre 0 |");
            return Double.NaN;
        }

        return (valor1.doubleValue() / valor2.doubleValue());
    }

    static <T extends Number> double potencia(T valor1, T valor2) {
        return (Math.pow(valor1.doubleValue(), valor2.doubleValue()));
    }
    
    static <T extends Number> double raizCua(T valor1) {
        return (Math.sqrt(valor1.doubleValue()));
    }

    static <T extends Number> double raizCub(T valor1) {
        return (Math.cbrt(valor1.doubleValue()));
    }
}
