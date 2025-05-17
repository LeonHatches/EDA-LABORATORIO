public class Propuesto2 {
    
    public int [] rotarIzquierdaArray (int [] A, int d) {
        
        // CASO BASE
        if (A.length == d)
            return A;
        
        int [] Ainvertido = new int [A.length];
        int [] recursivo  = new int [A.length - 1];

        // Se coloca el elemento posición "d"
        Ainvertido[0] = A[d];

        // Se copian los elementos menos "d"
        int j = 0;
        for (int i = 0 ; i < A.length ; i++) {
            
            if (i == d)
                continue;
            
            recursivo[j] = A[i];
            j++;
        }
        
        // Invocación recursiva
        int [] rotado = rotarIzquierdaArray(recursivo, d);

        // Se colocan los elementos rotados para mostrar
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
        int [] rotado = re.rotarIzquierdaArray(arreglo, 3);

        // MOSTRAR
        for (int i : rotado) {
            System.out.print (i+" ");
        }
    }
}