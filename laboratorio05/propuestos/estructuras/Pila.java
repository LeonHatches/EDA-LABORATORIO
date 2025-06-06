package laboratorio05.propuestos.estructuras;

public interface Pila<E> {
    void push(E item);
    E pop() throws ExceptionIsEmpty;
    E top() throws ExceptionIsEmpty;
    void destroystak() throws ExceptionIsEmpty;
    boolean isEmpty();
    boolean isFull();
    void printStack();
}