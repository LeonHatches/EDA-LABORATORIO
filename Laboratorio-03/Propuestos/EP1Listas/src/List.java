public class List <T> {
    private Node <T> root;
    private int count;

    public List () {
        this.root = null;
        this.count = 0;
    }

    public int size () {
        return count;
    }
}
