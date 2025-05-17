public class Propuesto1 {
    public int [] invertirArray (int [] A) {
        if (A.length == 1) {
            return A;
        }

        return A;
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