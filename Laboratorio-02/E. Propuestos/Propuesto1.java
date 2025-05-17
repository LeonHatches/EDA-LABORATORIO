import java.util.Scanner;

public class Propuesto1 {   

    public int [] invertirArray (int [] A) {
         
        if (A.length < 2)
            return A;
        
        int [] Asalida   = new int [A.length];
        int [] recursion = new int [A.length - 2];

        Asalida[0] = A[A.length - 1];
        Asalida[Asalida.length - 1] = A[0];

        for (int i = 0 ; i < recursion.length ; i++)
            recursion[i] = A[i+1];

        int [] invertido = invertirArray(recursion);

        for (int i = 1 ; i < Asalida.length - 1 ; i++)
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