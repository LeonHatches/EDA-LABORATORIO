package laboratorio05.propuestos.ejercicio01;
import laboratorio05.propuestos.estructuras.*;

public class Stack<E> implements Pila<E> {

    private Node<E> tope;
    private int     capacidad;
    private int     cantidad;

    public Stack (int capacidad) {
        tope           = null;
        this.capacidad = capacidad;
        this.cantidad  = 0;
    }

    @Override
    public void push (E item) {
        if (cantidad < capacidad) {
            Node<E> nuevo = new Node<E>(item, this.tope);
            tope = nuevo;
            ++cantidad;
        }
    }

    @Override
    public E pop () throws ExceptionIsEmpty {
        if (isEmpty())
            throw new ExceptionIsEmpty("La pila está vacia...");
        
        Node<E> pop = tope;
        tope = tope.getNext();
        --cantidad;
        return pop.getData();
    }

    @Override
    public E top () throws ExceptionIsEmpty {
        if (isEmpty())
            throw new ExceptionIsEmpty("La pila está vacía...");
        
        return tope.getData();
    }

    @Override
    public void destroystak () throws ExceptionIsEmpty {
        if (isEmpty())
            throw new ExceptionIsEmpty("La pila está vacía...");
        
        tope = null;
        cantidad = 0;
    }

    @Override
    public boolean isEmpty () {
        return cantidad == 0;
    }

    @Override
    public boolean isFull () {
        return cantidad == capacidad;
    }

    @Override
    public void printStack () {
        String str = "";
        Node<E> copy = tope;

        while (copy != null) {
            str += copy.getData() + " ";
            copy = copy.getNext();
        }

        System.out.println(str);
    }
    
}
