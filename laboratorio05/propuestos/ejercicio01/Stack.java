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
    public void push (E item) {
        if (cantidad <= capacidad) {
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
    public E top() throws ExceptionIsEmpty {
        if (isEmpty())
            throw new ExceptionIsEmpty("La pila está vacía...");
        
        return tope.getData();
    }

    @Override
    public void destroystak() throws ExceptionIsEmpty {
        if (isEmpty())
            throw new ExceptionIsEmpty("La pila está vacía...");
        
        for (int i = 0 ; i < cantidad ; i++)
            this.pop();
        
        cantidad = 0;
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
    public void printStack() throws ExceptionIsEmpty {
        String str = "";
        Stack<E> copy = this;

        if (copy.isEmpty())
            throw new ExceptionIsEmpty("La pila está vacía...");

        while (!copy.isEmpty()) {
            str += copy.top() + " ";
            copy.pop();
        }

        System.out.println(str);
    }
    
}
