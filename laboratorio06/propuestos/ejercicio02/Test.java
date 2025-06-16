package laboratorio06.propuestos.ejercicio02;

import java.util.Scanner;
import laboratorio06.propuestos.estructuras.*;

public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BST<String> arbol = new BST<>();
        String palabra = "";

        System.out.println("| ÁRBOL DE PALABRAS | Escriba 'Exit' para Salir |");
        do {
            try {

                System.out.print ("| Ingrese palabra | : ");
                palabra = sc.next();
                if (!palabra.equals("Exit") && !palabra.equals("")) {
                    arbol.insert(palabra);
                    System.out.println("Palabras: " + arbol.inOrden());
                }

            } catch (Exception e) {
                System.out.println(e.getMessage());
                sc.nextLine();
            }

        } while (!palabra.equals("Exit"));
        sc.close();
    }
}

