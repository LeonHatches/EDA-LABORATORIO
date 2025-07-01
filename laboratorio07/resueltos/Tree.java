package laboratorio07.resueltos;

public interface Tree <T extends Comparable<T>> {
    void destroy ();
    boolean isEmpty ();
    void insert (T data) throws ItemDuplicated;
    void remove (T data) throws ItemNotFound;
    T search (T data) throws ItemNotFound;
    T min () throws ExceptionIsEmpty;
    T max () throws ExceptionIsEmpty;
    T predecesor (T data) throws ItemNotFound;
    T sucesor (T data) throws ItemNotFound;
    String preOrden ();
    String inOrden ();
    String postOrden ();
}

