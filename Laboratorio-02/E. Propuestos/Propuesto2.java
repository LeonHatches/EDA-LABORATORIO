public class Propuesto2 {
    
    public int [] rotarIzquierdaArray (int [] A, int d) {
        
        /* CASO BASE: Va constar de un arreglo de los
         * elementos que no se rotan SI es que el
         * tamaño del arreglo y el d son iguales
        */

        /* En otro caso, se va crea el Ainvertido según
         * el tamaño de A que recibe, luego se asigna al
         * indice 0 el elemento de posición "d", para
         * después enviar un arreglo de 1 a length para
         * iniciar la recursión.
         * Al final solo se asignan los valores al
         * arreglo a mostrar.
         */
        int [] Ainvertido = new int [A.length];
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