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
    }
    

    public static void mostrar (int [] numeros) {
        
        System.out.print("El arreglo con la inserción es: _");

        for (int n : numeros) {
            System.out.print(n + "_");
        }
    }


    // ALGORITMO DE INSERCIÓN
    public static void insercion (int [] numeros) {

    }
}