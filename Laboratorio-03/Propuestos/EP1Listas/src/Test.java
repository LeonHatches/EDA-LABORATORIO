public class Test {
    public static void main(String[] args) {
        List<Integer> lista = new List<>();
        List<Integer> otra = new List<>();

        // add
        lista.add(0); lista.add(1);

        // get
        System.out.println("add y get: "+lista.get(0)+" _ "+lista.get(1));

        // isEmpty
        System.out.println("isEmpty: "+lista.isEmpty());

        // Size
        System.out.println("Size: "+lista.size());

        // clear
        lista.clear();
        System.out.println(lista.isEmpty());
        System.out.println("Clear: "+lista.size());

        // add con index
        lista.add(0); lista.add(2);
        lista.add(1, 1);
        lista.add(0, -1);
        System.out.println("Add con Index: "+lista.get(0)+" _ "+lista.get(2));

        // remove
        lista.remove(0);
        System.out.println("Remove: "+lista.get(0));

        // remove (T o)
        lista.add(1, 9);
        System.out.println(lista.get(1));
        lista.remove(Integer.valueOf(9));
        System.out.println("Remove(T o): "+lista.get(1));

        // indexOf
        lista.add(13);
        System.out.println("IndexOf: "+lista.indexOf(13));

        // lastIndexOf
        lista.add(13);
        System.out.println("IndexOf: "+lista.indexOf(13));
        System.out.println("LastIndexOf: "+lista.lastIndexOf(13));

        // contains
        System.out.println("Contains: "+lista.contains(13));

        // removeAll
        otra.add(13);
        otra.add(9);
        lista.add(9);
        lista.removeAll(otra);
        System.out.println("RemoveAll: "+lista.contains(13)+" _ "+lista.contains(9));

        // set
        lista.clear();
        lista.add(11); lista.add(12); lista.add(13);
        lista.set(1, 14);
        System.out.println("Set: "+lista.get(1));

        // addAll
        otra.clear();
        otra.add(15); otra.add(16);
        lista.addAll(otra);
        System.out.println("addAll: "+lista.get(3)+" _ "+lista.get(4));
    }
}
