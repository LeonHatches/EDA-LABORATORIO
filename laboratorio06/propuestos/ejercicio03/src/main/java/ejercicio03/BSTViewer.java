package ejercicio03;
import org.graphstream.graph.*;
import org.graphstream.graph.implementations.*;
import estructuras.*;

public class BSTViewer<T extends Comparable<T>> extends BST<T>{
    private Graph graph;

    public BSTViewer() {
        super();
        graph = new SingleGraph("BST");
        System.setProperty("org.graphstream.ui", "swing");
    }

    public void graphTree () throws ExceptionIsEmpty {

    }
}
