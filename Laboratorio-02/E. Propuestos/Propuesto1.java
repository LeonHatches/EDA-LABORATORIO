public class Propuesto1 {
    
    public int [] invertirArray (int [] A) {
        
        int Asalida [] = new int [A.length];
        
        if (false) {
            /* Se implementa una base que sea en dos casos, con un arreglo de tamaño 1 y 2.
             * En dado caso sea 1, se devolverá el arreglo unitario.
             * En dado caso sea 2, se devolverá el arreglo con elementos intercambiados.
            */
            return A;
        }
        
        /* En esta parte, se harán varios procesos.
         * Primero, se crea un arreglo de RECURSIÓN (Diferente al de Salida)
         * Segundo, se colocan (el primero en el último y viceversa) en el arreglo de SALIDA.
         * Tercero, se usa un for para preparar el arreglo de RECURSIÓN sin los anteriores datos (0, length - 1)
         * Cuarto, se usa el arreglo RECIBIDO para añadirlo al arreglo de SALIDA
         * Quinto, se envia.
        */

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