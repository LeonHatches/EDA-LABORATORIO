package laboratorio05.propuestos.estructuras;

public interface Cola<E> {
    void encolar();
    E desencolar() throws ExceptionIsEmpty;
    void destroyQueue() throws ExceptionIsEmpty;
    boolean isEmpty();
    boolean isFull();
    E front() throws ExceptionIsEmpty;
    E back() throws ExceptionIsEmpty;
    void printQueue();
}
