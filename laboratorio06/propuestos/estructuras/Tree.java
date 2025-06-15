package laboratorio06.propuestos.estructuras;

public interface Tree <T extends Comparable<T>> {
    void destroy ();
    boolean isEmpty ();
    void insert (T data) throws ItemDuplicated;
    T search (T data) throws ItemNotFound;
    T min () throws ExceptionIsEmpty;
    T max () throws ExceptionIsEmpty;
    T predecesor (T data) throws ItemNotFound;
    T sucesor (T data) throws ItemNotFound;
    void preOrden ();
    void inOrden ();
    void postOrden ();
}

