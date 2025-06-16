package ejercicio03;
import org.graphstream.graph.*;
import org.graphstream.graph.implementations.*;
import estructuras.Node;
import estructuras.BST;
import estructuras.ExceptionIsEmpty;

public class BSTViewer<T extends Comparable<T>> extends BST<T>{
    private Graph graph;

    public BSTViewer() {
        super();
        graph = new SingleGraph("BST");
        System.setProperty("org.graphstream.ui", "swing");
    }

    public void graphTree () throws ExceptionIsEmpty {
        graphTree(getRoot(), graph, null);
        graph.display();
    }

    private void graphTree (Node<T> actual, Graph graph, String fatherId) {
        
        if (actual != null) {

            String actualId = actual.getData().toString();
            graph.addNode(actualId).setAttribute("ui.label", actualId);
            
            if (fatherId != null)
                graph.addEdge(fatherId + "-" + actualId, fatherId, actualId);

            graphTree(actual.getLeft(), graph, fatherId);
            graphTree(actual.getRight(), graph, fatherId);
        }
    }
}

