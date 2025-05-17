public class Propuesto2 {
    
    public int [] rotarIzquierdaArray (int [] A, int d) {
        return A;
    }

    public static void main (String [] args) {
        Propuesto2 re = new Propuesto2();
        int [] arreglo = {1, 2, 3, 4, 5, 6};

        // MOSTRAR
        for (int i : arreglo)
            System.out.print (i+" ");
        System.out.println();

        // ROTAR
        int [] rotado = re.rotarIzquierdaArray(arreglo, 2);

        // MOSTRAR
        for (int i : rotado) {
            System.out.print (i+" ");
        }
    }
}