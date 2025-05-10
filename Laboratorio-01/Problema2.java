/* 
 * Implementa un programa en Java que encuentre todos los números primos en un
 * rango definido por el usuario utilizando el algoritmo de la Criba de
 * Eratóstenes.
 */

import java.util.Scanner;


public class Problema2 {
    static Scanner sc = new Scanner(System.in);

    public static void main (String [] args) {
        
        int rango;
        boolean numeros [];

        System.out.println("| CRIBA DE ERATOSTENES |");
        rango = ingresarRango();

        // Se crea un arreglo en donde se marcarán "false"
        // a los números primos y "true" a compuestos
        numeros = new boolean [rango + 1];

        for (int i = 2 ; i*i < numeros.length ; i++) {
            
            if (!numeros[i]) {

                for (int j = i ; i*j < numeros.length ; j++)
                    numeros[i*j] = true;

            }
        }

        mostrar(numeros);
    }


    public static void mostrar ( boolean numeros []) {    
        System.out.print ("Los primos son: _");

        for (int i = 2 ; i < numeros.length ; i++) {
            if (!numeros[i])
                System.out.print (i+"_");
        }
    }


    public static int ingresarRango () {
        
        int rango;

        // Un do-while para garantizar el rango correcta
        do {
            System.out.print ("Ingrese un rango límite (número): ");
            rango = sc.nextInt();
            
            if (rango < 2)
                System.out.println("ERROR: Ingrese un rango correcto.");
        
        } while (rango < 2);

        return rango;
    }
}