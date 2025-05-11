/*
 * Desarrolla un algoritmo que implemente el Ordenamiento por Inserción,
 * asegurando que en cada paso del bucle el segmento procesado de la lista
 * permanece ordenado (principio de invariante).
 */

public class Problema3 {

    public static void main (String [] args) {

        // Arreglo del 1 al 10 desordenado
        int [] numeros = {7, 10, 6, 2, 9, 8, 1, 3, 5, 4};

        mostrar(numeros);
        insercion(numeros);
        mostrar(numeros);
    }
    

    public static void mostrar (int [] numeros) {
        
        System.out.print("El arreglo con la inserción es: _");

        for (int n : numeros) {
            System.out.print(n + "_");
        }

        System.out.println();
    }


    // ALGORITMO DE INSERCIÓN
    public static void insercion (int [] numeros) {

        int elemento, j;

        // Se itera desde 1 porque se analiza con el anterior.
        for (int i = 1 ; i < numeros.length ; i++) {
            
            elemento = numeros[i];

            // Se analiza el elemento con sus anteriores (j),
            // mientras el anterior sea mayor, seguirá pasando
            // los elementos al siguiente a este elemento
            for (j = i-1 ; j >= 0 && numeros[j] > elemento ; j--)
                numeros[j+1] = numeros[j];
            
            // Cuando el anterior sea menor que el siguiente, se
            // cambiará al elemento a su posición ordenada
            numeros[j+1] = elemento;
        }
    }
}