import java.util.Scanner;

public class Propuesto1 {   

    public int [] invertirArray (int [] A) {
         
        if (A.length < 2)               // Caso Base: cuando sea Arreglo unitario o de 0
            return A;
        
        int [] Asalida   = new int [A.length];
        int [] recursion = new int [A.length - 2];                  // En dado caso sea 0, se hace arreglo vacío

        // Invierten posiciones
        Asalida[0] = A[A.length - 1];
        Asalida[Asalida.length - 1] = A[0];

        // Se asignan los valores aun no invertidos a enviar de nuevo
        for (int i = 0 ; i < recursion.length ; i++)
            recursion[i] = A[i+1];

        // Se recibe el arreglo invertido
        int [] invertido = invertirArray(recursion);                // Dado caso 0, regresa arreglo vacío

        // Se agregan los invertidos al arreglo de salida
        for (int i = 1 ; i < Asalida.length - 1 ; i++)              // Caso 0, length es 1 y no cumple condición
            Asalida[i] = invertido[i-1];
        return Asalida;
    }

    public static void main (String [] args) {
        
        Scanner sc = new Scanner(System.in);
        Propuesto1 re = new Propuesto1();

        System.out.print("Ingrese tamaño del arreglo (mayor a 0): ");
        int [] arreglo = new int [sc.nextInt()];

        // INGRESAR
        for (int i = 0 ; i < arreglo.length ; i++) {
            System.out.print ("Ingrese número: ");
            arreglo[i] = sc.nextInt();
        }

        // MOSTRAR
        for (int i : arreglo)
            System.out.print (i+" ");
        System.out.println();
        
        // INVERTIR
        int [] arregloInv = re.invertirArray(arreglo);

        // MOSTRAR
        for (int i : arregloInv) {
            System.out.print (i+" ");
        }

        sc.close();
    }
}