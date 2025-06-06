package laboratorio05.propuestos.ejercicio01;
import laboratorio05.propuestos.estructuras.*;

public class Stack<E> implements Pila<E> {

    private Node<E> tope;
    private int     capacidad;
    private int     cantidad;

    public Stack (int capacidad) {
        tope           = new Node<E>(null);
        this.capacidad = capacidad;
        this.cantidad  = 0;
    }

    @Override
    public void push(E item) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'push'");
    }

    @Override
    public E pop() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'pop'");
    }

    @Override
    public E top() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'top'");
    }

    @Override
    public void destroystak() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'destroystak'");
    }

    @Override
    public boolean isEmpty() {
        return cantidad == 0;
    }

    @Override
    public boolean isFull() {
        return cantidad == capacidad;
    }

    @Override
    public void printStack() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'printStack'");
    }
    
}
