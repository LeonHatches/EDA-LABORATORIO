package laboratorio05.propuestos.ejercicio03;
import laboratorio05.propuestos.estructuras.*;

public class Queue<E> implements Cola<E> {
    private Node<E> first;
    private Node<E> last;
    private int capacidad;
    private int cantidad;

    public Queue (int capacidad) {
        this.first     = null;
        this.last      = null;
        this.capacidad = capacidad;
        this.cantidad  = 0;
    }

    @Override
    public void encolar (E element) {    
        if (!isFull()) {
            Node<E> nuevo = new Node<E>(element);

            if (isEmpty())
                first = nuevo;
            else
                last.setNext(nuevo);
            
            last = nuevo;
            ++cantidad;
        }
    }

    @Override
    public E desencolar () throws ExceptionIsEmpty {
        if (isEmpty())
            throw new ExceptionIsEmpty("La Cola está vacía...");
        
        E data = first.getData();
        first  = first.getNext();
        --cantidad;

        if (first == null)
            last = null;
        
        return data;
    }

    @Override
    public void destroyQueue() throws ExceptionIsEmpty {
        if (isEmpty())
            throw new ExceptionIsEmpty("La Cola está vacía...");
        
        this.first    = null;
        this.last     = null;
        this.cantidad = 0;
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
    public E front() throws ExceptionIsEmpty {
        if (isEmpty())
            throw new ExceptionIsEmpty("La Cola está vacía...");
        
        return first.getData();
    }

    @Override
    public E back() throws ExceptionIsEmpty {
        if (isEmpty())
            throw new ExceptionIsEmpty("La Cola está vacía...");
        
        return last.getData();
    }

    @Override
    public void printQueue() {
        String str = "";
        Node<E> aux = first;

        for (int i = 0 ; i < cantidad ; i++) {
            str += aux + " ";
            aux = aux.getNext();
        }

        System.out.println(str);
    }
    
}
