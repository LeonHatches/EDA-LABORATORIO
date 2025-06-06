package laboratorio05.propuestos.ejercicio01;

import laboratorio05.propuestos.estructuras.ExceptionIsEmpty;

public class Test {
    public static void main (String [] args) {
        Stack<String> cadenas = new Stack<>(10);
        try {
            
            for (int i = 10 ; i > 0 ; i--)
                cadenas.push(""+i);

            cadenas.printStack();

        }catch(ExceptionIsEmpty e) {
			System.out.println(e.getMessage());
		}
    }
}
