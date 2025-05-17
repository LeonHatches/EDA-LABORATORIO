public class Propuesto1 {
    
    public int [] invertirArray (int [] A) {
        
        int Asalida [] = new int [A.length];
        
        if (A.length < 3) { 
            
            if (A.length == 1) {
                return A;
            }

            Asalida[0] = A[A.length - 1];
            Asalida[Asalida.length - 1] = A[0];
            return Asalida;
        }
        
        int [] recursion = new int [A.length - 2];

        Asalida[0] = A[A.length - 1];
        Asalida[Asalida.length - 1] = A[0];

        for (int i = 0 ; i < recursion.length ; i++) {
            recursion[i] = A[i+1];
        }

        int [] invertido = invertirArray(recursion);

        for (int i = 1 ; i < Asalida.length - 1 ; i++) {
            Asalida[i] = invertido[i-1];
        }
        
        return Asalida;
    }

    
    public static void main (String [] args) {
        
        int [] arreglo = {11, 7, 5, 9, 12, 6, 10};
        Propuesto1 re = new Propuesto1();

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
    }
}