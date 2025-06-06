package laboratorio05.propuestos.ejercicio03;
import laboratorio05.propuestos.estructuras.*;
public class Queue<E> implements Cola<E> {
    private Node<E> first;
    private Node<E> last;
    private int capacidad;
    private int cantidad;

    public Queue (int capacidad) {
        this.first = null;
        this.last = null;
        this.capacidad = capacidad;
        this.cantidad = 0;
    }

    @Override
    public void encolar (E element) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'encolar'");
    }

    @Override
    public E desencolar () throws ExceptionIsEmpty {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'desencolar'");
    }

    @Override
    public void destroyQueue() throws ExceptionIsEmpty {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'destroyQueue'");
    }

    @Override
    public boolean isEmpty() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'isEmpty'");
    }

    @Override
    public boolean isFull() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'isFull'");
    }

    @Override
    public E front() throws ExceptionIsEmpty {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'front'");
    }

    @Override
    public E back() throws ExceptionIsEmpty {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'back'");
    }

    @Override
    public void printQueue() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'printQueue'");
    }
    
}
