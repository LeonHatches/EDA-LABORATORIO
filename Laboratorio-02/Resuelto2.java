public class Resuelto2 {
    void imprimir(int x) {
        System.out.println(x);
        imprimir(x - 1);
    }

    public static void main(String[] ar) {
        Resuelto2 re = new Resuelto2();
        re.imprimir(5);
    }
}