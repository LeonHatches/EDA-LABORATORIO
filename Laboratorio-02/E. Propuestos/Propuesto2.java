public class Propuesto2 {
    
    public int [] rotarIzquierdaArray (int [] A, int d) {
        
        if (A.length == d)
            return A;
        
        int [] Ainvertido = new int [A.length];
        int [] recursivo  = new int [A.length - 1];

        Ainvertido[0] = A[d];

        for (int i = 1 ; i < recursivo.length ; i++)
            recursivo[i-1] = A[i];
        
        int [] rotado = rotarIzquierdaArray(recursivo, d);

        for (int i = 1 ; i < Ainvertido.length ; i++)
            Ainvertido[i] = rotado[i-1];
        
        return Ainvertido;
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