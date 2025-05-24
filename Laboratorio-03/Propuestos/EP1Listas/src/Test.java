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

        // isEmpty
        System.out.println(lista.isEmpty());

        // Size
        System.out.println(lista.size());

        // clear
        lista.clear();
        System.out.println(lista.isEmpty());
        System.out.println(lista.size());

        // add con index
        lista.add(0); lista.add(2);
        lista.add(1, 1);
        lista.add(0, -1);
        System.out.println(lista.get(0)+" _ "+lista.get(2));

        // remove
        lista.remove(0);
        System.out.println(lista.get(0));

        // remove (T o)
        lista.add(1, 9);
        System.out.println(lista.get(1));
        lista.remove(Integer.valueOf(9));
        System.out.println(lista.get(1));

        // indexOf
        lista.add(13);
        System.out.println("IndexOf: "+lista.indexOf(13));
    }
}
