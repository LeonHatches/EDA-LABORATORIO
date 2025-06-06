package laboratorio05.propuestos.ejercicio03;

public class Test {
    public static void main (String [] args) {
        Queue<String> cadenas = new Queue<>(10);
        for (int i = 10 ; i > 0 ; i--)
            cadenas.encolar(""+i);

        cadenas.printQueue();
    }
}