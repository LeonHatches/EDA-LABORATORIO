public class Resuelto4 {
    void imprimir(int x) {
        if (x > 0) {
            imprimir(x - 1);
            System.out.println(x);
        }
    }

    public static void main(String[] ar) {
        Resuelto4 re = new Resuelto4();
        re.imprimir(5);
    }
}