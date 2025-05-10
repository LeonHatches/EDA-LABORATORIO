/* 
 * Desarrolla un programa en Java que implemente un sistema de gestión de
 * calificaciones de estudiantes. El programa debe permitir al usuario ingresar
 * las calificaciones de N estudiantes y calcular la mediana, moda y desviació
 * estándar.
 */

import java.util.Scanner;


public class Problema1 {
    static Scanner sc = new Scanner (System.in);
    public static void main (String [] args) {

        int cantidad, moda = 0, notas [];
        double mediana, desviacion = 0;

        System.out.println("| CALIFICADOR DE ESTUDIANTES |");
        cantidad = ingresarCantidad();
        
        // Se crea un arreglo para guardar las notas
        notas = new int [cantidad];
        
        // Todo el trabajo con el arreglo
        ingresarNotas(notas);
        mediana = hallarMediana(notas);

        // Se muestran los datos
        System.out.println(
            "\n| RESULTADOS |:"+
            "\nMediana: " + mediana +
            "\nModa: "  + moda +
            "\nDesviación: " + desviacion
        );

        sc.close();
    }

    public static void mostrar(int notas []) {
        for (int n : notas) {
            System.out.println(n);
        }
    }

    public static int ingresarCantidad () {
        
        int cantidad;

        // Un do-while para garantizar la cantidad correcta
        do {
            System.out.print  ("Ingrese la cantidad de alumnos: ");
            cantidad = sc.nextInt();
            
            if (cantidad < 1)
                System.out.println("ERROR: Ingrese una cantidad correcta.");
        
        } while (cantidad < 1);

        return cantidad;
    }
    

    public static void ingresarNotas (int [] notas) {
        
        int nota, i = 0;

        // Ingresa y verifica la nota en un sistema vigesimal
        while (i < notas.length) {
            System.out.print("Ingrese la nota: ");
            nota = sc.nextInt();

            if (nota < 0 || nota > 20) {
                System.out.println("Ingrese nota válida.");
            
            } else {
                notas[i] = nota;
                i++;
            }
        }
    }

    
    public static double hallarMediana (int [] notas) {
        
        double resultado;
        int mitad;
        
        ordenar(notas);
        
        if (notas.length == 1)
            return notas[0];
        
        // Si tiene elementos par, entonces la mediana será
        // de dos elementos, en otro caso, es de uno.
        mitad = notas.length/2;

        if (notas.length % 2 == 0)
            resultado = (notas[mitad] + notas[mitad-1])/2.0;
        else
            resultado = notas[mitad];
        
        return resultado;
    }


    public static void ordenar (int [] notas) {
        
        int maximo = notas.length - 1, temporal;

        for (int i = 0 ; i < maximo ; i++) {
            for (int j = 0 ; j < maximo - i; j++) {
                
                if (notas[j] > notas[j+1]) {            
                    
                    temporal   = notas[j];
                    notas[j]   = notas[j+1];
                    notas[j+1] = temporal;

                }
            }
        }
    }


    public static int hallarModa (int [] notas) {
        return 0;
    }

    public static double hallarDesviacion (int [] notas) {
        return 0;
    }

    public static double hallarPromedio (int [] notas) {
        return 0;
    }
}