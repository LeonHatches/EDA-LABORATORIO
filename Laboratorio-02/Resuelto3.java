public class Resuelto3 {
    void imprimir(int x) {
        if (x > 0) {
            System.out.println(x);
            imprimir(x - 1);
        }
    }

    public static void main(String[] ar) {
        Resuelto3 re = new Resuelto3();
        re.imprimir(5);
    }
}