package laboratorio05.propuestos.estructuras;

public interface Cola<E> {
    void encolar();
    E desencolar();
    void destroyQueue();
    boolean isEmpty();
    boolean isFull();
    E front();
    E back();
    void printQueue();
}
