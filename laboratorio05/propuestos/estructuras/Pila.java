package laboratorio05.propuestos.estructuras;

public interface Pila<E> {
    void push(E item);
    E pop();
    E top();
    void destroystak();
    boolean isEmpty();
    boolean isFull();
    void printStack();
}