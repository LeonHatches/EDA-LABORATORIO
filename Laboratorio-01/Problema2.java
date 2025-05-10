/* 
 * Implementa un programa en Java que encuentre todos los números primos en un
 * rango definido por el usuario utilizando el algoritmo de la Criba de
 * Eratóstenes.
 */

import java.util.Scanner;


public class Problema2 {
    static Scanner sc = new Scanner(System.in);

    public static void main (String [] args) {
        
        boolean prueba [] = {true, true, false, false, true, false};
        mostrar(prueba);

    }


    public static void mostrar ( boolean numeros []) {    
        System.out.print ("_");

        for (int i = 2 ; i < numeros.length ; i++) {
            if (!numeros[i])
                System.out.print (i+"_");
        }
    }
}
