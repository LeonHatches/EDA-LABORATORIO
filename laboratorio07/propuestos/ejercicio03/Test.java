package propuestos.ejercicio03;

public class Test {
    public static void main(String[] args) {
        AVLview<Integer> numeros = new AVLview<>();
        int [] elementos = {100, 200, 300, 400, 500, 50, 25, 350, 375,
                            360, 355, 150, 175, 120, 190};

        try {
            for(int i = 0 ; i < elementos.length ; i++) {
                numeros.insert(elementos[i]);
                numeros.graphTree();
                Thread.sleep(4000);
            }

            // Mostrar
            numeros.graphTree();

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}