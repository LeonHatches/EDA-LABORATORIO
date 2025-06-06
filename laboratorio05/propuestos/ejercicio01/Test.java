package laboratorio05.propuestos.ejercicio01;

public class Test {
    public static void main (String [] args) {
        Stack<String> cadenas = new Stack<>(10);
        for (int i = 10 ; i > 0 ; i--)
            cadenas.push(""+i);

        cadenas.printStack();
    }
}
