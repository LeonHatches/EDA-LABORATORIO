public class Test {
    public static void main(String[] args) {
        List<Integer> lista = new List<>();

        // Size
        System.out.println(lista.size());
        
        // isEmpty
        System.out.println(lista.isEmpty());

        // add
        lista.add(0); lista.add(1);

        // get
        System.out.println(lista.get(0)+" _ "+lista.get(1));
    }
}
